package data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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

      Gson gson = new GsonBuilder().create();
      gson.toJson("Hello", writer);
      gson.toJson(132, writer);

      writer.close();
    }
  }
}
