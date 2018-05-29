package data.model;

import acq.IRole;
import data.Database;

public class DataRole implements IRole {

  /**
   * id
   */
  private int id;

  /**
   * Name of role
   */
  private String name;

  /**
   * Can create a case
   */
  private boolean canCreateCase;

  /**
   * Can view case
   */
  private boolean canViewCase;

  /**
   * Can edit Case
   */
  private boolean canEditCase;

  /**
   * Can close case
   */
  private boolean canCloseCase;

  /**
   * No args for our mapper to use
   */
  public DataRole() {
  }

  /**
   * Create a new instance of DataRole
   *
   * @param name
   * @param canCreateCase
   * @param canViewCase
   * @param canEditCase
   * @param canCloseCase
   *
   */
  public DataRole(String name, boolean canCreateCase, boolean canViewCase, boolean canEditCase, boolean canCloseCase) {
    this.name = name;
    this.canCreateCase = canCreateCase;
    this.canViewCase = canViewCase;
    this.canEditCase = canEditCase;
    this.canCloseCase = canCloseCase;
    this.canCreateCase = canCreateCase;
  }

  /**
   * Get id
   *
   * return id
   */
  public int getId() {
    return this.id;
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
   * can create case
   *
   * @return can create case
   */
  @Override
  public boolean canCreateCase() {
    return this.canCreateCase;
  }

  /**
   * can view case
   *
   * @return can view case
   */
  @Override
  public boolean canViewCase() {
    return this.canViewCase;
  }

  /**
   * can edit case
   *
   * @return can edit case
   */
  @Override
  public boolean canEditCase() {
    return this.canEditCase;
  }

  /**
   * can close case
   *
   * @return can close case
   */
  @Override
  public boolean canCloseCase() {
    return this.canCloseCase;
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
   * Set name
   *
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * set can create case
   */
  @Override
  public void setCanCreateCase(boolean permission) {
    this.canCreateCase = permission;
  }

  /**
   * set can view case
   */
  @Override
  public void setCanViewCase(boolean permission) {
    this.canViewCase = permission;
  }

  /**
   * set can edit case
   */
  @Override
  public void setCanEditCase(boolean permission) {
    this.canEditCase = permission;
  }

  /**
   * set can close case
   */
  @Override
  public void setCanCloseCase(boolean permission) {
    this.canCloseCase = permission;
  }

  /**
   * Find role in database
   *
   * @param id
   * @return role
   */
  public static DataRole find(int id) {
    DataRole role = new DataRole();
    Database.getInstance().query(Database.compose(
            "SELECT id, name, create_case, view_case, edit_case, close_case",
            "FROM roles",
            "WHERE id = " + id
    ),
            rs -> {
              role.setId(rs.getInt(1));
              role.setName(rs.getString(2));
              role.setCanCreateCase(rs.getBoolean(3));
              role.setCanViewCase(rs.getBoolean(4));
              role.setCanEditCase(rs.getBoolean(5));
              role.setCanCloseCase(rs.getBoolean(6));
            });

    return role;
  }

  /**
   * Save role to database
   */
  public void save() {
    String query = null;

    if (getId() == 0) {
      String[] values = {getName(), "" + canCreateCase(), "" + canViewCase(), "" + canEditCase(), "" + canCloseCase()};
      query = Database.compose(
              "INSERT INTO roles (name, create_case, view_case, edit_case, close_case)",
              "VALUES('" + String.join("','", values) + "')",
              "RETURNING id"
      );
    } else {
      query = Database.compose(
              "UPDATE roles SET",
              "name = '" + getName() + "',",
              "create_case = " + canCreateCase() + ",",
              "view_case = " + canViewCase() + ",",
              "edit_case = " + canEditCase() + ",",
              "close_case = " + canCloseCase(),
              "WHERE id = " + getId()
      );
    }

    Database.getInstance().query(query, rs -> {
      if (id == 0) {
        id = rs.getInt(1);
      }
    });
  }
}
