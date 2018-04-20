/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author niclasjohansen
 */
public class Address {

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
  public String getPrimaryLine() {
    return primaryLine;
  }

  /**
   * Getter method for secondaryLine
   *
   * @return secondaryLine
   */
  public String getSecondaryLine() {
    return secondaryLine;
  }

  /**
   * Getter method for zip
   *
   * @return zip
   */
  public String getZip() {
    return zip;
  }

  /**
   * Getter method for city
   *
   * @return city
   */
  public String getCity() {
    return city;
  }

  /**
   * Getter method for country
   *
   * @return country
   */
  public String getCountry() {
    return country;
  }

  /**
   * Setter method for primaryLine
   *
   * @param primaryLine
   */
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
  public void setZip(String zip) {
    this.zip = zip;
  }

  /**
   * setter method for city
   *
   * @param city
   */
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
