package data.model;

import acq.IRole;
import acq.IUser;
import data.Database;
import data.model.DataRole;

public class DataUser implements IUser {

  /**
   * Name of user
   */
  private int id;

  /**
   * Username
   */
  private String username;

  /**
   * Password
   */
  private String password;

  /**
   * Assigned role
   */
  private DataRole role;

  /**
   * Is the user inactive;
   */
  private boolean inactive;

  /**
   * Create a new DataUser
   *
   * @param id
   * @param username
   * @param password
   * @param role
   */
  public DataUser(String username, String password, DataRole role, boolean inactive) {
    this.username = username;
    this.password = password;
    this.role = role;
    this.inactive = inactive;
  }

  /**
   * Get id
   *
   * @return id
   */
  public int getId() {
    return this.id;
  }

  /**
   * Get username
   *
   * @return username
   */
  @Override
  public String getUsername() {
    return this.username;
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

  /**
   * Get inactive
   * @return inactive
   */
  public boolean getInactive() {
    return inactive;
  }

  /**
   * set id
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
   * set password
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
  public void setRole(DataRole role) {
    this.role = role;
  }

  /**
   * Set inactive
   *
   * @param inactive
   */
  public void setInactive(boolean inactive) {
    this.inactive = inactive;
  }

  /**
   * Find user
   *
   * @param id
   * @return
   */
  public static DataUser find(int id) {
    DataUser user = new DataUser(null, null, null, false);
    Database.getInstance().query(Database.compose(
        "SELECT id, username, password, role_id, inactive",
        "FROM users",
        "WHERE id = " + id
      ),
      rs -> {
        user.setId(rs.getInt(1));
        user.setUsername(rs.getString(2));
        user.setPassword(rs.getString(3));
        user.setRole(DataRole.find(rs.getInt(4)));
        user.setInactive(rs.getBoolean(5));
      }
    );

    return user;
  }


  /**
   * Save user
   */
  public void save() {
    String query = null;

    if (getId() == 0) {
      String[] values = {getUsername(), getPassword(), ""+getRole().getId(), ""+getInactive()};
      query = Database.compose(
        "INSERT INTO users (username, password, role_id, inactive)",
        "VALUES('" +  String.join("','", values) + "')"
      );
    } else {
      query = Database.compose(
        "UPDATE users SET",
        "username = '" + getUsername() + "',",
        "password = '" + getPassword() + "',",
        "role_id = " + getRole().getId() + ",",
        "inactive = " + getInactive(),
        "WHERE id = " + getId()
      );
    }

    Database.getInstance().query(query);
  }

}
