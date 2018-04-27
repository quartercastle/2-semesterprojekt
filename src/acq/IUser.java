/**
 * Interface class used for all implementations of User
 */
package acq;

public interface IUser {

  /**
   * Get name
   *
   * @return name of User
   */
  String getName();

  /**
   * Get email
   *
   * @return email of User
   */
  String getEmail();

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

}
