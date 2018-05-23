package domain.system;

import acq.ICase;
import acq.IUser;
import domain.DomainFacade;
import java.util.Collection;
import util.Mapper;

/**
 *
 * Facade class for the system
 */
public class SystemFacade {

  /**
   * Instance of the class itself, used for singleton setup. Is set to null
   * initially, instantiated if needed though getInstance()
   */
  public static SystemFacade system;

  /**
   * Disable normal instantiation
   */
  private SystemFacade() {
  }

  /**
   * Singleton setup for SystemFacade, returns instance of the class if none has
   * been made. If one has been made, returns that created instance
   *
   * @return Singleton instanse of SystemFacade
   */
  public static SystemFacade getInstance() {
    if (system == null) {
      system = new SystemFacade();
    }

    return system;
  }

  /**
   * Caseworker instance TODO should be bound to a user
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
   * bind an user instance and create a CaseWorker from it
   *
   * @param IUser
   */
  public void bind(IUser user) {
    caseWorker = (CaseWorker) Mapper.map(
            DomainFacade.getInstance()
                    .getData()
                    .findCaseWorker(user.getId()),
            false
    );
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
