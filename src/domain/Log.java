/**
 * Log class, creates log for each case
 */
package domain;

import java.util.Date;

public class Log {

  /**
   * Date of creation for the log
   */
  private Date date;
  /**
   * User that created the log
   */
  private User user;
  /**
   * Case that the log is made for
   */
  private Case c;
  /**
   * Description of the case
   */
  private String description;

  /**
   * Old value of the log, used to compare changes
   */
  private String oldValue;
  /**
   * New value of the log, used to compare changes
   */
  private String newValue;

  /**
   * Method for returning the Date of creation for the log file
   *
   * @return date
   */
  public Date getDate() {
    return date;
  }

  /**
   * Sets the date of creation for the log file
   *
   * @param date
   */
  public void setDate(Date date) {
    this.date = date;
  }

  /**
   * Returns the user that created the logfile
   *
   * @return user
   */
  public User getUser() {
    return user;
  }

  /**
   * Sets user that creeated the logfile
   *
   * @param user
   */
  public void setUser(User user) {
    this.user = user;
  }

  /**
   * Returns the case that the log i related to
   *
   * @return c
   */
  public Case getCase() {
    return c;
  }

  /**
   * Sets the case the log is related to
   *
   * @param c
   */
  public void setCase(Case c) {
    this.c = c;
  }

  /**
   * Returns description
   *
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets description
   *
   * @param description
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Returns old value of the log
   *
   * @return oldValue
   */
  public String getOldValue() {
    return oldValue;
  }

  /**
   * Sets the old value for the log
   *
   * @param oldValue
   */
  public void setOldValue(String oldValue) {
    this.oldValue = oldValue;
  }

  /**
   * Returns new value
   *
   * @return newValue
   */
  public String getNewValue() {
    return newValue;
  }

  /**
   * Sets newValue for the log
   *
   * @param newValue
   */
  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }

}
