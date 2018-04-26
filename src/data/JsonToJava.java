package data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 *
 */
public class JsonToJava {

  public static void main(String[] args) throws IOException {
    try (Reader reader = new InputStreamReader(JsonToJava.class.getResourceAsStream("./Output.json"), "UTF-8")) {

      Gson gson = new GsonBuilder().create();
      DataCase dc = gson.fromJson(reader, DataCase.class);
      System.out.println(dc);
    }
  }
}
