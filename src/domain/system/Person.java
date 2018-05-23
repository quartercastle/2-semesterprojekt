package domain.system;

import acq.IAddress;

/**
 *
 * Person class that implements IPerson.
 */
public abstract class Person {

  /**
   * No args
   */
  public Person() {
  }

  /**
   * Constructor for person
   *
   * @param firstName
   * @param middleName
   * @param lastName
   * @param address
   * @param phone
   * @param email
   */
  public Person(String firstName, String middleName, String lastName, IAddress address, String phone, String email) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.address = address;
    this.phone = phone;
    this.email = email;
  }

  /**
   * Id
   */
  private int id;

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
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Get middle name
   *
   * @return middle name
   */
  public String getMiddleName() {
    return this.middleName;
  }

  /**
   * Get last name
   *
   * @return last name
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * Get Address
   *
   * @return Address
   */
  public IAddress getAddress() {
    return this.address;
  }

  /**
   * Get phone
   *
   * @return phone
   */
  public String getPhone() {
    return this.phone;
  }

  /**
   * Get email
   *
   * @return email
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Get id
   *
   * @return id
   */
  public int getId() {
    return id;
  }

  /**
   * Set firstname
   *
   * @param name
   */
  public void setFirstName(String name) {
    this.firstName = name;
  }

  /**
   * Set middle name
   *
   * @param name
   */
  public void setMiddleName(String name) {
    this.middleName = name;
  }

  /**
   * Set last name
   *
   * @param name
   */
  public void setLastName(String name) {
    this.lastName = name;
  }

  /**
   * Set address
   *
   * @param address
   */
  public void setAddress(IAddress address) {
    this.address = address;
  }

  /**
   * Set phone
   *
   * @param phone
   */
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * Set email
   *
   * @param email
   */
  public void setEmail(String email) {
    this.email = email;
  }
}
