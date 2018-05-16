package domain.system;

import acq.ICase;
import java.util.Collection;

/**
 *
 * Facade class for the system
 */
public class SystemFacade {

  /**
   * Caseworker instance
   */
  private CaseWorker caseWorker;

  /**
   * Collection with cases
   */
  private Collection<ICase> cases;

  /**
   * Getter for getting the collection with cases.
   *
   * @return cases collection
   */
  public Collection<ICase> getCases() {
    return cases;
  }

  /**
   * Create new case.
   *
   * @return case
   */
  public ICase createCase() {
    return caseWorker.createCase();
  }

}
