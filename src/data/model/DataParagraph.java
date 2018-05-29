package data.model;

import acq.IParagraph;
import data.Database;

public class DataParagraph implements IParagraph {

  /**
   * ID
   */
  private int id;

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
   * No-Args
   */
  public DataParagraph() {

  }

  /**
   * Constructor for dataparagraph
   *
   * @param number
   * @param title
   * @param description
   */
  public DataParagraph(int number, String title, String description) {
    this.number = number;
    this.title = title;
    this.description = description;
  }

  /**
   * Get id
   *
   * @return id
   */
  public int getID() {
    return this.id;
  }

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
   * Set ID
   *
   * @param id
   */
  public void setID(int id) {
    this.id = id;
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

  /**
   * Find paragraph in Database
   *
   * @param id
   * @return paragraph
   */
  public static DataParagraph find(int id) {
    DataParagraph paragraph = new DataParagraph();
    Database.getInstance().query(Database.compose(
            "SELECT id, number, title, description",
            "FROM paragraphs",
            "WHERE id = " + id
    ),
            rs -> {
              paragraph.setID(rs.getInt(1));
              paragraph.setNumber(rs.getInt(2));
              paragraph.setTitle(rs.getString(3));
              paragraph.setDescription(rs.getString(4));
            }
    );
    return paragraph;
  }

  /**
   * Save paragraphs to database
   */
  public void save() {
    String query = null;

    if (getID() == 0) {
      String[] values = {"" + getNumber(), getTitle(), getDescription()};
      query = Database.compose(
              "INSERT INTO paragraphs (number, title, description)",
              "VALUES('" + String.join("','", values) + "')",
              "RETURNING id"
      );
    } else {
      query = Database.compose(
              "UPDATE paragraphs SET",
              "number = " + getNumber() + ",",
              "title = '" + getTitle() + "',",
              "description = '" + getDescription() + "'",
              "WHERE id = " + getID()
      );
    }
    Database.getInstance().query(query, rs -> {
      if (id == 0) {
        id = rs.getInt(1);
      }
    });
  }
}
