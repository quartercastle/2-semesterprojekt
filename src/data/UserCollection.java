package data;

import acq.IUser;
import java.util.Collection;
import java.util.HashSet;

public class UserCollection {
  /**
   * Collection of users
   */
  private Collection<IUser> users = new HashSet<>();

  /**
   * Add case to collection
   * @param c
   */
  public void add (IUser c) {
    this.users.add(c);
  }

  /**
   * Delete case from collection
   * @param c
   */
  public void delete (IUser c) {
    Collection<IUser> users = new HashSet<>();

    for (IUser item : this.users) {
      if (c != item) {
        users.add(item);
      }
    }

    this.users = users;
  }
}
