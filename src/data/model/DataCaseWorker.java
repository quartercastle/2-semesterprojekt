package data.model;

import acq.IAddress;
import acq.ICaseWorker;
import acq.IUser;
import data.Database;

public class DataCaseWorker extends DataPerson implements ICaseWorker {

  /**
   * Id
   */
  private int id;

  /**
   * User in system that DataCaseWorker is connected to
   */
  private IUser user;

  /**
   * No args constructor for CaseWorker
   */
  public DataCaseWorker() {
  }

  /**
   * Create a new instance of DataCaseWorker
   *
   * @param firstName
   * @param middleName
   * @param lastName
   * @param address
   * @param phone
   * @param email
   */
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
   * Find a Case worker from db
   * @param  id
   * @return CaseWorker
   */
  public static DataCaseWorker find(int id) {
    return where("id", "" + id);
  }

  /**
   * Save the case worker to database
   */
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

  /**
   * Get id
   *
   * @return int id
   */
  public int getId() {
    return id;
  }

  /**
   * Fetch Case worker from where cluase
   * @param  key
   * @param  value
   * @return case worker
   */
  public static DataCaseWorker where(String key, String value) {
    DataCaseWorker caseWorker = new DataCaseWorker(null, null, null, null, null, null);
    Database.getInstance().query(Database.compose(
            "SELECT id, person_id, user_id",
            "FROM case_workers",
            "WHERE " + value + " = '" + value + "'"
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
}
