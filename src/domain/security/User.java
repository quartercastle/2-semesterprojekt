package domain.security;

import domain.security.Role;
import acq.IUser;

public class User implements IUser {
  /**
   * The user's username
   */
  private String username;

  /**
   * The user's password
   */
  private String password;

  /**
   * The user's role in the system
   */
  private Role role;

  /**
   * User contructor
   *
   * @param name
   * @param username
   * @param password
   * @param role
   */
  public User(String username, String password, Role role) {
    this.username = username;
    this.password = password;
    this.role = role;
  }

  /**
   * Get username
   *
   * @return username
   */
  @Override
  public String getUsername() {
    return username;
  }

  /**
   * Get password
   *
   * @return password
   */
  @Override
  public String getPassword() {
    return password;
  }

  /**
   * Get role
   *
   * @return role
   */
  @Override
  public Role getRole() {
    return role;
  }

  /**
   * Set username
   *
   * @param username
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Set Password
   *
   * @param password
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Set role
   *
   * @param role
   */
  public void setRole(Role role) {
    this.role = role;
  }

}
