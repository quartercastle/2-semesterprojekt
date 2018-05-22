
import acq.IData;
import acq.IDomain;
import data.DataFacade;
import data.model.DataAddress;
import data.model.DataCase;
import data.model.DataCaseWorker;
import data.model.DataCitizen;
import domain.DomainFacade;
import gui.GUI;

public class Bootstrap {

  /**
   * Boot application
   *
   * @param args
   */
  public static void main(String[] args) {
    IData data = DataFacade.getInstance();
    data.initialize();
    IDomain domain = DomainFacade.getInstance();
    domain.inject(data);
    GUI.initialize(args, domain);

//    DataCase dc = new DataCase(new DataCaseWorker("john", "john", "john", new DataAddress("hejvej", "6000000", "5000 Odense C baybay", "Herning", "Djibouti"), "12345678", "givmigenøllefar"),
//            new DataCitizen("yo", "yoyo", "yoyoyo", new DataAddress("rfewkofijwvej", "5670", "7183 Randbøldal C baybay", "Lazy Town", "Kazakstan"), "kunne du li'' at vide hva'", "hej@hej@hej.dj", "123456-1234"), null);
//    dc.setCircumstance("Han drikker sgu for mange bajere");
//    dc.setGrocerySupport(true);
    DataCase dc = DataCase.find(1);
    dc.setCircumstance("Nu er den sgu gal igen med ham og de bajere");
    dc.save();
  }
}
