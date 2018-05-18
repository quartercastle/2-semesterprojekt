package domain.security;

import acq.IRole;

public class Role implements IRole {

  /**
   * id
   */
  private int id;

  /**
   * Name of role
   */
  private String name;

  /**
   * can the role open case
   */
  private boolean canCreateCase;

  /**
   * Can the role view case
   */
  private boolean canViewCase;

  /**
   * can the role edit case
   */
  private boolean canEditCase;

  /**
   * can close case
   */
  private boolean canCloseCase;

  /**
   * Get name
   *
   * @return name
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   * Role constructor
   *
   * @param name
   * @param canCreateCase
   * @param canViewCase
   * @param canEditCase
   * @param canCloseCase
   * @param canCreateCase
   */
  public Role(int id, String name, boolean canCreateCase, boolean canViewCase, boolean canEditCase, boolean canCloseCase) {
    this.id = id;
    this.name = name;
    this.canCreateCase = canCreateCase;
    this.canViewCase = canViewCase;
    this.canEditCase = canEditCase;
    this.canCloseCase = canCloseCase;
    this.canCreateCase = canCreateCase;
  }

  /**
   * Get id
   * @return
   */
  @Override
  public int getId() {
    return id;
  }

  /**
   * Is Case open
   *
   * @return canCreateCase
   */
  @Override
  public boolean canCreateCase() {
    return canCreateCase;
  }

  /**
   * Can role view Case
   *
   * @return canViewCace
   */
  @Override
  public boolean canViewCase() {
    return canViewCase;
  }

  /**
   * Can role edit Case
   *
   * @return canEditCase
   */
  @Override
  public boolean canEditCase() {
    return canEditCase;
  }

  /**
   * Can role close Case
   *
   * @return canCloseCase
   */
  @Override
  public boolean canCloseCase() {
    return canCloseCase;
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
   * Set whether a role can create a case
   *
   * @param permission
   */
  @Override
  public void setCanCreateCase(boolean permission) {
    this.canCreateCase = permission;
  }

  /**
   * Set whether a role can view a case
   *
   * @param permission
   */
  @Override
  public void setCanViewCase(boolean permission) {
    this.canViewCase = permission;
  }

  /**
   * Set whether a role can edit a case
   *
   * @param permission
   */
  @Override
  public void setCanEditCase(boolean permission) {
    this.canEditCase = permission;
  }

  /**
   * Set whether a role can close a case
   *
   * @param permission
   */
  @Override
  public void setCanCloseCase(boolean permission) {
    this.canCloseCase = permission;
  }
}
