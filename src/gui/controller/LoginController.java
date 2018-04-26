package gui.controller;

import gui.GUI;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController extends Controller {

  /**
   * Reference to the label instance
   */
  /**
   * Username textfield
   */
  @FXML
  private TextField usernameField;

  /**
   * Password field
   */
  @FXML
  private PasswordField passwordField;

  /**
   * Used when login button is clicked
   *
   * @param event
   */
  @FXML
  private void loginAction(ActionEvent event) {
    if (!GUI.getInstance().getDomain().verify(
            usernameField.getText(),
            passwordField.getText())) {
      //Something went wrong
      Alert alert = new Alert(AlertType.ERROR);
      alert.setTitle("Error Dialog");
      alert.setHeaderText("Login fejl");
      alert.setContentText("Username eller password var forkert! \n Prøv igen!");

      alert.showAndWait();
      return;
    }

    GUI.getInstance().showStage("Overview");
    getStage().close();

  }
}
