package data;

import acq.ICase;
import java.util.Collection;
import java.util.HashSet;

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
  }

  public Collection<ICase> getCollection() {
    return this.cases;
  }
}
