package domain;

public class Effort {

  /*
  * Total price of effort
   */
  private int totalPrice;

  /*
  * Start date of effort
   */
  private Date startDate;

  /*
  * End date of effort
   */
  private Date endDate;

  /*
  * The company responsible of effort
   */
  private Company responsible;

  /*
  * Constructor for effort
   */
  public Effort(int TotalPrice, Date startDate, Date endDate, Company responsible) {
    this.totalPrice = totalPrice;
    this.startDate = startDate;
    this.endDate = endDate;
    this.responsible = responsible;
  }

  /*
  * Get total price
   */
  public int getTotalPrice() {
    return totalPrice;
  }

  /*
  * Set total price
   */
  public void setTotalPrice(int totalPrice) {
    this.totalPrice = totalPrice;
  }

  /*
  * Get start date
   */
  public Date getStartDate() {
    return startDate;
  }

  /*
  * Set start date
   */
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /*
  * Get end date
   */
  public Date getEndDate() {
    return endDate;
  }

  /*
  * Set end date
   */
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  /*
  * Get responsible company
   */
  public Company getResponsible() {
    return responsible;
  }

  /*
  * Set responsible company
   */
  public void setResponsible(Company responsible) {
    this.responsible = responsible;
  }
}
