package data.model;

import acq.IOffer;
import data.Database;

public class DataOffer implements IOffer {

  /**
   * ID
   */
  private int id;

  /**
   * Name of offer
   */
  private String name;

  /**
   * Price of offer
   */
  private int price;

  /**
   * Description of offer
   */
  private String description;

  /**
   * Constructor for DataOffer
   *
   * @param name
   * @param price
   * @param description
   */
  public DataOffer(String name, int price, String description) {
    this.name = name;
    this.price = price;
    this.description = description;
  }

  /**
   * Get ID
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
    return name;
  }

  /**
   * Set name
   *
   * @param name
   */
  @Override
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Get price
   *
   * @return price
   */
  @Override
  public int getPrice() {
    return price;
  }

  /**
   * Set id;
   *
   * @param id
   */
  public void setID(int id) {
    this.id = id;
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
   * Get description
   *
   * @return description
   */
  @Override
  public String getDescription() {
    return description;
  }

  /**
   * Set description
   *
   * @param description
   */
  @Override
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Find offer in database
   *
   * @param id
   * @return offer
   */
  public static DataOffer find(int id) {
    DataOffer offer = new DataOffer(null, 0, null);
    Database.getInstance().query(Database.compose(
            "SELECT id, name, price, description",
            "FROM offers",
            "WHERE id = " + id
    ),
            rs -> {
              offer.setID(1);
              offer.setName(rs.getString(2));
              offer.setPrice(rs.getInt(3));
              offer.setDescription(rs.getString(4));
            });

    return offer;
  }

  /**
   * Save offer in the Database
   */
  public void save() {
    String query = null;

    if (getID() == 0) {
      String[] values = {getName(), "" + getPrice(), getDescription()};
      query = Database.compose(
              "INSERT INTO offers (name, price, description)",
              "VALUES('" + String.join("','", values) + "')",
              "RETURNING id"
      );
    } else {
      query = Database.compose(
              "UPDATE offers SET",
              "name = '" + getName() + "',",
              "price = " + getPrice() + ",",
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
