package data.model;

import acq.IAddress;
import acq.ICaseWorker;
import acq.IUser;
import data.Database;

public class DataCaseWorker extends DataPerson implements ICaseWorker {

  private int id;
  /**
   * User in system that DataCaseWorker is connected to
   */
  private IUser user;

  public DataCaseWorker(String firstName, String middleName, String lastName, IAddress address, String phone, String email) {
    super(firstName, middleName, lastName, address, phone, email);
    this.id = 0;
  }

  /**
   * set user
   *
   * @param user
   */
  @Override
  public void setUser(IUser user) {
    this.user = user;
  }

  /**
   * get user
   *
   * @return user
   */
  @Override
  public IUser getUser() {
    return this.user;
  }

  /**
   * Get caseworker id
   *
   * @return id for caseworker
   */
  @Override
  public int getID() {
    return this.id;
  }

  public static DataCaseWorker find(int id) {
    DataCaseWorker caseWorker = new DataCaseWorker(null, null, null, null, null, null);
    Database.getInstance().query(Database.compose(
            "SELECT id, person_id, user_id",
            "FROM case_workers",
            "WHERE id = " + id
    ),
            rs -> {
              caseWorker.setId(rs.getInt(1));
              caseWorker.SetPersonId(rs.getInt(2));
              DataPerson dataPerson = DataPerson.find(rs.getInt(2));
              caseWorker.setFirstName(dataPerson.getFirstName());
              caseWorker.setMiddleName(dataPerson.getMiddleName());
              caseWorker.setLastName(dataPerson.getMiddleName());
              caseWorker.setAddress(dataPerson.getAddress());
              caseWorker.setPhone(dataPerson.getPhone());
              caseWorker.setEmail(dataPerson.getEmail());
              caseWorker.setUser(DataUser.find(rs.getInt(3)));
            });
    return caseWorker;
  }

  public void save() {
    String query = null;
    super.save();
    ((DataUser) user).save();

    if (getId() == 0) {
      String[] values = {super.getId() + "", "" + getUser().getId()};

      query = Database.compose(
              "INSERT INTO case_workers (person_id, user_id)",
              "VALUES('" + String.join("','", values) + "')",
              "RETURNING id"
      );
    } else {
      query = Database.compose(
              "UPDATE case_workers SET",
              "person_id = " + super.getId() + ",",
              "user_id = " + getUser().getId() + "",
              "WHERE id = " + getId()
      );

    }

    Database.getInstance().query(query, rs -> {
      if (id == 0) {
        id = rs.getInt(1);
      }
    });
  }

  public int getId() {
    return id;
  }

}
