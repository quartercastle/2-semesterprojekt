
import acq.IData;
import acq.IDomain;
import acq.ServiceUnit;
import data.DataFacade;
import data.model.DataAddress;
import data.model.DataCaseWorker;
import data.model.DataCompany;
import data.model.DataEffort;
import data.model.DataOffer;
import data.model.DataParagraph;
import data.model.DataRole;
import data.model.DataService;
import data.model.DataUser;
import domain.DomainFacade;
import domain.system.CaseWorker;
import gui.GUI;
import java.util.GregorianCalendar;
import javafx.scene.effect.Effect;
import util.Mapper;

public class Bootstrap {

  /**
   * Boot application
   *
   * @param args
   */
  public static void main(String[] args) {
    IData data = DataFacade.getInstance();
    IDomain domain = DomainFacade.getInstance();
    domain.inject(data);

    //DataEffort e = new DataEffort(42, new GregorianCalendar(), new GregorianCalendar(), new DataCompany("com", new DataAddress("prim", "sec", "zip", "city", "country")));
    //e.setService(new DataService("Service", "Bob er syg", 1, ServiceUnit.Daily, 42, 12));
    //e.setOffer(new DataOffer("of", 42, "afksdf"));
    //e.setParagraph(new DataParagraph(23, "ddfdsg", "affskgjsj klakla1"));
    //e.setParagraph(new DataParagraph(23, "ddfdsg", "affskgjsj klakla2"));
    //e.setParagraph(new DataParagraph(23, "ddfdsg", "affskgjsj klakla3"));
    //e.setParagraph(new DataParagraph(23, "ddfdsg", "affskgjsj klakla4"));
    //e.save();
    DataEffort e = DataEffort.find(2);
    System.out.println("ee " + e);

    Effect ef = Mapper.map(e, false);

    GUI.initialize(args, domain);
  }
}
