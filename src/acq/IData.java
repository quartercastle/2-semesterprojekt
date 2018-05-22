package acq;

import java.util.Collection;

public interface IData {

  /**
   * Get cases
   *
   * @return collection of Cases from the database
   */
  Collection<ICase> getCases();

  /**
   * Method that's run upon runnign the program Initalises database
   */
  void initialize();

  /**
   * Adds instanse of case to the database
   *
   * @param c
   */
  public void addCase(ICase c);

  /**
   * find a user with a username
   * @param username
   */
  IUser findUser(String username);

  /**
   * find a case worker from an id
   * @param  id
   * @return case worker
   */
  ICaseWorker findCaseWorker(int id);
}
