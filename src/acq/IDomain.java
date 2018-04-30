package acq;

public interface IDomain {

  /**
   * Inject data
   *
   * @param data
   */
  void inject(IData data);

  /**
   * Verify login
   *
   * @param username
   * @param password
   * @return true if ok
   */
  boolean verify(String username, String password);

  /**
   * Creats ICase
   *
   * @return
   */
  ICase createCase();

}
