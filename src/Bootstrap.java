
import acq.IData;
import acq.IDomain;
import data.DataFacade;
import data.model.DataAddress;
import data.model.DataCaseWorker;
import data.model.DataRole;
import data.model.DataUser;
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

    DataCaseWorker caseWorker = new DataCaseWorker("IB", "Hans", "Bob", new DataAddress(null, null, null, null, null), "23232323", "bob@test.dk");
    caseWorker.setUser(new DataUser("User", "pass", new DataRole("Caseworker", true, true, true, true), true));
    caseWorker.save();
    System.out.println("WAS HERE");

    IDomain domain = DomainFacade.getInstance();
    domain.inject(data);
    GUI.initialize(args, domain);
  }
}
