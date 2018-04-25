package acq;

/**
 *
 * @author Victor Gram
 */
public interface IRole {

  String getName();

  Boolean canOpenCase();

  Boolean canViewCase();

  Boolean canEvaluateCase();

  Boolean canCloseCase();
}
