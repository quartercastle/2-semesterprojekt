package domain.system;

import acq.IEffort;
import acq.IOffer;
import acq.IParagraph;
import acq.IService;
import java.util.Collection;
import java.util.GregorianCalendar;

/**
 * Effort
 */
public class Effort implements IEffort {

  /**
   * Id
   */
  private int id;

  /**
   * caseId
   */
  private int caseId;

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
   * Paragraph connected to effort
   */
  private Collection<IParagraph> paragraphs;

  /**
   * No-args Constructor
   */
  public Effort() {
  }

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

  /**
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
    paragraphs.add(paragraph);
  }

  /**
   * Set paragraphs
   *
   * @param paragraphs
   */
  @Override
  public void setParagraphs(Collection<IParagraph> paragraphs) {
    this.paragraphs = paragraphs;
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
  public Collection<IParagraph> getParagraphs() {
    return this.paragraphs;
  }

  /**
   * Get id
   *
   * @return id
   */
  @Override
  public int getId() {
    return id;
  }

  /**
   * Get caseId
   *
   * @return caseId
   */
  @Override
  public int getCaseId() {
    return caseId;
  }

  @Override
  public void setCaseId(int id) {
    caseId = id;
  }
}
