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

//    IUser tempUser = DomainFacade.getInstance().getData().findUser(username);
//    User user = new User();
//    Role role = new Role();
    //Role
//    IRole tempRole = tempUser.getRole();
//    role.setName(tempRole.getName());
//    role.setCanCreateCase(tempRole.canCreateCase());
//    role.setCanViewCase(tempRole.canViewCase());
//    role.setCanEditCase(tempRole.canEditCase());
//    role.setCanCloseCase(tempRole.canViewCase());
    //User
//    user.setUsername(tempUser.getUsername());
//    user.setPassword(tempUser.getPassword());
//    user.setRole(role);
    User user = (User) Mapper.map(DomainFacade.getInstance().getData().findUser(username), false);

    if (user == null) {
      return null;
    }

    if (!user.verify(password)) {
      return null;
    }

    return user;
  }
}
