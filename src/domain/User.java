package domain;

public class User {

  /**
   * Name of the user
   */
  private String name;

  /**
   * The user's email
   */
  private String email;

  /**
   * The user's password
   */
  private String password;

  /**
   * The user's role in the system
   */
  private Role role;

  /**
   * Get name
   *
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Get email
   *
   * @return email
   */
  public String getEmail() {
    return email;
  }

  /**
   * Get password
   *
   * @return password
   */
  public String getPassword() {
    return password;
  }

  /**
   * Get role
   *
   * @return role
   */
  public Role getRole() {
    return role;
  }

  /**
   * Set name
   *
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Set email
   *
   * @param email
   */
  public void setEmail(String email) {
    this.email = email;
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
