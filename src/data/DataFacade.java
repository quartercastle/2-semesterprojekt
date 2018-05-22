package data;

import acq.ICase;
import acq.ICaseWorker;
import acq.IUser;
import acq.IData;
import data.model.DataCaseWorker;
import data.model.DataUser;
import java.util.Collection;

public class DataFacade implements IData {

  /**
   * Instance of the class itself, used for singleton setup. Is set to null
   * initially, instantiated if needed though getInstance()
   */
  public static DataFacade data;

  /**
   * Instance of database
   */
  private Database database;

  /**
   * Disable normal instantiation
   */
  private DataFacade() {
    database.getInstance();
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
   *
   * @param c
   */
  @Override
  public void addCase(ICase c) {
    // TODO
  }

  /**
   * Delete case
   *
   * @param c
   */
  public void deleteCase(ICase c) {
    // TODO
  }

  /**
   * Get collection of cases
   *
   * @return collection of cases
   */
  @Override
  public Collection<ICase> getCases() {
    return null;
  }

  /**
   * Find a user from its username
   *
   * @param username
   * @return case worker
   */
  @Override
  public IUser findUser(String username) {
    return DataUser.where("username", username);
  }

  /**
   * Find a caseworker from its user_id
   *
   * @param id
   * @return CaseWorker
   */
  @Override
  public ICaseWorker findCaseWorker(int id) {
    return DataCaseWorker.where("user_id", "" + id);
  }
}
