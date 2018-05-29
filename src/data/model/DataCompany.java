package data.model;

import acq.IAddress;
import acq.ICompany;
import data.Database;

public class DataCompany implements ICompany {

  /**
   * Server id
   */
  private int id;

  /**
   * Name of company
   */
  private String name;

  /**
   * Address of company
   */
  private IAddress address;

  /**
   * No-Args
   */
  public DataCompany() {

  }

  /**
   * Create new instance of DataCompany
   *
   * @param name
   * @param address
   */
  public DataCompany(String name, DataAddress address) {
    this.name = name;
    this.address = address;
    id = 0;
  }

  /**
   * Called to find a DataCompany in database
   *
   * @param id of the company to find
   * @return a instance of DataCompany if found.
   */
  public static DataCompany find(int id) {
    DataCompany d = new DataCompany();
    Database.getInstance().query(
            "SELECT id, name, address_id "
            + "FROM companies "
            + "WHERE id = " + id,
            rs -> {
              d.setId(rs.getInt(1));
              d.setName(rs.getString(2));
              d.setAddress(DataAddress.find(rs.getInt(3)));
            });

    return d;
  }

  /**
   * Called to save
   */
  public void save() {
    String query = null;

    ((DataAddress) address).save();

    if (getId() == 0) {
      String[] values = {getName(), "" + getAddress().getId()};
      query = "INSERT INTO companies (name, address_id) "
              + "VALUES('" + String.join("','", values) + "') "
              + "RETURNING id";
    } else {
      query = "UPDATE companies "
              + "SET name = '" + getName() + "', address_id = "
              + getAddress().getId()
              + "WHERE id = " + id;
    }

    Database.getInstance().query(query, rs -> {
      if (id == 0) {
        id = rs.getInt(1);
      }
    });
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
   * Get address
   *
   * @return address
   */
  @Override
  public IAddress getAddress() {
    return this.address;
  }

  /**
   * Set address
   *
   * @param address
   */
  @Override
  public void setAddress(IAddress address) {
    this.address = address;
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
   * Get id
   *
   * @return id
   */
  public int getId() {
    return id;
  }

  /**
   * Set id
   *
   * @param id
   */
  public void setId(int id) {
    this.id = id;
  }
}
