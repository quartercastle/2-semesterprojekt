package domain.system;

import acq.IAddress;
import acq.IUser;

/**
 *
 * CaseWorker class that extends Person
 */
public class CaseWorker extends Person {

  /**
   * Create IUser
   */
  private IUser user;

  /**
   * Constructor for Caseworker
   *
   * @param firstName
   * @param middleName
   * @param lastName
   * @param address
   * @param phone
   * @param email
   */
  public CaseWorker(String firstName, String middleName, String lastName, IAddress address, String phone, String email) {
    super(firstName, middleName, lastName, address, phone, email);
  }

  /**
   * Getter for the user from IUser.
   *
   * @return user;
   */
  public IUser getUser() {
    return user;
  }

  /**
   * Setter for the user.
   *
   * @param user
   */
  public void setUser(IUser user) {
    this.user = user;
  }

  public Case createCase() {
    // TODO validate priviliges and finish implementation
    return new Case(null, null);
  }

}
