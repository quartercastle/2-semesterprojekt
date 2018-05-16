package domain;

import acq.IParagraph;

public class Paragraph implements IParagraph {

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
   *
   * @return number
   */
  @Override
  public int getNumber() {
    return this.number;
  }

  /**
   * Get title
   *
   * @return title
   */
  @Override
  public String getTitle() {
    return this.title;
  }

  /**
   * Get Description
   *
   * @return description
   */
  @Override
  public String getDescription() {
    return this.description;
  }

  /**
   * Set number
   *
   * @param number
   */
  @Override
  public void setNumber(int number) {
    this.number = number;
  }

  /**
   * Set title
   *
   * @param title
   */
  @Override
  public void setTitle(String title) {
    this.title = title;
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
