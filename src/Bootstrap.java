
import acq.IData;
import acq.IDomain;
import acq.IGUI;
import data.DataFacade;
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
    //IGUI gui = GUI.getInstance();
    domain.inject(data);
    //gui.inject(domain);
    //gui.initialize(args);
    GUI.initialize(args, domain);
  }
}
