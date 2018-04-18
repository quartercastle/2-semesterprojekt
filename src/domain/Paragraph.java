package domain;

public class Paragraph {
  /**
   * Numbber of the paragraph
   */
  private int number;

  /**
   * Title of paragraph
   */
  private String title;

  /**
   * Description of Paragraph
   */
  private String description;

  /**
   * Get number
   * @return number
   */
  public int getNumber () {
    return this.number;
  }

  /**
   * Get title
   * @return title
   */
  public String getTitle () {
    return this.title;
  }

  /**
   * Get Description
   * @return description
   */
  public String getDescription () {
    return this.description;
  }

  /**
   * Set number
   * @param number
   */
  public void setNumber (int number) {
    this.number = number;
  }

  /**
   * Set title
   * @param title
   */
  public void setTitle (String title) {
    this.title = title;
  }

  /**
   * Set description
   * @param description
   */
  public void setDescription (String description) {
    this.description = description;
  }
}
