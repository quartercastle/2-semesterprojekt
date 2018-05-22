package domain.security;

import acq.IUser;
import domain.DomainFacade;
import util.Mapper;

public class AuthManager {

  /**
   * Verify login
   *
   * @param username
   * @param password
   * @return true if ok
   */
  public static IUser verify(String username, String password) {
    User user = Mapper.map(DomainFacade.getInstance().getData().findUser(username), false);

    if (user == null) {
      return null;
    }

    if (!user.verify(password)) {
      return null;
    }

    return user;
  }
}
