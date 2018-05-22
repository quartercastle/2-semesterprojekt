package data.model;

import acq.IService;
import acq.ServiceUnit;
import data.Database;

public class DataService implements IService {

  /**
   * ID
   */
  private int id;

  /**
   * Name of service
   */
  private String name;

  /**
   * Description of a Service
   */
  private String description;

  /**
   * Frequency of the service
   */
  private int frequency;

  /**
   * The service unit, can be daily, monthly and yearly
   */
  private ServiceUnit unit;

  /**
   * Price unit price of service
   */
  private int price;

  /**
   * How often should the service be repeated
   */
  private int repetition;

  /**
   * Constructor for Dataservice
   *
   * @param name
   * @param description
   * @param frequency
   * @param unit
   * @param price
   * @param repetition
   */
  public DataService(String name, String description, int frequency, ServiceUnit unit, int price, int repetition) {
    this.name = name;
    this.description = description;
    this.frequency = frequency;
    this.unit = unit;
    this.price = price;
    this.repetition = repetition;
  }

  /**
   * Get id
   *
   * @return id
   */
  public int getID() {
    return this.id;
  }

  /**
   * Get name
   *
   * @return name
   */
  @Override
  public String getName() {
    return this.name;
  }

  /**
   * Get description
   *
   * @return description
   */
  @Override
  public String getDescription() {
    return this.description;
  }

  /**
   * Get frequency
   *
   * @return frequency
   */
  @Override
  public int getFrequency() {
    return this.frequency;
  }

  /**
   * Get unit
   *
   * @return unit
   */
  @Override
  public ServiceUnit getUnit() {
    return this.unit;
  }

  /**
   * Get price
   *
   * @return price
   */
  @Override
  public int getPrice() {
    return this.price;
  }

  /**
   * Get repetition
   *
   * @return repetition
   */
  @Override
  public int getRepetition() {
    return this.repetition;
  }

  /**
   * Set id
   *
   * @param id
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * set name
   *
   * @param name
   */
  @Override
  public void setName(String name) {
    this.name = name;
  }

  /**
   * set description
   *
   * @param description
   */
  @Override
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * set frequency
   *
   * @param frequency
   */
  @Override
  public void setFrequency(int frequency) {
    this.frequency = frequency;
  }

  /**
   * set unit
   *
   * @param unit
   */
  @Override
  public void setUnit(ServiceUnit unit) {
    this.unit = unit;
  }

  /**
   * Set price
   *
   * @param price
   */
  @Override
  public void setPrice(int price) {
    this.price = price;
  }

  /**
   * set repitition
   *
   * @param repetition
   */
  @Override
  public void setRepetition(int repetition) {
    this.repetition = repetition;
  }

  /**
   * Find service in Database
   *
   * @param id
   * @return service
   */
  public static DataService find(int id) {
    DataService service = new DataService(null, null, 0, null, 0, 0);
    Database.getInstance().query(Database.compose(
            "SELECT id, name, frequency, unit, price, repetition, description",
            "FROM services",
            "WHERE id = " + id
    ),
            rs -> {
              service.setId(rs.getInt(1));
              service.setName(rs.getString(2));
              service.setFrequency(rs.getInt(3));
              service.setUnit(ServiceUnit.find(rs.getInt(4)));
              service.setPrice(rs.getInt(5));
              service.setRepetition(rs.getInt(6));
              service.setDescription(rs.getString(7));
            }
    );
    return service;
  }

  /**
   * Save services to database
   */
  public void save() {
    String query = null;

    if (getID() == 0) {
      String[] values = {getName(), "" + getFrequency(), "" + getUnit(), "" + getPrice(), "" + getRepetition(), getDescription()};
      query = Database.compose(
              "INSERT INTO services (name, frequency, unit, price, repetition, description)",
              "VALUES('" + String.join("','", values) + "')",
              "RETURNING id"
      );
    } else {
      query = Database.compose(
              "UPDATE services SET",
              "name = '" + getName() + "',",
              "frequency = " + getFrequency() + ",",
              "unit = " + getUnit() + ",",
              "price =" + getPrice() + ",",
              "repetition = " + getRepetition() + ",",
              "description = '" + getDescription() + "'",
              "WHERE id = " + getID()
      );
    }
    Database.getInstance().query(query, rs -> {
      if (id == 0) {
        id = rs.getInt(1);
      }
    });
  }
}
