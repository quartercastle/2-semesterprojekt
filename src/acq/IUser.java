/**
 * Interface class for all implementations of User
 */
package acq;

public interface IUser {

  /**
   *
   * @return name of User
   */
  public String getName();

  /**
   *
   * @return email of User
   */
  public String getEmail();

  /**
   *
   * @return password of user
   */
  public String getPassword();

  /**
   *
   * @return role of user
   */
  public IRole getRole();

}
