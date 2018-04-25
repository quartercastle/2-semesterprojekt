package data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 *
 */
public class JavaToJson {

  public static void main(String[] args) throws IOException {

    try (Writer writer = new FileWriter("Output.json", true)) {
      Gson gson = new GsonBuilder().setPrettyPrinting().create();
      JsonObject innerObject = new JsonObject();

      innerObject.addProperty("UUID", "12312");
      innerObject.addProperty("USER", "Niels");
      innerObject.addProperty("Citizen", "Peter");
      innerObject.addProperty("Effort", "Test");
      innerObject.addProperty("Participants", "Test");

      JsonObject jsonObject = new JsonObject();
      jsonObject.add("Case 2", innerObject);

      gson.toJson(jsonObject, writer);

      writer.close();
    }
  }
}
