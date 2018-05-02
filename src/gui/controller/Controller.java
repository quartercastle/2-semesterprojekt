package gui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

public abstract class Controller implements Initializable {

  /**
   * Stage for window
   */
  private Stage stage;

  /**
   * Get stage
   *
   * @return stage
   */
  public Stage getStage() {
    return stage;
  }

  /**
   * Set stage
   *
   * @param stage
   */
  public void setStage(Stage stage) {
    this.stage = stage;
  }

  /**
   * open window
   */
  public void open() {
    stage.show();
    stage.requestFocus();
  }

  /**
   * Initialize
   *
   * @param location
   * @param resources
   */
  public void initialize(URL location, ResourceBundle resources) {
  }

}
