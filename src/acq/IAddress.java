/**
 * Interface class used for all implementations of Address
 */
package acq;

public interface IAddress {

  /**
   *
   * @return primary address line
   */
  String getPrimaryLine();

  /**
   *
   * @return secondary address line
   */
  String getSecondaryLine();

  /**
   *
   * @return zipcode
   */
  String getZip();

  /**
   *
   * @return city
   */
  String getCity();

  /**
   *
   * @return country
   */
  String getCountry();

}
