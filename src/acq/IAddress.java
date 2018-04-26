package acq;

public interface IAddress {

  /**
   * Get primary line
   * @return primary address line
   */
  String getPrimaryLine();

  /**
   * Get secondary line
   * @return secondary address line
   */
  String getSecondaryLine();

  /**
   * Get ZIP
   * @return zipcode
   */
  String getZip();

  /**
   * Get city
   * @return city
   */
  String getCity();

  /**
   * Get country
   * @return country
   */
  String getCountry();

}
