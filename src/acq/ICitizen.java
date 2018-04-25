/**
 * Interface class for all implementations of Citizen
 */
package acq;

public interface ICitizen {

  /**
   *
   * @return first name of citizen
   */
  String getFirstName();

  /**
   *
   * @return middlename of citizen
   */
  String getMiddleName();

  /**
   *
   * @return last name of citizen
   */
  String getLastName();

  /**
   *
   * @return CPR number of citizen
   */
  String getCPR();

  /**
   *
   * @return address of Citizen
   */
  IAddress getAddress();

  /**
   *
   * @return phonenumber of citizen
   */
  String getPhone();

  /**
   *
   * @return Email address of citizen
   */
  String getEmail();

}
