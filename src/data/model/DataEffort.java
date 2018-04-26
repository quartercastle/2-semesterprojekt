package data.model;

import acq.ICompany;
import acq.IEffort;
import java.util.Date;
import java.util.GregorianCalendar;

public class DataEffort implements IEffort {

  private Integer totalPrice;
  private GregorianCalendar startDate;
  private GregorianCalendar endDate;
  private DataCompany responsible;

  public DataEffort(Integer totalPrice, GregorianCalendar startDate, GregorianCalendar endDate, DataCompany responsible) {
    this.totalPrice = totalPrice;
    this.startDate = startDate;
    this.endDate = endDate;
    this.responsible = responsible;
  }

  @Override
  public int getTotalPrice() {
    return this.totalPrice;
  }

  @Override
  public GregorianCalendar getStartDate() {
    return this.startDate;
  }

  @Override
  public GregorianCalendar getEndDate() {
    return this.endDate;
  }

  @Override
  public ICompany getResponsible() {
    return this.responsible;
  }

}
