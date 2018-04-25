/**
 * Interface class for all implementations of Company
 */
package acq;

public interface ICompany {

  /**
   *
   * @return company name
   */
  String getName();

  /**
   *
   * @return company address
   */
  IAddress getAddress();

}
