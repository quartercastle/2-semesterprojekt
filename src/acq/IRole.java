package acq;

public interface IRole {

  /**
   * Get name
   *
   * @return name of role
   */
  String getName();

  /**
   * Can role create a case
   *
   * @return whether it is possible to open a case
   */
  boolean canCreateCase();

  /**
   * Can role view a case
   *
   * @return whether it is possible to view a case
   */
  boolean canViewCase();

  /**
   * Can role evaluate a case
   *
   * @return whether it is possible to evaluate a case
   */
  boolean canEvaluateCase();

  /**
   * Can role close a case
   *
   * @return whether it is possible to close a case
   */
  boolean canCloseCase();

  /**
   * Set whether a role can create a case
   *
   * @param permission
   */
  void setCanCreateCase(boolean permission);

  /**
   * Set whether a role can view a case
   *
   * @param permission
   */
  void setCanViewCase(boolean permission);

  /**
   * Set whether a role can evaluate a case
   *
   * @param permission
   */
  void setCanEvaluateCase(boolean permission);

  /**
   * Set whether a role can close a case
   *
   * @param permission
   */
  void setCanCloseCase(boolean permission);
}
