package data.model;

import acq.ICompany;
import acq.IEffort;
import acq.IOffer;
import acq.IParagraph;
import acq.IService;
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
   * offer connected to the effort
   */
  private IOffer offer;

  /**
   * Service connected to effort
   */
  private IService service;

  /**
   * Paragraph cnnected to effort
   */
  private IParagraph paragraph;

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

  /**
   * set service
   *
   * @param service
   */
  @Override
  public void setService(IService service) {
    this.service = service;
  }

  /**
   * set offer
   *
   * @param offer
   */
  @Override
  public void setOffer(IOffer offer) {
    this.offer = offer;
  }

  /**
   * set paragraph
   *
   * @param paragraph
   */
  @Override
  public void setParagraph(IParagraph paragraph) {
    this.paragraph = paragraph;
  }

  /**
   * get service
   *
   * @return service
   */
  @Override
  public IService getService() {
    return this.service;
  }

  /**
   * get offer
   *
   * @return offer
   */
  @Override
  public IOffer getOffer() {
    return this.offer;
  }

  /**
   * get paragraph
   *
   * @return paragraph
   */
  @Override
  public IParagraph getParagraph() {
    return this.paragraph;
  }

}
