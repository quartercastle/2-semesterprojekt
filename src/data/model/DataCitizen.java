package data.model;

import acq.IAddress;
import acq.ICitizen;
import data.Database;

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
   * No args construct for DataCitizen
   */
  public DataCitizen() {
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
  public int getId() {
    return this.id;
  }

  /**
   * set id
   *
   * @param id
   */
  @Override
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Searches for citizen in database
   *
   * @param id of citizen
   * @return if found, returns instanse of DataCitizen
   */
  public static DataCitizen find(int id) {
    DataCitizen dc = new DataCitizen(null, null, null, null, null, null, null);
    Database.getInstance().query(
            "SELECT id, person_id, cpr "
            + "FROM citizens "
            + "WHERE id = " + id,
            rs -> {
              DataPerson dp = DataPerson.find(rs.getInt(2));
              dc.setId(rs.getInt(1));
              dc.setPersonId(rs.getInt(2));
              dc.setFirstName(dp.getFirstName());
              dc.setMiddleName(dp.getMiddleName());
              dc.setLastName(dp.getLastName());
              dc.setAddress(dp.getAddress());
              dc.setPhone(dp.getPhone());
              dc.setEmail(dp.getEmail());
              dc.setCPR(rs.getString(3));

            });

    return dc;
  }

  /**
   * saves DataCitizen to database
   */
  @Override
  public void save() {
    String query = null;
    super.save();

    if (getId() == 0) {

      query = "INSERT INTO citizens (person_id, cpr) "
              + "VALUES(" + super.getId() + ", '" + CPR + "') "
              + "RETURNING id;";
    } else {
      query = "UPDATE citizens "
              + "SET cpr = '" + getCPR() + "' WHERE id = " + id;
    }

    Database.getInstance().query(query, rs -> {
      if (id == 0) {
        id = rs.getInt(1);
      }
    });
  }
}
