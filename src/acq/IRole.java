/**
 * Interface class used for all implementations of Role
 */
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
   * Can role edit a case
   *
   * @return whether it is possible to evaluate a case
   */
  boolean canEditCase();

  /**
   * Can role close a case
   *
   * @return whether it is possible to close a case
   */
  boolean canCloseCase();

  /**
   * Set name
   *
   * @param name
   */
  void setName(String name);

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
   * Set whether a role can edit a case
   *
   * @param permission
   */
  void setCanEditCase(boolean permission);

  /**
   * Set whether a role can close a case
   *
   * @param permission
   */
  void setCanCloseCase(boolean permission);
}
