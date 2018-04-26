package acq;

public interface IGUI {

  /**
   * Inject domain
   *
   * @param domain
   */
  void inject(IDomain domain);

  /**
   * This method starts the javafx thread
   *
   * @param args
   * @param d the domain
   */
  static void initialize(String[] args, IDomain d){};
}
