package gui.controller;

import gui.GUI;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * FXML Controller class
 *
 */
public class OverviewController extends Controller {

  /**
   * Opens up CreateCase stage
   *
   * @param event
   */
  @FXML
  private void openCaseAction(ActionEvent event) {

    GUI.getInstance().showStage("CreateCase");
    GUI.getInstance().getDomain().createCase();
  }
}
