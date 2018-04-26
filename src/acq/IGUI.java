package acq;

public interface IGUI {

  /**
   * Inject domain
   *
   * @param domain
   */
  public void inject(IDomain domain);

  /**
   * This method starts the javafx thread
   *
   * @param args
   * @param d the domain
   */
  public static void initialize(String[] args, IDomain d) {
  }
;
}
