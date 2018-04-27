package data.model;

import acq.IRole;
import acq.IUser;

public class DataUser implements IUser {

  /**
   * Name of user
   */
  private String name;

  /**
   * Email
   */
  private String email;

  /**
   * Password
   */
  private String password;

  /**
   * Assigned role
   */
  private DataRole role;

  /**
   * Create a new DataUser
   *
   * @param name
   * @param email
   * @param password
   * @param role
   */
  public DataUser(String name, String email, String password, DataRole role) {
    this.name = name;
    this.email = email;
    this.password = password;
    this.role = role;
  }

  /**
   * Get name
   *
   * @return name
   */
  @Override
  public String getName() {
    return this.name;
  }

  /**
   * Get email
   *
   * @return email
   */
  @Override
  public String getEmail() {
    return this.email;
  }

  /**
   * Get password
   *
   * @return password
   */
  @Override
  public String getPassword() {
    return this.password;
  }

  /**
   * Get role
   *
   * @return role
   */
  @Override
  public IRole getRole() {
    return this.role;
  }

}
