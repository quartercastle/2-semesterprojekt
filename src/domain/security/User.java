package domain.security;

import acq.IRole;
import domain.security.Role;
import acq.IUser;

public class User implements IUser {

  /**
   * User id
   */
  private int id;

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
   * No args for our mapper to use
   */
  public User() {
  }

  /**
   * User contructor
   *
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
   * Get id
   *
   * @return id
   */
  @Override
  public int getId() {
    return id;
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
  public IRole getRole() {
    return role;
  }

  /**
   * Set id
   *
   * @param id
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Set username
   *
   * @param username
   */
  @Override
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Set Password
   *
   * @param password
   */
  @Override
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Set role
   *
   * @param role
   */
  @Override
  public void setRole(IRole role) {
    this.role = (Role) role;
  }

  /**
   * Check if the give password is valid
   *
   * @param password
   * @return true if valid
   */
  public boolean verify(String password) {
    if (this.password == null || password == null) {
      return false;
    }

    return this.password.equals(password);
  }
}
