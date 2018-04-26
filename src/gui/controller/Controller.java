package gui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

public class Controller implements Initializable {

  private Stage stage;

  @Override
  public void initialize(URL location, ResourceBundle resources) {
  }

  public Stage getStage() {
    return stage;
  }

  public void setStage(Stage stage) {
    this.stage = stage;
  }
}
