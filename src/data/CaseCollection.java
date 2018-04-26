package data;

import acq.ICase;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CaseCollection {

  /**
   * Collection of cases
   */
  private Collection<ICase> cases = new HashSet<>();

  /**
   * Add case to collection and save it to disk
   *
   * @param c
   */
  public void add(ICase c) {
    this.add(c, true);
  }

  /**
   * Add case to collection
   *
   * @param c
   */
  public void add(ICase c, boolean shouldSave) {
    this.cases.add(c);

    if (shouldSave) {
      this.save();
    }
  }

  /**
   * Delete case from collection
   *
   * @param c
   */
  public void delete(ICase c) {
    Collection<ICase> cases = new HashSet<>();
    for (ICase item : this.cases) {
      if (c != item) {
        cases.add(item);
      }
    }

    this.cases = cases;
    save();
  }

  /**
   * Get collection of cases
   * @return collection of cases
   */
  public Collection<ICase> getCollection() {
    return this.cases;
  }

  /**
   * Save the current collection of cases to disk
   */
  public void save() {
    try (Writer writer = new FileWriter("cases.json", true)) {
      Gson gson = new GsonBuilder().setPrettyPrinting().create();

      gson.toJson(cases, writer);
    } catch (IOException ex) {
      Logger.getLogger(DataFacade.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
