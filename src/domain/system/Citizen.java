package domain.system;

import acq.IAddress;
import acq.ICitizen;

/*
 * Citizen class
 *
 */
public class Citizen extends Person implements ICitizen {

  /**
   * Firstname of citizen
   */
  private String firstName;

  /**
   * middleName of citizen
   */
  private String middleName;

  /**
   * lastname of citizen
   */
  private String lastName;

  /**
   * CPR of citizen
   */
  private String CPR;

  /**
   * address of citizen
   */
  private Address address;

  /**
   * phonenumber of citizen
   */
  private String phone;

  /**
   * email of citizen
   */
  private String email;

  /**
   * Server id
   */
  private int id;

  /**
   * Constructor for Citizen instance
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
  public int getID() {
    return this.id;
  }

}
