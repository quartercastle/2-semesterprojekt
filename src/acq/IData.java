package acq;

import java.io.IOException;
import java.util.Collection;

public interface IData {

  /**
   *
   * @return collection of Cases from the database
   */
  Collection<ICase> getCases();

  /**
   * Saves instanse of Case to the database
   */
  public void save();
}
