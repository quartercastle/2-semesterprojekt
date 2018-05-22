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
   * Adds instanse of case to the database
   *
   * @param c
   */
  void addCase(ICase c);

  /**
   * find a user with a username
   *
   * @param username
   * @return User
   */
  IUser findUser(String username);

  /**
   * find a case worker from an id
   *
   * @param id
   * @return case worker
   */
  ICaseWorker findCaseWorker(int id);
}
