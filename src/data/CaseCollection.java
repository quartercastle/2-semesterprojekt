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
   * Add case to collection
   *
   * @param c
   */
  public void add(ICase c) {
    this.cases.add(c);
    this.save();
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

  public Collection<ICase> getCollection() {
    return this.cases;
  }

  public void save() {
    try (Writer writer = new FileWriter("Output.json", true)) {
      Gson gson = new GsonBuilder().setPrettyPrinting().create();

      gson.toJson(cases, writer);
    } catch (IOException ex) {
      Logger.getLogger(DataFacade.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}