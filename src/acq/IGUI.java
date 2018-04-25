package acq;

public interface IGUI {

  /**
   * Ibject domain
   *
   * @param domain
   */
  public void inject(IDomain domain);

  /**
   * Start the javafx thread
   *
   * @param args
   */
  public void initialize(String[] args);
}
