package gui.controller.create_case;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

/**
 * FXML Controller class
 *
 */
public class RightsController extends TabController {

  /**
   * Checkbox representing Case bolean informedAboutRights
   */
  @FXML
  private CheckBox rightsCheckBox;
  /**
   * Checkbox representing Case bolean informedAboutDuties
   */
  @FXML
  private CheckBox dutiesCheckBox;

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {

    /**
     * Sets Case informedAboutRights boolean to true, if checkbox is checked
     */
    rightsCheckBox.selectedProperty().addListener(new ChangeListener<Boolean>() {
      @Override
      public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        getCase().setInformedAboutRights(newValue);

      }

    });

    /**
     * Sets Case informedAboutDuties boolean to true, if checkbox is checked
     */
    dutiesCheckBox.selectedProperty().addListener(new ChangeListener<Boolean>() {
      @Override
      public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        getCase().setInformedAboutDuties(newValue);

      }

    });
  }

}
