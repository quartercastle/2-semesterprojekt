/*
 *Facade class for cmmunicating wth the domain layer
 */
package domain;

import acq.IDomain;

public class DomainFacade implements IDomain {

  /**
   * Instance of the class itself, used for singleton setup. Is set to null
   * initially, instantiated if needed though getInstance()
   */
  public static DomainFacade df;

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
