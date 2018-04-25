package gui.controller;

import gui.GUI;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController extends Controller {

  /**
   * Reference to the label instance
   */
  @FXML
  private TextField usernameField;
  @FXML
  private TextField passwordField;

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
    }

    GUI.getInstance().getControllers().get("Overview").getStage().show();
    getStage().close();

  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {

  }

}
