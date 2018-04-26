package data;

import acq.ICompany;
import acq.IEffort;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author niclasjohansen
 */
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
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public GregorianCalendar getStartDate() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public GregorianCalendar getEndDate() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public ICompany getResponsible() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

}
