/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Lasse
 */
public class Effort {

  private int TotalPrice;

  private Date StartDate;

  private Date EndDate;

  private Company Responsible;

  public Effort(int TotalPrice, Date StartDate, Date EndDate, Company Responsible) {
    this.TotalPrice = TotalPrice;
    this.StartDate = StartDate;
    this.EndDate = EndDate;
    this.Responsible = Responsible;
  }

  public int getTotalPrice() {
    return TotalPrice;
  }

  public void setTotalPrice(int TotalPrice) {
    this.TotalPrice = TotalPrice;
  }

  public Date getStartDate() {
    return StartDate;
  }

  public void setStartDate(Date StartDate) {
    this.StartDate = StartDate;
  }

  public Date getEndDate() {
    return EndDate;
  }

  public void setEndDate(Date EndDate) {
    this.EndDate = EndDate;
  }

  public Company getResponsible() {
    return Responsible;
  }

  public void setResponsible(Company Responsible) {
    this.Responsible = Responsible;
  }
