package data;

import acq.ICase;
import acq.IData;
import acq.IUser;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    cases.add(c);
  }

  /**
   * Delete case
   *
   * @param c
   */
  public void deleteCase(ICase c) {
    cases.delete(c);
  }

  @Override
  public Collection<ICase> getCases() {
    return cases.getCollection();
  }

  /**
   * Initializes database
   */
  @Override
  public void initialize() {
    Collection<ICase> caseCollection = null;
    try {
      JsonToJava jtj = new JsonToJava("Output.json");
      caseCollection = new ArrayList<>(jtj.loadCases());

    } catch (IOException ex) {
      ex.printStackTrace();
    }
    for (ICase c : caseCollection) {
      cases.add(c);
    }
  }
}
