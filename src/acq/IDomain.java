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
   * @return ICase
   */
  ICase createCase();

  /**
   * Create a new ICitizen
   * @return citizen
   */
  ICitizen createCitizen();

  /**
   * Create a new IAddress
   * @return address
   */
  IAddress createAddress();

}
