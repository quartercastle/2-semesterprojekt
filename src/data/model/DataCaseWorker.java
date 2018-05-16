package data.model;

import acq.IAddress;
import acq.ICaseWorker;
import acq.IUser;

public class DataCaseWorker extends DataPerson implements ICaseWorker {

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

}
