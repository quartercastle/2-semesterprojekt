/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import acq.IRole;
import acq.IUser;

/**
 *
 * @author niclasjohansen
 */
public class DataUser implements IUser {

  private String name;
  private String email;
  private String password;
  private DataRole role;

  public DataUser(String name, String email, String password, DataRole role) {
    this.name = name;
    this.email = email;
    this.password = password;
    this.role = role;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String getEmail() {
    return this.email;
  }

  @Override
  public String getPassword() {
    return this.password;
  }

  @Override
  public IRole getRole() {
    return this.role;
  }

}
