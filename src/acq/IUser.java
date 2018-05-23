/**
 * Interface class used for all implementations of User
 */
package acq;

public interface IUser {

  /**
   * Get ID
   *
   * @return id
   */
  int getId();

  /**
   * set ID
   *
   * @param id
   */
  void setId(int id);

  /**
   * Get username
   *
   * @return username
   */
  String getUsername();

  /**
   * Get Password
   *
   * @return password of user
   */
  String getPassword();

  /**
   * Get Role
   *
   * @return role of user
   */
  IRole getRole();

  /**
   * Set IRole
   *
   * @param role
   */
  void setRole(IRole role);

  /**
   * Set username
   *
   * @param email
   */
  void setUsername(String email);

  /**
   * Set Password
   *
   * @param password
   */
  void setPassword(String password);

  /**
   * Is the user inactive
   *
   * @return boolean
   */
  boolean isInactive();

  /**
   * Set the user inactive
   *
   * @param inactive
   */
  void setInactive(boolean inactive);

}
