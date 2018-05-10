package acq;

import java.util.Collection;

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
   *
   * @return citizen
   */
  ICitizen createCitizen();

  /**
   * Create a new IAddress
   *
   * @return address
   */
  IAddress createAddress();

  /**
   * Add the cases to collection
   *
   * @param c
   */
  public void addCase(ICase c);

  /**
   * Get the list of cases saved in the database
   *
   * @return list of cases saved in persistence system
   */
  public Collection<ICase> getCaseList();

}
