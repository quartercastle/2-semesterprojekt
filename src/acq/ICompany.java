/**
 * Interface class used for all implementations of Company
 */
package acq;

public interface ICompany {

  /**
   * Get name
   *
   * @return company name
   */
  String getName();

  /**
   * Get address
   *
   * @return company address
   */
  IAddress getAddress();

  /**
   * Set address
   *
   * @param address
   */
  void setAddress(IAddress address);

  /**
   * Set company name
   *
   * @param name
   */
  void setName(String name);
}
