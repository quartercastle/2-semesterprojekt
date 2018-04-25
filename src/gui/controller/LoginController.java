package gui.controller;

import gui.GUI;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {

  /**
   * Reference to the label instance
   */
  @FXML
  private TextField usernameField;
  @FXML
  private TextField passwordField;

  @FXML
  private void loginAction(ActionEvent event) {
    if (GUI.getInstance().getDomain().verify(
            usernameField.getText(),
            passwordField.getText())) {
      //Go to main application

    } else {
      //Something went wrong
      Alert alert = new Alert(AlertType.ERROR);
      alert.setTitle("Error Dialog");
      alert.setHeaderText("Login fejl");
      alert.setContentText("Username eller password var forkert! \n Prøv igen!");

      alert.showAndWait();
    }

  }

}
