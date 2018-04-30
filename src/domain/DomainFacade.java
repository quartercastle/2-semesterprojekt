/*
 *Facade class for cmmunicating wth the domain layer
 */
package domain;

import acq.ICase;
import acq.IData;
import acq.IDomain;

public class DomainFacade implements IDomain {

  /**
   * Instance of the class itself, used for singleton setup. Is set to null
   * initially, instantiated if needed though getInstance()
   */
  public static DomainFacade df;

  /**
   * Reference to the data layer
   */
  private IData data;

  /**
   * Disable normal instantiation
   */
  private DomainFacade() {
  }

  /**
   * Singleton setup for DomainFacade, returns instance of the class if none has
   * been made. If one has been made, returns that created instance
   *
   * @return Singleton instanse of DomainFacade
   */
  public static DomainFacade getInstance() {
    if (df == null) {
      df = new DomainFacade();
    }
    return df;
  }

  /**
   * Inject data layer
   *
   * @param data
   */
  @Override
  public void inject(IData data) {
    this.data = data;
  }

  /**
   * Verify the login
   *
   * @param username
   * @param password
   * @return true if ok
   */
  @Override
  public boolean verify(String username, String password) {
    return AuthManager.verify(username, password);
  }

  /**
   * Creates new case
   *
   * @return Case
   */
  @Override
  public Case createCase() {
    return new Case();

  }
}
