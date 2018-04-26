package data.model;

import acq.IAddress;

public class DataAddress implements IAddress {

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
  }

  @Override
  public String getPrimaryLine() {
    return this.primaryLine;
  }

  @Override
  public String getSecondaryLine() {
    return this.secondaryLine;
  }

  @Override
  public String getZip() {
    return this.zip;
  }

  @Override
  public String getCity() {
    return this.city;
  }

  @Override
  public String getCountry() {
    return this.country;
  }

}
