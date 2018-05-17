package domain.system;

import acq.IAddress;

/*
 * Address class
 *
 */
public class Address implements IAddress {

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
   * No-agrs constructor
   */
  public Address() {
  }

  /**
   * Constructor for the Address instance.
   *
   * @param primaryLine
   * @param secondaryLine
   * @param zip
   * @param city
   * @param country
   */
  public Address(String primaryLine, String secondaryLine, String zip, String city, String country) {
    this.primaryLine = primaryLine;
    this.secondaryLine = secondaryLine;
    this.zip = zip;
    this.city = city;
    this.country = country;
  }

  /**
   * Getter method for primaryLine
   *
   * @return primaryLine
   */
  @Override
  public String getPrimaryLine() {
    return primaryLine;
  }

  /**
   * Getter method for secondaryLine
   *
   * @return secondaryLine
   */
  @Override
  public String getSecondaryLine() {
    return secondaryLine;
  }

  /**
   * Getter method for zip
   *
   * @return zip
   */
  @Override
  public String getZip() {
    return zip;
  }

  /**
   * Getter method for city
   *
   * @return city
   */
  @Override
  public String getCity() {
    return city;
  }

  /**
   * Getter method for country
   *
   * @return country
   */
  @Override
  public String getCountry() {
    return country;
  }

  /**
   * Setter method for primaryLine
   *
   * @param primaryLine
   */
  @Override
  public void setPrimaryLine(String primaryLine) {
    this.primaryLine = primaryLine;
  }

  /**
   * Setter method for secondaryLine
   *
   * @param secondaryLine
   */
  public void setSecondaryLine(String secondaryLine) {
    this.secondaryLine = secondaryLine;
  }

  /**
   * Setter method for zip
   *
   * @param zip
   */
  @Override
  public void setZip(String zip) {
    this.zip = zip;
  }

  /**
   * setter method for city
   *
   * @param city
   */
  @Override
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * setter method for country
   *
   * @param country
   */
  public void setCountry(String country) {
    this.country = country;
  }

}
