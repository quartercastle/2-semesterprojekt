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

    IDomain domain = DomainFacade.getInstance();
    domain.inject(data);
    GUI.initialize(args, domain);
  }
}
