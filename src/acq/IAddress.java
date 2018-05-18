/**
 * Interface class used for all implementations of Adress
 */
package acq;

public interface IAddress {

  /**
   * Get id
   *
   * @return id
   */
  int getId();

  /**
   * Get primary line
   *
   * @return primary address line
   */
  String getPrimaryLine();

  /**
   * Get secondary line
   *
   * @return secondary address line
   */
  String getSecondaryLine();

  /**
   * Get ZIP
   *
   * @return zipcode
   */
  String getZip();

  /**
   * Get city
   *
   * @return city
   */
  String getCity();

  /**
   * Get country
   *
   * @return country
   */
  String getCountry();

  /**
   * Set primary line
   *
   * @param line
   */
  void setPrimaryLine(String line);

  /**
   * Set zip
   *
   * @param zip
   */
  void setZip(String zip);

  /**
   * Set city
   *
   * @param city
   */
  void setCity(String city);

}
