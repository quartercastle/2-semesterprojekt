package domain.system;

import acq.IAddress;
import acq.ICompany;

/**
 * Company class
 */
public class Company implements ICompany {

  /**
   * Company id
   */
  private int id;

  /**
   * Name of the company
   */
  private String name;

  /**
   * The company's address
   */
  private IAddress address;

  /**
   * Construct Address
   *
   * @param name
   * @param address
   */
  public Company(String name, Address address) {
    this.name = name;
    this.address = address;
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
   * Get address
   *
   * @return address
   */
  @Override
  public IAddress getAddress() {
    return address;
  }

  /**
   * Set address
   *
   * @param address
   */
  public void setAddress(Address address) {
    this.address = address;
  }

  /**
   * Get address
   *
   * @param address
   */
  @Override
  public void setAddress(IAddress address) {
    this.address = address;
  }

  /**
   * Get id
   *
   * @return id
   */
  @Override
  public int getId() {
    return id;
  }
}
