package data.model;

import acq.ICitizen;

/**
 *
 *
 */
public class DataCitizen extends DataPerson implements ICitizen {

  private String CPR;

  @Override
  public String getCPR() {
    return this.CPR;
  }

  @Override
  public void setCPR(String cpr) {
    this.CPR = cpr;
  }

}
