package gui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TabPane;

public class CreateCaseController extends Controller {

  @FXML
  private TabPane caseTabPane;

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }

  @FXML
  private void nextButtonClicked(ActionEvent event) {
    caseTabPane.getSelectionModel().selectNext();
  }

}
