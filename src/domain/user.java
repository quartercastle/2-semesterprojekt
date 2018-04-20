/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author jeppe
 */
public class user {

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
  private role Role;

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
   * @return
   */
  public String getPassword() {
    return password;
  }

  public role getRole() {
    return Role;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setRole(role Role) {
    this.Role = Role;
  }

}
