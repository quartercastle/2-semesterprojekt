/**
 * Interface class used for all implementations of Citizen
 */
package acq;

public interface ICitizen {

  /**
   * Get CPR
   *
   * @return CPR number of citizen
   */
  String getCPR();

  /**
   * Set CPR
   *
   * @param cpr
   */
  void setCPR(String cpr);

  /**
   * Get ID
   *
   * @return id
   */
  int getID();

  /**
   * Get first name
   *
   * @return first name of citizen
   */
  String getFirstName();

  /**
   * Get middle name
   *
   * @return middlename of citizen
   */
  String getMiddleName();

  /**
   * Get Last name
   *
   * @return last name of citizen
   */
  String getLastName();

  /**
   * Get Address
   *
   * @return address of Citizen
   */
  IAddress getAddress();

  /**
   * Get phone
   *
   * @return phonenumber of citizen
   */
  String getPhone();

  /**
   * get email
   *
   * @return Email address of citizen
   */
  String getEmail();

  /**
   * Set first name
   *
   * @param name
   */
  void setFirstName(String name);

  /**
   * Set middle name
   *
   * @param name
   */
  void setMiddleName(String name);

  /**
   * Set last name
   *
   * @param name
   */
  void setLastName(String name);

  /**
   * Set Address
   *
   * @param address
   */
  void setAddress(IAddress address);

  /**
   * Set phone
   *
   * @param phone
   */
  void setPhone(String phone);

  /**
   * Set email
   *
   * @param email
   */
  void setEmail(String email);

}
