/**
 * Interface class used for all implementations of Effort
 */
package acq;

import java.util.Collection;
import java.util.GregorianCalendar;

public interface IEffort {

  /**
   * Get id
   *
   * @return id
   */
  int getId();

  /**
   * Get caseId
   *
   * @return i caseId
   */
  int getCaseId();

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
  void setParagraphs(Collection<IParagraph> paragraphs);

  /**
   * Set paragraph
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
   * get paragraphs
   *
   * @return paragraphs
   */
  Collection<IParagraph> getParagraphs();

  /**
   * set caseId
   *
   * @param id
   */
  void setCaseId(int id);

}
