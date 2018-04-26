/*
 * Facade class for coommunicating with data layer
 */
package data;

import acq.ICase;
import acq.IData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataFacade implements IData {

  /**
   * Instance of the class itself, used for singleton setup. Is set to null
   * initially, instantiated if needed though getInstance()
   */
  public static DataFacade data;

  /**
   * Disable normal instantiation
   */
  private DataFacade() {
  }

  /**
   * Singleton setup for DomainFacade, returns instance of the class if none has
   * been made. If one has been made, returns that created instance
   *
   * @return Singleton instanse of DataFacade
   */
  public static DataFacade getInstance() {
    if (data == null) {
      data = new DataFacade();
    }

    return data;
  }

  @Override
  public Collection<ICase> getCases() {
    Collection<ICase> c = null;
    try {
      JsonToJava jtj = new JsonToJava("Output.json");
      c = new ArrayList<>(jtj.loadCases());

    } catch (IOException ex) {
      ex.printStackTrace();
    }
    return c;
  }

  @Override
  public void save() {
    DataCase dataCase = new DataCase(
            new UUID(5, 3),
            new DataUser(
                    "name",
                    "email",
                    "password",
                    new DataRole(
                            "name",
                            true,
                            true,
                            true,
                            true,
                            true)),
            new DataCitizen(
                    "firstName",
                    "middleName",
                    "lastName",
                    "CPR",
                    new DataAddress(
                            "firstline",
                            "secondaryline",
                            "zip",
                            "city",
                            "country"),
                    "phone",
                    "email"
            ),
            new DataEffort(
                    5,
                    new GregorianCalendar(
                            1994,
                            06,
                            8),
                    new GregorianCalendar(
                            1995,
                            06,
                            8),
                    new DataCompany(
                            "name",
                            new DataAddress(
                                    "firstline",
                                    "secondaryline",
                                    "zip",
                                    "city",
                                    "country"))
            ));
    Collection<DataCase> dataCollection = new ArrayList();
    dataCollection.add(dataCase);

    try (Writer writer = new FileWriter("Output.json", false)) {
      Gson gson = new GsonBuilder().setPrettyPrinting().create();

      gson.toJson(dataCollection, writer);
    } catch (IOException ex) {
      Logger.getLogger(DataFacade.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
