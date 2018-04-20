package domain;

public class Offer {

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
   * Constructor for offers
   *
   * @param name
   * @param price
   * @param description
   */
  public Offer(String name, int price, String description) {
    this.name = name;
    this.price = price;
    this.description = description;
  }

  /**
   * Get name
   *
   * @return
   */
  public String getName() {
    return name;
  }

  /**
   * Set name
   *
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Get price
   *
   * @return
   */
  public int getPrice() {
    return price;
  }

  /**
   * Set price
   *
   * @param price
   */
  public void setPrice(int price) {
    this.price = price;
  }

  /**
   * Get description
   *
   * @return
   */
  public String getDescription() {
    return description;
  }

  /**
   * Set description
   *
   * @param description
   */
  public void setDescription(String description) {
    this.description = description;
  }
}
