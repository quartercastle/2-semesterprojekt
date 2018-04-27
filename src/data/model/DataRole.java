package data.model;

import acq.IRole;

public class DataRole implements IRole {

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
   * Can Evaluate Case
   */
  private boolean canEvaluateCase;

  /**
   * Can close case
   */
  private boolean canCloseCase;

  /**
   * Create a new instance of DataRole
   *
   * @param name
   * @param canCreateCase
   * @param canViewCase
   * @param canEvaluateCase
   * @param canCloseCase
   *
   */
  public DataRole(String name, boolean canCreateCase, boolean canViewCase, boolean canEvaluateCase, boolean canCloseCase) {
    this.name = name;
    this.canCreateCase = canCreateCase;
    this.canViewCase = canViewCase;
    this.canEvaluateCase = canEvaluateCase;
    this.canCloseCase = canCloseCase;
    this.canCreateCase = canCreateCase;
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
   * can evaluate case
   *
   * @return can evaluate case
   */
  @Override
  public boolean canEvaluateCase() {
    return this.canEvaluateCase;
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
   * set can evaluate case
   */
  @Override
  public void setCanEvaluateCase(boolean permission) {
    this.canEvaluateCase = permission;
  }

  /**
   * set can close case
   */
  @Override
  public void setCanCloseCase(boolean permission) {
    this.canCloseCase = permission;
  }
}
