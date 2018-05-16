/**
 * Interface class used for all implementations of Effort
 */
package acq;

import java.util.GregorianCalendar;

public interface IEffort {

  /**
   * Get total price
   *
   * @return total price of Effort
   */
  int getTotalPrice();

  /**
   * Get start date
   *
   * @return starting date of effort
   */
  GregorianCalendar getStartDate();

  /**
   * Get end date
   *
   * @return end date of Effort
   */
  GregorianCalendar getEndDate();

  /**
   * Get responsible
   *
   * @return company responsible for the effort
   */
  ICompany getResponsible();

  /**
   * Set service
   *
   * @param service
   */
  void setService(IService service);

  /**
   * Set offer
   *
   * @param offer
   */
  void setOffer(IOffer offer);

  /**
   * set paragraph
   *
   * @param paragraph
   */
  void setParagraph(IParagraph paragraph);

  /**
   * get service
   *
   * @return service
   */
  IService getService();

  /**
   * Get offer
   *
   * @return
   */
  IOffer getOffer();

  /**
   * get paragraph
   *
   * @return paragraph
   */
  IParagraph getParagraph();

}
