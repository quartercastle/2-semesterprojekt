
import acq.IData;
import acq.IDomain;
import data.DataFacade;
import data.model.DataService;
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
    DataService service = DataService.find(1);
    service.setDescription("fisse");
    service.save();
    IDomain domain = DomainFacade.getInstance();
    domain.inject(data);
    GUI.initialize(args, domain);
  }
}
