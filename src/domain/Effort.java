package domain;

import acq.IEffort;
import java.util.GregorianCalendar;

/**
 * Effort
 */
public class Effort implements IEffort {

  /**
   * Total price of effort
   */
  private int totalPrice;

  /**
   * Start date of effort
   */
  private GregorianCalendar startDate;

  /**
   * Start date of effort
   */
  private GregorianCalendar endDate;

  /**
   * Company responsible of effort
   */
  private Company responsible;

  /**
   * Constructor for efforts
   *
   * @param totalPrice
   * @param startDate
   * @param endDate
   * @param responsible
   */
  public Effort(int totalPrice, GregorianCalendar startDate, GregorianCalendar endDate, Company responsible) {
    this.totalPrice = totalPrice;
    this.startDate = startDate;
    this.endDate = endDate;
    this.responsible = responsible;
  }

  /**
   * Get total price
   *
   * @return totalPrice
   */
  public int getTotalPrice() {
    return totalPrice;
  }

  /**
   * Set total price
   *
   * @param totalPrice
   */
  public void setTotalPrice(int totalPrice) {
    this.totalPrice = totalPrice;
  }

  /**
   * Get start date
   *
   * @return startDate
   */
  public GregorianCalendar getStartDate() {
    return startDate;
  }

  /**
   * Set start date
   *
   * @param startDate
   */
  public void setStartDate(GregorianCalendar startDate) {
    this.startDate = startDate;
  }

  /**
   * Get end date
   *
   * @return endDate
   */
  public GregorianCalendar getEndDate() {
    return endDate;
  }

  /**
   * Set end date
   *
   * @param endDate
   */
  public void setEndDate(GregorianCalendar endDate) {
    this.endDate = endDate;
  }

  /**
   * Get responsible company
   *
   * @return responsible
   */
  public Company getResponsible() {
    return responsible;
  }

  /**
   * Set responsible company
   *
   * @param responsible
   */
  public void setResponsible(Company responsible) {
    this.responsible = responsible;
  }
}
