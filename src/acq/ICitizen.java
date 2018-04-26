package acq;

public interface ICitizen {

  /**
   * Get first name
   * @return first name of citizen
   */
  String getFirstName();

  /**
   * Get middle name
   * @return middlename of citizen
   */
  String getMiddleName();

  /**
   * Get Last name
   * @return last name of citizen
   */
  String getLastName();

  /**
   * Get CPR
   * @return CPR number of citizen
   */
  String getCPR();

  /**
   * Get Address
   * @return address of Citizen
   */
  IAddress getAddress();

  /**
   * Get phone
   * @return phonenumber of citizen
   */
  String getPhone();

  /**
   * get email
   * @return Email address of citizen
   */
  String getEmail();

}
