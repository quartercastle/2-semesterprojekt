/**
 * Interface class for all implementations of Efffort
 */
package acq;

import java.util.GregorianCalendar;

/**
 *
 * @author Victor Gram
 */
public interface IEffort {

  /**
   *
   * @return total price of Effort
   */
  int getTotalPrice();

  /**
   *
   * @return starting date of effort
   */
  GregorianCalendar getStartDate();

  /**
   *
   * @return end date of Effort
   */
  GregorianCalendar getEndDate();

  /**
   *
   * @return company responsible for the effort
   */
  ICompany getResponsible();

}
