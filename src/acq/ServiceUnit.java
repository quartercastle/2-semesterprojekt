package acq;

/**
 * ServiceUnit enum
 *
 */
public enum ServiceUnit {
  /**
   * ENUM
   */
  Daily(1),
  Monthly(2),
  Yearly(3);

  /**
   * ID
   */
  private int id;

  /**
   * constructor for Serviceunit
   *
   * @param id
   */
  private ServiceUnit(int id) {
    this.id = id;
  }

  /**
   * find method for serviceunit
   *
   * @param id
   * @return either daily, monthly or Yearly - depends on the parameter
   */
  public static ServiceUnit find(int id) {
    switch (id) {
      case 1:
        return Daily;
      case 2:
        return Monthly;
      case 3:
        return Yearly;
      default:
        return null;
    }
  }

  /**
   * ToString method for Serviceunit
   *
   * @return id string
   */
  @Override
  public String toString() {
    return id + "";
  }

}
