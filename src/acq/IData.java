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
  void save();

  /**
   * Method that's run upon runnign the program Initalises database
   */
  void initialize();
}
