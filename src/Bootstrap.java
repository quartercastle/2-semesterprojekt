
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
import domain.system.Effort;
import gui.GUI;
import java.util.GregorianCalendar;
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
    GUI.initialize(args, domain);
  }
}
