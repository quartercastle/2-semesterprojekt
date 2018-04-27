package data.model;

import acq.ICompany;
import acq.IEffort;
import java.util.GregorianCalendar;

public class DataEffort implements IEffort {

  /**
   * Total price of effort
   */
  private Integer totalPrice;

  /**
   * Start date
   */
  private GregorianCalendar startDate;

  /**
   * End date
   */
  private GregorianCalendar endDate;

  /**
   * Company which is responsible for the effort
   */
  private DataCompany responsible;

  /**
   * Create a new instance of a DataEffort
   *
   * @param totalPrice
   * @param startDate
   * @param endDate
   * @param responsible
   */
  public DataEffort(Integer totalPrice, GregorianCalendar startDate, GregorianCalendar endDate, DataCompany responsible) {
    this.totalPrice = totalPrice;
    this.startDate = startDate;
    this.endDate = endDate;
    this.responsible = responsible;
  }

  /**
   * Get total price
   *
   * @return total price
   */
  @Override
  public int getTotalPrice() {
    return this.totalPrice;
  }

  /**
   * Get start date
   *
   * @return start date
   */
  @Override
  public GregorianCalendar getStartDate() {
    return this.startDate;
  }

  /**
   * Get end date
   *
   * @return end date
   */
  @Override
  public GregorianCalendar getEndDate() {
    return this.endDate;
  }

  /**
   * Get responsible
   *
   * @return responsible
   */
  @Override
  public ICompany getResponsible() {
    return this.responsible;
  }

}
