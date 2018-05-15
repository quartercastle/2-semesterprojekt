package data;

import Config.PostgreSQLConfig;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

  private static Database instance;

  private final String host;
  private final String user;
  private final String password;

  private Connection connection;

  private Database(String host, String user, String password) {
    this.host = host;
    this.user = user;
    this.password = password;
    this.connect();
  }

  public static Database getInstance() {
    if (instance == null) {
      PostgreSQLConfig config = new PostgreSQLConfig();
      Database db = new Database(
              config.host,
              config.user,
              config.password
      );
    }
    return instance;
  }

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

  @FunctionalInterface
  public interface Handler {

    void execute(ResultSet rs) throws SQLException;

  }

  public void query(String query, Handler handler) {
    Statement statement = null;
    ResultSet resultSet = null;

    try {
      statement = this.connection.createStatement();
      resultSet = statement.executeQuery(query);
      while (resultSet.next()) {
        handler.execute(resultSet);
      }
      resultSet.close();
      statement.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
