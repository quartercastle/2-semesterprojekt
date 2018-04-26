/*
 * Facade class for coommunicating with data layer
 */
package data;

import acq.IData;
import acq.IUser;
import acq.ICase;

public class DataFacade implements IData {

  /**
   * Instance of the class itself, used for singleton setup. Is set to null
   * initially, instantiated if needed though getInstance()
   */
  public static DataFacade data;

  /**
   * Create a new collection of cases
   */
  public CaseCollection cases = new CaseCollection();

  /**
   * Create a new collection of users
   */
  public UserCollection users = new UserCollection();


  /**
   * Disable normal instantiation
   */
  private DataFacade() {
  }

  /**
   * Singleton setup for DomainFacade, returns instance of the class if none has
   * been made. If one has been made, returns that created instance
   *
   * @return Singleton instanse of DataFacade
   */
  public static DataFacade getInstance() {
    if (data == null) {
      data = new DataFacade();
    }

    return data;
  }

  /**
   * Add case
   * @param c
   */
  public void addCase(ICase c) {
    cases.add(c);
  }

  /**
   * Delete case
   * @param c
   */
  public void deleteCase(ICase c) {
    cases.delete(c);
  }

  /**
   * Add user
   * @param user [description]
   */
  public void addUser(IUser user) {
    users.add(user);
  }

  /**
   * Delete user
   * @param user
   */
  public void deleteUser(IUser user) {
    users.delete(user);
  }
}
