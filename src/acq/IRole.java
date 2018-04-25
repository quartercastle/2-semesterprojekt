/**
 * Interface class for all implementations of Role
 */
package acq;

public interface IRole {

  /**
   *
   * @return name of role
   */
  String getName();

  /**
   *
   * @return whether it is possible to open a case
   */
  Boolean canOpenCase();

  /**
   *
   * @return whether it is possible to view a case
   */
  Boolean canViewCase();

  /**
   *
   * @return whether it is possible to evaluate a case
   */
  Boolean canEvaluateCase();

  /**
   *
   * @return whether it is possible to close a case
   */
  Boolean canCloseCase();
}
