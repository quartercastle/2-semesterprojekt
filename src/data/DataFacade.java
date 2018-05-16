package data;

import acq.ICase;
import acq.IData;
import java.util.Collection;

public class DataFacade implements IData {

  /**
   * Instance of the class itself, used for singleton setup. Is set to null
   * initially, instantiated if needed though getInstance()
   */
  public static DataFacade data;

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
    // TODO
    return null;
  }

  /**
   * Initializes database
   */
  @Override
  public void initialize() {
    // TODO
  }
}
