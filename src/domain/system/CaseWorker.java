package domain.system;

import acq.IAddress;
import acq.ICaseWorker;
import acq.IUser;

/**
 *
 * CaseWorker class that extends Person
 */
public class CaseWorker extends Person implements ICaseWorker {

  /**
   * Create IUser
   */
  private IUser user;

  /**
   * Caseworker id
   */
  private int id;

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
    this.id = 0;
  }

  /**
   * Getter for the user from IUser.
   *
   * @return user;
   */
  @Override
  public IUser getUser() {
    return user;
  }

  /**
   * Setter for the user.
   *
   * @param user
   */
  @Override
  public void setUser(IUser user) {
    this.user = user;
  }

  public Case createCase() {
    // TODO validate priviliges and finish implementation
    return new Case(null, null, null);
  }

  /**
   *
   * @return caseworker id
   */
  @Override
  public int getID() {
    return this.id;
  }

}
