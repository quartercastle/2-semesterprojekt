package data.model;

import acq.IAddress;
import acq.IPerson;

public class DataPerson implements IPerson {

  /**
   * First name of person
   */
  private String firstName;

  /**
   * Middle name of person
   */
  private String middleName;

  /**
   * Last name of person
   */
  private String lastName;

  /**
   * Address of person
   */
  private IAddress address;

  /**
   * Phone of person
   */
  private String phone;

  /**
   * Email of person
   */
  private String email;

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
   *
   * @param email
   */
  @Override
  public void setEmail(String email) {
    this.email = email;
  }
}
