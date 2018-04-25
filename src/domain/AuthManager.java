package domain;

public class AuthManager {

  /**
   * Verify login
   *
   * @param username
   * @param password
   * @return true if ok
   */
  public static boolean vertify(String username, String password) {
    return username.equals("admin") && password.equals("admin");
  }
}
