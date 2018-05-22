
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
    IDomain domain = DomainFacade.getInstance();
    domain.inject(data);
    GUI.initialize(args, domain);
  }
}
