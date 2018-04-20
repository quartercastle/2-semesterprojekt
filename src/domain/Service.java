package domain;

public class Service {
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
   * Get name
   * @return name
   */
  public String getName () {
    return this.name;
  }

  /**
   * Get description
   * @return description
   */
  public String getDescription () {
    return this.description;
  }

  /**
   * Get frequency
   * @return [description]
   */
  public int getFrequency () {
    return this.frequency;
  }

  /**
   * Get unit
   * @return unit
   */
  public ServiceUnit getUnit () {
    return this.unit;
  }

  /**
   * Get price
   * @return price
   */
  public int getPrice () {
    return this.price;
  }

  /**
   * Get repetition
   * @return repetition
   */
  public int getRepetition () {
    return this.repetition;
  }

  /**
   * Set name
   */
  public void setName (String name) {
    this.name = name;
  }

  /**
   * Set description
   */
  public void setDescription (String description) {
    this.description = description;
  }

  /**
   * Set frequency
   */
  public void setFrequency (int frequency) {
    this.frequency = frequency;
  }

  /**
   * Set unit
   */
  public void setUnit (ServiceUnit unit) {
    this.unit = unit;
  }

  /**
   * Set price
   */
  public void setPrice (int price) {
    this.price = price;
  }

  /**
   * Set repetition
   */
  public void setRepetition (int repetition) {
    this.repetition = repetition;
  }
}
