package data.model;

import acq.IAddress;
import acq.ICitizen;
import data.Database;

/**
 *
 *
 */
public class DataCitizen extends DataPerson implements ICitizen {

  /**
   * Citizen CPR number
   */
  private String CPR;

  /**
   * server id
   */
  private int id;

  public DataCitizen(String firstName, String middleName, String lastName, IAddress address, String phone, String email, String CPR) {
    super(firstName, middleName, lastName, address, phone, email);
    this.CPR = CPR;
    this.id = 0;
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

  public int getID() {
    return this.id;
  }

//  public DataCitizen find(String cpr) {
//
//  }
  public void save() {
    String query = null;

    if (getID() == 0) {
      query = "INSERT INTO citizens (id, person_id, cpr) "
              + "VALUES('" + CPR + "');";
    } else {
      query = "UPDATE citizens "
              + "SET cpr = '" + getCPR() + "WHERE id = " + id;
    }

    Database.getInstance().query(query, rs -> {
    });
  }

}
