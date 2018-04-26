package data.model;

import acq.IRole;
import acq.IUser;

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
