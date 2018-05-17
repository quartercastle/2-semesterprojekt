package domain.system;

import acq.ServiceUnit;
import acq.IService;

/**
 *
 * Service class that implements the IService interface and holds getters and
 * setters methods.
 */
public class Service implements IService {

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
}
