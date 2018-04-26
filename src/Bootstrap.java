
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
    data.save();
    IDomain domain = DomainFacade.getInstance();
    domain.inject(data);
    GUI.initialize(args, domain);
  }
}
