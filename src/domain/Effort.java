package domain;

/**
 * Effort
 */
public class Effort {

  /**
   * Total price of effort
   */
  private int totalPrice;

  /**
   * Start date of effort
   */
  private Date startDate;

  /**
   * Start date of effort
   */
  private Date endDate;

  /**
   * Company responsible of effort
   */
  private Company responsible;

  /**
   * Constructor for efforts
   *
   * @param TotalPrice
   * @param startDate
   * @param endDate
   * @param responsible
   */
  public Effort(int TotalPrice, Date startDate, Date endDate, Company responsible) {
    this.totalPrice = totalPrice;
    this.startDate = startDate;
    this.endDate = endDate;
    this.responsible = responsible;
  }

  /**
   * Get total price
   *
   * @return
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
   * @return
   */
  public Date getStartDate() {
    return startDate;
  }

  /**
   * Set start date
   *
   * @param startDate
   */
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   * Get end date
   *
   * @return
   */
  public Date getEndDate() {
    return endDate;
  }

  /**
   * Set end date
   *
   * @param endDate
   */
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  /**
   * Get responsible company
   *
   * @return
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
