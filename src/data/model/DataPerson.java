package data.model;

import acq.IAddress;
import data.Database;

public class DataPerson {

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
   * Constructor for DataPerson
   *
   * @param firstName
   * @param middleName
   * @param lastName
   * @param address
   * @param phone
   * @param email
   */
  public DataPerson(String firstName, String middleName, String lastName, IAddress address, String phone, String email) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.address = address;
    this.phone = phone;
    this.email = email;
  }

  /**
   * Called to find a DataPerson in database
   *
   * @param id of the person to find
   * @return a instance of DataPerson if found.
   */
  public static DataPerson find(int id) {
    DataPerson d = new DataPerson(null, null, null, null, null, null);
    Database.getInstance().query(
            "SELECT id, first_name, middle_name, last_name, phone, email, address_id "
            + "FROM persons "
            + "WHERE id = " + id,
            rs -> {
              d.setId(rs.getInt(1));
              d.setFirstName(rs.getString(2));
              d.setMiddleName(rs.getString(3));
              d.setLastName(rs.getString(4));
              d.setPhone(rs.getString(5));
              d.setEmail(rs.getString(6));
              d.setAddress(DataAddress.find(rs.getInt(7)));
            });

    return d;
  }

  /**
   * Called to save
   */
  public void save() {
    String query = null;

    ((DataAddress) getAddress()).save();

    if (getId() == 0) {
      String[] values = {getFirstName(), getMiddleName(), getLastName(), getPhone(), getEmail(), "" + getAddress().getId()};
      query = "INSERT INTO persons (first_name, middle_name, last_name, phone, email, address_id) "
              + "VALUES('" + String.join("','", values) + "') "
              + "RETURNING id";
    } else {
      query = "UPDATE persons "
              + "SET first_name = '" + getFirstName() + "', middle_name = '"
              + getMiddleName() + "', last_name = '" + getLastName() + "', phone =' " + getPhone()
              + "', email ='" + getEmail() + "', address_id = " + getAddress().getId()
              + "WHERE id = " + id;
    }

    Database.getInstance().query(query, rs -> {
      if (id == 0) {
        id = rs.getInt(1);
      }
    });
  }

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

  /**
   * Set id
   *
   * @param id
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * s
   * Sets id of parent person-class
   *
   * @param id
   */
  public void setPersonId(int id) {
    this.id = id;
  }
}
