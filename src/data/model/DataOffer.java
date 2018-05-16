package data.model;

import acq.IOffer;

public class DataOffer implements IOffer {

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

}
