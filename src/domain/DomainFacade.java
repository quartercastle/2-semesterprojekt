/*
 *Facade class for cmmunicating wth the domain layer
 */
package domain;

import acq.IDatabase;
import acq.IDomain;

public class DomainFacade implements IDomain {

  /**
   * Instance of the class itself, used for singleton setup. Is set to null
   * initially, instantiated if needed though getInstance()
   */
  public static DomainFacade df = null;

  public DomainFacade() {

  }

  @Override
  public void injectData(IDatabase idb) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

}
