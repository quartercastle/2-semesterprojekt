package domain.security;

import acq.IRole;
import acq.IUser;
import domain.DomainFacade;

public class AuthManager {

  /**
   * Verify login
   *
   * @param username
   * @param password
   * @return true if ok
   */
  public static IUser verify(String username, String password) {
    //User user = Mapper.map(DomainFacade.getInstance().getData().findUser(username), false);
    IUser tempUser = DomainFacade.getInstance().getData().findUser(username);
    User user = new User();
    Role role = new Role();

    //Role
    IRole tempRole = tempUser.getRole();
    role.setName(tempRole.getName());
    role.setCanCreateCase(tempRole.canCreateCase());
    role.setCanViewCase(tempRole.canViewCase());
    role.setCanEditCase(tempRole.canEditCase());
    role.setCanCloseCase(tempRole.canViewCase());

    //User
    user.setUsername(tempUser.getUsername());
    user.setPassword(tempUser.getPassword());
    user.setRole(role);

    if (user == null) {
      return null;
    }

    if (!user.verify(password)) {
      return null;
    }

    return user;
  }
}
