package acq;

public interface IParagraph {

  /**
   * Get number
   *
   * @return number
   */
  int getNumber();

  /**
   * Get title
   *
   * @return title
   */
  String getTitle();

  /**
   * Get Description
   *
   * @return description
   */
  String getDescription();

  /**
   * Set number
   *
   * @param number
   */
  void setNumber(int number);

  /**
   * Set title
   *
   * @param title
   */
  void setTitle(String title);

  /**
   * Set description
   *
   * @param description
   */
  void setDescription(String description);

}
