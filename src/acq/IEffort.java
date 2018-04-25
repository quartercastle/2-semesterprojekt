package acq;

import java.util.GregorianCalendar;

/**
 *
 * @author Victor Gram
 */
public interface IEffort {

  int getTotalPrice();

  GregorianCalendar getStartDate();

  GregorianCalendar getEndDate();

  ICompany getResponsible();

}
