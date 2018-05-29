package data.model;

import acq.ICompany;
import acq.IEffort;
import acq.IOffer;
import acq.IParagraph;
import acq.IService;
import data.Database;
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;

public class DataEffort implements IEffort {

  /**
   * Id
   */
  private int id;

  /**
   * Case id
   */
  private int caseId;

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
  private ICompany responsible;

  /**
   * offer connected to the effort
   */
  private IOffer offer;

  /**
   * Service connected to effort
   */
  private IService service;

  /**
   * Paragraphs connected to effort
   */
  private Collection<IParagraph> paragraphs;

  public DataEffort() {
    paragraphs = new ArrayList<>();
  }

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
    paragraphs = new ArrayList<>();
  }

  /**
   * Find dataEffort
   *
   * @param id
   * @return dataEffort
   */
  public static DataEffort find(int id) {
    DataEffort effort = new DataEffort();
    Database.getInstance().query(Database.compose(
            "SELECT id, case_id, service_id, offer_id, total_price, start_date, end_date, responsibility",
            "FROM efforts",
            "WHERE id = " + id
    ),
            rs -> {
              effort.setId(rs.getInt(1));
              effort.setCaseId(rs.getInt(2));
              effort.setService(DataService.find(rs.getInt(3)));
              effort.setOffer(DataOffer.find(rs.getInt(4)));
              effort.setTotalPrice(rs.getInt(5));
              GregorianCalendar gc = new GregorianCalendar();
              gc.setTimeInMillis(rs.getTimestamp(6).getTime());
              effort.setStartDate(gc);
              GregorianCalendar g = new GregorianCalendar();
              gc.setTimeInMillis(rs.getTimestamp(7).getTime());
              effort.setEndDate(g);
              effort.setResponsible(DataCompany.find(rs.getInt(8)));
            });

    Database.getInstance().query(Database.compose(
            "SELECT paragraphs.id, paragraphs.number, paragraphs.title, paragraphs.description",
            "FROM paragraphs",
            "INNER JOIN effort_paragraphs ON effort_paragraphs.effort_id=" + id
    ), rs -> {
      DataParagraph p = new DataParagraph(rs.getInt(1), rs.getString(2), rs.getString(3));
      effort.setParagraph(p);
    });

    return effort;
  }

  /**
   * Save
   */
  public void save() {
    String query = null;

    ((DataCompany) responsible).save();
    ((DataOffer) offer).save();
    ((DataService) service).save();

    if (getId() == 0) {
      String[] values = {"" + getCaseId(), "" + ((DataService) getService()).getID(), "" + ((DataOffer) getOffer()).getID(), "" + getTotalPrice(),
        "" + getStartDate().getTime(), "" + getEndDate().getTime(), "" + ((DataCompany) getResponsible()).getId()};
      query = "INSERT INTO efforts (case_id, service_id, offer_id, total_price, start_date, end_date, responsibility) "
              + "VALUES('" + String.join("','", values) + "') "
              + "RETURNING id";
    } else {
      query = Database.compose(
              "UPDATE efforts SET",
              "case_id = " + getCaseId() + ",",
              "service_id = " + ((DataService) getService()).getID() + ",",
              "offer_id = " + ((DataOffer) getOffer()).getID() + ",",
              "total_price = " + getTotalPrice() + ",",
              "start_date = " + getStartDate().getTimeInMillis() + ",",
              "end_date = " + getEndDate().getTimeInMillis() + ",",
              "responsibility = " + ((DataCompany) getResponsible()).getId() + " ",
              "WHERE id = " + getId() + " ",
              "RETURNING id");
    }

    Database.getInstance().query(query, rs -> {
      if (id == 0) {
        id = rs.getInt(1);
      }
    });

    if (paragraphs.size() != 0) {
      for (IParagraph p : paragraphs) {
        ((DataParagraph) p).save();
        System.out.println("IIIIIIIDDDDDDDDDDd " + id);
        Database.getInstance().query(
                "INSERT INTO effort_paragraphs (effort_id, paragraph_id) "
                + "VALUES (" + id + ", " + ((DataParagraph) p).getID() + ") "
                + "RETURNING effort_id"
        );
      }
    }
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
    paragraphs.add(paragraph);
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
   * Set id
   *
   * @param id
   */
  public void setId(int id) {
    this.id = id;
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

  /**
   * Set caseId
   */
  public void setCaseId(int caseId) {
    this.caseId = caseId;
  }

  /**
   * Set totalPrice
   *
   * @param totalPrice
   */
  public void setTotalPrice(Integer totalPrice) {
    this.totalPrice = totalPrice;
  }

  /**
   * Set startDate
   *
   * @param startDate
   */
  public void setStartDate(GregorianCalendar startDate) {
    this.startDate = startDate;
  }

  /**
   * Set endDate
   *
   * @param endDate
   */
  public void setEndDate(GregorianCalendar endDate) {
    this.endDate = endDate;
  }

  /**
   * Set responsible
   *
   * @param responsible
   */
  public void setResponsible(DataCompany responsible) {
    this.responsible = responsible;
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

  @Override
  public void setResponsible(ICompany company) {
    responsible = company;
  }
}
