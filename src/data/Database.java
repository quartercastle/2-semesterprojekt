package data;

import config.PostgreSQLConfig;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

  /**
   * Instance of class
   */
  private static Database instance;

  /**
   * Host address
   */
  private final String host;

  /**
   * Username to database
   */
  private final String user;

  /**
   * Password to database
   */
  private final String password;

  /**
   * Connection to database
   */
  private Connection connection;

  /**
   * Private constructor
   *
   * @param host
   * @param user
   * @param password
   */
  private Database(String host, String user, String password) {
    this.host = host;
    this.user = user;
    this.password = password;
    this.connect();
  }

  /**
   * Get instance of database
   *
   * @return instance of database
   */
  public static Database getInstance() {
    if (instance == null) {
      PostgreSQLConfig config = new PostgreSQLConfig();
      instance = new Database(
              config.host,
              config.user,
              config.password
      );
    }
    return instance;
  }

  /**
   * Connect to database
   */
  private void connect() {
    try {
      Class.forName("org.postgresql.Driver");
    } catch (java.lang.ClassNotFoundException e) {
      System.out.println(e);
    }

    try {
      this.connection = DriverManager.getConnection(
              this.host + "/" + this.user,
              this.user,
              this.password
      );
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  /**
   * Use to make a query
   */
  @FunctionalInterface
  public interface Handler {

    void execute(ResultSet rs) throws SQLException;

  }

  /**
   * Called to make a query to database
   *
   * @param query
   * @param handler
   */
  public void query(String query, Handler handler) {
    ResultSet resultSet = null;
    try (Statement statement = this.connection.createStatement()) {

      if (query.toUpperCase().startsWith("UPDATE")) {
        statement.execute(query);
      } else {
        resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
          handler.execute(resultSet);
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      if (resultSet != null) {
        try {
          resultSet.close();
        } catch (SQLException ex) {
          Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    }
  }

  /**
   * Query statement without a handler
   * @param query
   */
  public void query(String query) {
    query(query, rs -> {});
  }

  /**
   * Compose sql lines together
   * @param  lines
   * @return a sql statement
   */
  public static String compose(String... lines) {
    return String.join("\n", lines);
  }
}
