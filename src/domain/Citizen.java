package domain;

import acq.IAddress;
import acq.ICitizen;

/*
 * Citizen class
 *
 */
public class Citizen implements ICitizen {

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
   * Constructor for Citizen instance
   *
   * @param firstName
   * @param middleName
   * @param lastName
   * @param CPR
   * @param address
   * @param phone
   * @param email
   */
  public Citizen(String firstName, String middleName, String lastName, String CPR, Address address, String phone, String email) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.CPR = CPR;
    this.address = address;
    this.phone = phone;
    this.email = email;
  }

  /**
   * Getter method for firstname of citizen
   *
   * @return firstname
   */
  @Override
  public String getFirstName() {
    return firstName;
  }

  /**
   * Getter method for middlename of citizen
   *
   * @return middleName
   */
  @Override
  public String getMiddleName() {
    return middleName;
  }

  /**
   * Getter method for lastname of citizen
   *
   * @return lastName
   */
  @Override
  public String getLastName() {
    return lastName;
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
   * Getter method for citizens address
   *
   * @return address
   */
  @Override
  public Address getAddress() {
    return address;
  }

  /**
   * Getter method for citizens phonenumber
   *
   * @return phone
   */
  @Override
  public String getPhone() {
    return phone;
  }

  /**
   * Getter method for citizens email
   *
   * @return email
   */
  @Override
  public String getEmail() {
    return email;
  }

  /**
   * Setter method for citizens firstName
   *
   * @param firstName
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Setter method for citizens middleName
   *
   * @param middleName
   */
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  /**
   * Setter method for citizens lastName
   *
   * @param lastName
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Setter method for citizens CPR
   *
   * @param CPR
   */
  public void setCPR(String CPR) {
    this.CPR = CPR;
  }

  /**
   * Setter method for citizens address
   *
   * @param address
   */
  public void setAddress(Address address) {
    this.address = address;
  }

  /**
   * Setter method for citizens phone
   *
   * @param phone
   */
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * Setter method for citizens email
   *
   * @param email
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Set Address
   * @param name
   */
  @Override
  public void setAddress(IAddress address) {
    this.address = (Address) address;
  }

}
