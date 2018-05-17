/**
 * Interface class used for all implementations of User
 */
package acq;

public interface IUser {
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
   * Set username
   */
  void setUsername(String email);

  /**
   * Set Password
   */
  void setPassword(String password);
}
