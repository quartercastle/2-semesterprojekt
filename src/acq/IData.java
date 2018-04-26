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
   * Method that's run upon runnign the program Initalises database
   */
  void initialize();

  /**
   * Adds instanse of case to the database
   *
   * @param c
   */
  public void addCase(ICase c);
}
