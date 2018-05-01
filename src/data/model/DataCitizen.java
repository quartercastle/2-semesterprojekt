package data.model;

import acq.IAddress;
import acq.ICitizen;
import domain.Address;

/**
 *
 * @author niclasjohansen
 */
public class DataCitizen implements ICitizen {

  /**
   * First name of citizen
   */
  private String firstName;

  /**
   * Middle name of Citizen
   */
  private String middleName;

  /**
   * Last name of citizen
   */
  private String lastName;

  /**
   * CPR of citizen
   */
  private String CPR;

  /**
   * Address of citizen
   */
  private IAddress address;

  /**
   * Phone of citizen
   */
  private String phone;

  /**
   * Email of citizen
   */
  private String email;

  /**
   * Create a new instance of a DataCitizen
   *
   * @param firstName
   * @param middleName
   * @param lastName
   * @param CPR
   * @param address
   * @param phone
   * @param email
   */
  public DataCitizen(String firstName, String middleName, String lastName, String CPR, IAddress address, String phone, String email) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.CPR = CPR;
    this.address = address;
    this.phone = phone;
    this.email = email;
  }

  /**
   * Get first name
   *
   * @return first name
   */
  @Override
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Get middle name
   *
   * @return middle name
   */
  @Override
  public String getMiddleName() {
    return this.middleName;
  }

  /**
   * Get last name
   *
   * @return last name
   */
  @Override
  public String getLastName() {
    return this.lastName;
  }

  /**
   * Get CPR
   *
   * @return CPR
   */
  @Override
  public String getCPR() {
    return this.CPR;
  }

  /**
   * Get Address
   *
   * @return Address
   */
  @Override
  public IAddress getAddress() {
    return this.address;
  }

  /**
   * Get phone
   *
   * @return phone
   */
  @Override
  public String getPhone() {
    return this.phone;
  }

  /**
   * Get email
   *
   * @return email
   */
  @Override
  public String getEmail() {
    return this.email;
  }

  /**
   * Set firstname
   *
   * @param name
   */
  @Override
  public void setFirstName(String name) {
    this.firstName = name;
  }

  /**
   * Set middle name
   *
   * @param name
   */
  @Override
  public void setMiddleName(String name) {
    this.middleName = name;
  }

  /**
   * Set last name
   *
   * @param name
   */
  @Override
  public void setLastName(String name) {
    this.lastName = name;
  }

  /**
   * Set CPR
   *
   * @param cpr
   */
  @Override
  public void setCPR(String cpr) {
    this.CPR = cpr;
  }

  /**
   * Set address
   *
   * @param address
   */
  @Override
  public void setAddress(IAddress address) {
    this.address = address;
  }

  /**
   * Set phone
   *
   * @param phone
   */
  @Override
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * Set email
   * @param email
   */
  @Override
  public void setEmail(String email) {
    this.email = email;
  }

}
