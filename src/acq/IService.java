package acq;

public interface IService {

  /**
   * Get name
   *
   * @return name
   */
  String getName();

  /**
   * Get description
   *
   * @return description
   */
  String getDescription();

  /**
   * Get frequency
   *
   * @return frequency
   */
  int getFrequency();

  /**
   * Get unit
   *
   * @return unit
   */
  ServiceUnit getUnit();

  /**
   * Get price
   *
   * @return price
   */
  int getPrice();

  /**
   * Get repetition
   *
   * @return repetition
   */
  int getRepetition();

  /**
   * set name
   *
   * @param name
   */
  void setName(String name);

  /**
   * set description
   *
   * @param description
   */
  void setDescription(String description);

  /**
   * set frequency
   *
   * @param frequency
   */
  void setFrequency(int frequency);

  /**
   * Set unit
   *
   * @param unit
   */
  void setUnit(ServiceUnit unit);

  /**
   * set price
   *
   * @param price
   */
  void setPrice(int price);

  /**
   * Set repetition
   *
   * @param repetition
   */
  void setRepetition(int repetition);

}
