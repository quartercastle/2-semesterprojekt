package acq;

import java.util.Collection;

public interface ICaseWorker {

  /**
   * set user
   *
   * @param user
   */
  void setUser(IUser user);

  /**
   * get user
   *
   * @return user
   */
  IUser getUser();

  /**
   * get ID for caseworker
   *
   * @return caseworker id
   */
  int getId();

  /**
   * set ID
   *
   * @param id
   */
  void setId(int id);

}
