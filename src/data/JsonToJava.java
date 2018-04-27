package data;

import acq.IAddress;
import acq.ICase;
import acq.ICitizen;
import acq.ICompany;
import acq.IEffort;
import acq.IRole;
import acq.IUser;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashSet;
import data.model.*;

/**
 * Class responsbile for translating JSON objects into Java, from a JSON file
 *
 */
public class JsonToJava {

  /**
   * Name of the file that contains the data to be deserialized
   */
  String fileName;
  /**
   * Instanse of Gson, instantiated in the constructor
   */
  Gson g = null;

  /**
   * Constructor
   *
   * @param fileName
   */
  public JsonToJava(String fileName) {
    this.fileName = fileName;
    g = new Gson();
  }

  /**
   * Loads collection of cases from Json file into Java collection
   *
   * @return ArrayList of Cases
   * @throws IOException
   */
  public Collection<ICase> loadCases() throws IOException {
    try (JsonReader json = new JsonReader(new FileReader(fileName))) {
      Gson g = new GsonBuilder()
              .registerTypeHierarchyAdapter(ICase.class, new CaseDeserializer()) //Tells that parser what deserializer to use for ICase instanses
              .create();
      Type targetClassType = new TypeToken<HashSet<ICase>>() { //Generates a typetoken to help Json translate from JSON-array to Java HashSet of ICase instanses
      }.getType();
      Collection<ICase> c = g.fromJson(json, targetClassType);
      return c;
    }

  }

  /**
   * Deserializes Cases from JSON to Java-code Necessary because the Gson parser
   * can't read interfaces
   */
  private class CaseDeserializer implements JsonDeserializer<ICase> {

    @Override
    public ICase deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
      Gson g = new GsonBuilder()
              .registerTypeHierarchyAdapter(IUser.class, new UserDeserializer()) //Tells that parser what deserializer to use for IUser instanses
              .registerTypeHierarchyAdapter(ICitizen.class, new CitizenDeserializer()) //Tells that parser what deserializer to use for ICitizen instanses
              .registerTypeHierarchyAdapter(IEffort.class, new EffortDeserializer()) //Tells that parser what deserializer to use for IEffort instanses
              .registerTypeHierarchyAdapter(IAddress.class, new AddressDeserializer())
              .create();
      return (DataCase) g.fromJson(je, DataCase.class);
    }

  }

  /**
   * Deserializes Users from JSON to Java-code Necessary because the Gson parser
   * can't read interfaces
   */
  private class UserDeserializer implements JsonDeserializer<IUser> {

    @Override
    public IUser deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
      Gson g = new GsonBuilder()
              .registerTypeHierarchyAdapter(IRole.class, new RoleDeserializer()) //Tells that parser what deserializer to use for IRole instanses
              .create();

      return (DataUser) g.fromJson(je, DataUser.class);
    }

  }

  /**
   * Deserializes Citizen from JSON to Java-code Necessary because the Gson
   * parser can't read interfaces
   */
  private class CitizenDeserializer implements JsonDeserializer<ICitizen> {

    @Override
    public ICitizen deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
      Gson g = new GsonBuilder()
              .registerTypeHierarchyAdapter(IAddress.class, new AddressDeserializer()) //Tells that parser what deserializer to use for IAddress instanses
              .create();

      return (DataCitizen) g.fromJson(je, DataCitizen.class);
    }

  }

  /**
   * Deserializes Efforts from JSON to Java-code Necessary because the Gson
   * parser can't read interfaces
   */
  private class EffortDeserializer implements JsonDeserializer<IEffort> {

    @Override
    public IEffort deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
      Gson g = new GsonBuilder()
              .registerTypeHierarchyAdapter(ICompany.class, new CompanyDeserializer()) //Tells that parser what deserializer to use for ICompany instanses
              .create();

      return (DataEffort) g.fromJson(je, DataEffort.class);

    }
  }

  /**
   * Deserializes Roles from JSON to Java-code Necessary because the Gson parser
   * can't read interfaces
   */
  private class RoleDeserializer implements JsonDeserializer<IRole> {

    @Override
    public IRole deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
      Gson g = new GsonBuilder().create(); //no TypeHierachyAdapter registered due to role only containing primitive datatypes

      return (DataRole) g.fromJson(je, DataRole.class);
    }

  }

  /**
   * Deserializes Company from JSON to Java-code Necessary because the Gson
   * parser can't read interfaces
   */
  private class CompanyDeserializer implements JsonDeserializer<ICompany> {

    @Override
    public ICompany deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
      Gson g = new GsonBuilder()
              .registerTypeHierarchyAdapter(IAddress.class, new AddressDeserializer()) ////Tells that parser what deserializer to use for IAddresss instanses
              .create();

      return (DataCompany) g.fromJson(je, DataCompany.class);
    }

  }

  /**
   * Deserializes Adress from JSON to Java-code Necessary because the Gson
   * parser can't read interfaces
   */
  private class AddressDeserializer implements JsonDeserializer<IAddress> {

    @Override
    public IAddress deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
      Gson g = new GsonBuilder().create(); //no TypeHierachyAdapter registered due to Adress only containing primitive datatypes

      return (DataAddress) g.fromJson(je, DataAddress.class);
    }

  }
}
