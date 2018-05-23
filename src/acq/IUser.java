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
   * Set role
   *
   * @param role
   */
  void setRole(IRole role);

  /**
   * set
   *
   * @param id
   */
  void setId(int id);
}
