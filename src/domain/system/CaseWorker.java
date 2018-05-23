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
   * No args constructor for CaseWorker
   */
  public CaseWorker() {
  }

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

  /**
   * Get id
   *
   * @return
   */
  @Override
  public int getId() {
    return id;
  }

  /**
   * Set id
   *
   * @param id
   */
  @Override
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Create a new case
   *
   * @return
   */
  public Case createCase() {
    if (!user.getRole().canCreateCase()) {
      return null;
    }

    return new Case(null, null);

  }
}
