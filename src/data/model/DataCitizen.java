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

  /**
   * get id
   *
   * @return Citizen id
   */
  @Override
  public int getID() {
    return this.id;
  }

  /**
   * Searches for citizen in database
   *
   * @param cpr of citizen
   * @return if found, returns instanse of DataCitizen
   */
  public static DataCitizen find(int id) {
    //TODO
    return null;
  }

  /**
   * saves DataCitizen to database
   */
  public void save() {
    String query = null;

    if (getID() == 0) {
      query = "INSERT INTO citizens (person_id, cpr) "
              + "VALUES('" + CPR + "');";
    } else {
      query = "UPDATE citizens "
              + "SET cpr = '" + getCPR() + "WHERE id = " + id;
    }

    Database.getInstance().query(query, rs -> {
    });
  }

}
