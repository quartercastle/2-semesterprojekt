package domain;

public class Offer {

  /*
  * Name of offer
   */
  private String name;

  /*
  * Price of offer
   */
  private int price;

  /*
  * Description of offer
   */
  private String description;

  /*
  * Constructor for offer
   */
  public Offer(String name, int price, String description) {
    this.name = name;
    this.price = price;
    this.description = description;
  }

  /*
  * Get name
   */
  public String getName() {
    return name;
  }

  /*
  * Set name
   */
  public void setName(String name) {
    this.name = name;
  }

  /*
  * Get price
   */
  public int getPrice() {
    return price;
  }

  /*
  * Set price
   */
  public void setPrice(int price) {
    this.price = price;
  }

  /*
  * Get description
   */
  public String getDescription() {
    return description;
  }

  /*
  * Set description
   */
  public void setDescription(String description) {
    this.description = description;
  }
}
