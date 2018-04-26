package data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 *
 */
public class JavaToJson {

  public void JavaObjectToJson(String caseid, String name, String citizen, String effort, String participants) throws IOException {
    try (Writer writer = new FileWriter("Output.json", true)) {
      Gson gson = new GsonBuilder().setPrettyPrinting().create();
      JsonObject innerObject = new JsonObject();
      JsonObject user = new JsonObject();
      user.addProperty("name", "niels");

      innerObject.add("USER", user);
      innerObject.addProperty("Citizen", citizen);
      innerObject.addProperty("Effort", effort);
      innerObject.addProperty("Participants", participants);

      JsonObject jsonObject = new JsonObject();
      jsonObject.add(caseid, innerObject);

      gson.toJson(jsonObject, writer);

      writer.close();
    } catch (JsonIOException e) {
      System.out.println(e);
    }
  }

}
