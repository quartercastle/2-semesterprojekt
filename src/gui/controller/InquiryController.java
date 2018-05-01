package gui.controller;

import acq.ICase;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 */
public class InquiryController extends ControllerCreateCase {

  @FXML
  private TextArea referral;

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    referral.textProperty().addListener(new ChangeListener<String>() {
      @Override
      public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
        c.setReferral(newValue);
      }
    });
  }

  public void setC(ICase c) {
    this.c = c;
  }
}
