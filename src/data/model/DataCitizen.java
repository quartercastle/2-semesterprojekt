package data.model;

import acq.IAddress;
import acq.ICitizen;

/**
 *
 *
 */
public class DataCitizen extends DataPerson implements ICitizen {

  /**
   * Citizen CPR number
   */
  private String CPR;

  public DataCitizen(String firstName, String middleName, String lastName, IAddress address, String phone, String email, String CPR) {
    super(firstName, middleName, lastName, address, phone, email);
    this.CPR = CPR;
  }

  /**
   * get CPR
   *
   * @return CPR
   */
  @Override
  public String getCPR() {
    return this.CPR;
  }

  /**
   * Set cpr
   *
   * @param cpr
   */
  @Override
  public void setCPR(String cpr) {
    this.CPR = cpr;
  }

}
