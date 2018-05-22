package data.model;

import acq.IAddress;
import data.Database;

public class DataAddress implements IAddress {

  /**
   * Server id
   */
  private int id;

  /**
   * Name of primaryLine
   */
  private String primaryLine;

  /**
   * Name of secondaryLine
   */
  private String secondaryLine;

  /**
   * Name of zip
   */
  private String zip;

  /**
   * Name of city
   */
  private String city;

  /**
   * Name of country
   */
  private String country;

  /**
   * no-args constructor
   */
  public DataAddress() {
  }

  /**
   * Constructor for the DataAddress instance.
   *
   * @param primaryLine
   * @param secondaryLine
   * @param zip
   * @param city
   * @param country
   */
  public DataAddress(String primaryLine, String secondaryLine, String zip, String city, String country) {
    this.primaryLine = primaryLine;
    this.secondaryLine = secondaryLine;
    this.zip = zip;
    this.city = city;
    this.country = country;
    id = 0;
  }

  /**
   * Called to find a dataaddress in database
   *
   * @param id of the address to find
   * @return a instance of DataAddress if found.
   */
  public static DataAddress find(int id) {
    DataAddress da = new DataAddress(null, null, null, null, null);
    Database.getInstance().query(
            "SELECT id, primary_line, secondary_line, zip_code, city, country "
            + "FROM addresses "
            + "WHERE id = " + id,
            rs -> {
              da.setId(rs.getInt(1));
              da.setPrimaryLine(rs.getString(2));
              da.setSecondaryLine(rs.getString(3));
              da.setZip(rs.getString(4));
              da.setCity(rs.getString(5));
              da.setCountry(rs.getString(6));
            });

    return da;
  }

  /**
   * Called to save
   */
  public void save() {
    String query = null;

    if (getId() == 0) {
      query = "INSERT INTO addresses (primary_line, secondary_line, zip_code, city, country) "
              + "VALUES('" + primaryLine + "','" + secondaryLine + "','" + zip + "','" + city + "','" + country + "') "
              + "RETURNING id";
    } else {
      query = "UPDATE addresses "
              + "SET primary_line = '" + getPrimaryLine() + "', secondary_line ='"
              + getZip() + "', city='" + getCity() + "', country='" + getCountry() + "' "
              + "WHERE id = " + id;
    }

    Database.getInstance().query(query, rs -> {
      if (id == 0) {
        id = rs.getInt(1);
      }
    });
  }

  /**
   * Get primary line
   *
   * @return primary line
   */
  @Override
  public String getPrimaryLine() {
    return this.primaryLine;
  }

  /**
   * Get secondary line
   *
   * @return secondary line
   */
  @Override
  public String getSecondaryLine() {
    return this.secondaryLine;
  }

  /**
   * Get zip
   *
   * @return zip line
   */
  @Override
  public String getZip() {
    return this.zip;
  }

  /**
   * Get City
   *
   * @return Get city
   */
  @Override
  public String getCity() {
    return this.city;
  }

  /**
   * Get country
   *
   * @return get country
   */
  @Override
  public String getCountry() {
    return this.country;
  }

  /**
   * Set Primary line
   *
   * @param line
   */
  @Override
  public void setPrimaryLine(String line) {
    this.primaryLine = line;
  }

  /**
   * Set secondary line
   *
   * @param secondaryLine
   */
  public void setSecondaryLine(String secondaryLine) {
    this.secondaryLine = secondaryLine;
  }

  /**
   * Set country
   *
   * @param country
   */
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Set zip
   *
   * @param zip
   */
  @Override
  public void setZip(String zip) {
    this.zip = zip;
  }

  /**
   * Set city
   *
   * @param city
   */
  @Override
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * Get id
   *
   * @return id
   */
  @Override
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
