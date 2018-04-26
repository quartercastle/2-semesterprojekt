/**
 * Interface class for all implementations of User
 */
package acq;

public interface IUser {

  /**
   *
   * @return name of User
   */
  String getName();

  /**
   *
   * @return email of User
   */
  String getEmail();

  /**
   *
   * @return password of user
   */
  String getPassword();

  /**
   *
   * @return role of user
   */
  IRole getRole();

}
