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

  public static DataCaseWorker find(int id) {
    DataCaseWorker caseWorker = new DataCaseWorker(null, null, null, null, null, null);
    Database.getInstance().query(Database.compose(
            "SELECT id, person_id, user_id",
            "FROM case_worker",
            "WHERE id = " + id
    ),
            rs -> {
              caseWorker.setId(rs.getInt(1));
              DataPerson dataPerson = new DataPerson.find(rs.getint(2));
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

    if (getId() == 0) {
      String[] values = {
        super.getId() + ""
        getUser().getId() + ""
    }
    query = Database.compose(
            "INSERT INTO case_workers (person_id, user_id)",
            "VALUES"
    )
  }

}

public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

}
