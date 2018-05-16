package domain;

import acq.IEffort;
import acq.IOffer;
import acq.IParagraph;
import acq.IService;
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
  @Override
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
  @Override
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
  @Override
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
  @Override
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

  @Override
  public void setService(IService service) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void setOffer(IOffer offer) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void setParagraph(IParagraph paragraph) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public IService getService() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public IOffer getOffer() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public IParagraph getParagraph() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}
