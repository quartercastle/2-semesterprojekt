package gui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

public abstract class Controller implements Initializable {

  private Stage stage;

  @Override
  public void initialize(URL location, ResourceBundle resources) {
  }

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

}
