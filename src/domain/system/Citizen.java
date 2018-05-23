package domain.system;

import acq.IAddress;
import acq.ICitizen;

/*
 * Citizen class
 *
 */
public class Citizen extends Person implements ICitizen {

  /**
   * CPR of citizen
   */
  private String CPR;

  /**
   * Server id
   */
  private int id;

  /**
   * Citizen constructor
   *
   * @param firstName
   * @param middleName
   * @param lastName
   * @param address
   * @param phone
   * @param email
   */
  public Citizen(String firstName, String middleName, String lastName, IAddress address, String phone, String email) {
    super(firstName, middleName, lastName, address, phone, email);
    id = 0;
  }

  /**
   * Getter method for citizens CPR
   *
   * @return CPR
   */
  @Override
  public String getCPR() {
    return CPR;
  }

  /**
   * Setter method for citizens CPR
   *
   * @param CPR
   */
  public void setCPR(String CPR) {
    this.CPR = CPR;
  }

  @Override
  public int getId() {
    return this.id;
  }
}
