package gui.controller.create_case;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 *
 */
public class OfferController extends TabController {

  /**
   * Togglegroup representing if the offer content should be shown
   */
  @FXML
  private ToggleGroup YesOrNo;

  /**
   * Checkbox representing Case boolean for supportPracticalTasks
   */
  @FXML
  private CheckBox supportPracticalTasks;

  /**
   * Checkbox representing Case boolean for supportPersonalCare
   */
  @FXML
  private CheckBox supportPersonalCare;

  /**
   * Checkbox representing Case boolean for supportGrosery
   */
  @FXML
  private CheckBox supportGrosery;

  /**
   * Checkbox representing Case boolean for temporaryStay
   */
  @FXML
  private CheckBox temporaryStay;

  /**
   * Checkbox representing Case boolean for longerStay
   */
  @FXML
  private CheckBox longerStay;

  /**
   * Checkbox representing Case boolean for supportLearning
   */
  @FXML
  private CheckBox supportLearning;

  /**
   * Checkbox representing Case boolean for supportRehabilitation
   */
  @FXML
  private CheckBox supportRehabilitation;

  /**
   * Checkbox representing Case boolean for supportDriving
   */
  @FXML
  private CheckBox supportDriving;

  /**
   * Checkbox representing Case boolean for temporaryHouseOffer
   */
  @FXML
  private CheckBox temporaryHouseOffer;

  /**
   * Checkbox representing Case boolean for supportOfferPersonalCare
   */
  @FXML
  private CheckBox supportOfferPersonalCare;

  /**
   * Checkbox representing Case boolean for supportOfferGrocery
   */
  @FXML
  private CheckBox supportOfferGrocery;

  /**
   * Checkbox representing Case boolean for longerStayOffer
   */
  @FXML
  private CheckBox longerStayOffer;

  /**
   * Checkbox representing Case boolean for supportOfferLearning
   */
  @FXML
  private CheckBox supportOfferLearning;

  /**
   * Checkbox representing Case boolean for supportOfferRehabilitation
   */
  @FXML
  private CheckBox supportOfferRehabilitation;

  /**
   * VBox that contains all the offer content
   */
  @FXML
  private VBox contentBox;

  /**
   * toggled boolean value to toggle content
   */
  private boolean toggled = false;

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {

    /**
     * Sets citizens supportPracticalTasks boolean to true, if checkbox is
     * checked
     */
    supportPracticalTasks.selectedProperty().addListener(new ChangeListener<Boolean>() {
      @Override
      public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        getCase().setPracticalTasksSupport(newValue);
      }
    });

    /**
     * Sets citizens supportPersonalCare boolean to true, if checkbox is checked
     */
    supportPersonalCare.selectedProperty().addListener(new ChangeListener<Boolean>() {
      @Override
      public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        getCase().setPersonalCareSupport(newValue);
      }
    });

    /**
     * Sets citizens supportGrosery boolean to true, if checkbox is checked
     */
    supportGrosery.selectedProperty().addListener(new ChangeListener<Boolean>() {
      @Override
      public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        getCase().setGrocerySupport(newValue);
      }
    });

    /**
     * Sets citizens temporaryStay boolean to true, if checkbox is checked
     */
    temporaryStay.selectedProperty().addListener(new ChangeListener<Boolean>() {
      @Override
      public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        getCase().setTemporaryStay(newValue);
      }
    });

    /**
     * Sets citizens longerStay boolean to true, if checkbox is checked
     */
    longerStay.selectedProperty().addListener(new ChangeListener<Boolean>() {
      @Override
      public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        getCase().setLongerStay(newValue);
      }
    });

    /**
     * Sets citizens supportLearning boolean to true, if checkbox is checked
     */
    supportLearning.selectedProperty().addListener(new ChangeListener<Boolean>() {
      @Override
      public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        getCase().setLearningSupport(newValue);
      }
    });

    /**
     * Sets citizens supportRehabilitation boolean to true, if checkbox is
     * checked
     */
    supportRehabilitation.selectedProperty().addListener(new ChangeListener<Boolean>() {
      @Override
      public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        getCase().setRehabilitationSupport(newValue);
      }
    });

    /**
     * Sets citizens supportRehabilitation boolean to true, if checkbox is
     * checked
     */
    supportDriving.selectedProperty().addListener(new ChangeListener<Boolean>() {
      @Override
      public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        getCase().setDrivingSupport(newValue);
      }
    });

    /**
     * Sets citizens supportRehabilitation boolean to true, if checkbox is
     * checked
     */
    temporaryHouseOffer.selectedProperty().addListener(new ChangeListener<Boolean>() {
      @Override
      public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        getCase().setTemporaryHouseOffer(newValue);
      }
    });

    /**
     * Sets citizens supportRehabilitation boolean to true, if checkbox is
     * checked
     */
    supportOfferPersonalCare.selectedProperty().addListener(new ChangeListener<Boolean>() {
      @Override
      public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        getCase().setPersonalCareOffer(newValue);
      }
    });

    /**
     * Sets citizens supportRehabilitation boolean to true, if checkbox is
     * checked
     */
    supportOfferGrocery.selectedProperty().addListener(new ChangeListener<Boolean>() {
      @Override
      public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        getCase().setSupportGroceryOffer(newValue);
      }
    });

    /**
     * Sets citizens supportRehabilitation boolean to true, if checkbox is
     * checked
     */
    longerStayOffer.selectedProperty().addListener(new ChangeListener<Boolean>() {
      @Override
      public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        getCase().setLongerStayOffer(newValue);
      }
    });

    /**
     * Sets citizens supportRehabilitation boolean to true, if checkbox is
     * checked
     */
    supportOfferLearning.selectedProperty().addListener(new ChangeListener<Boolean>() {
      @Override
      public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        getCase().setLearningOffer(newValue);
      }
    });

    /**
     * Sets citizens supportRehabilitation boolean to true, if checkbox is
     * checked
     */
    supportOfferRehabilitation.selectedProperty().addListener(new ChangeListener<Boolean>() {
      @Override
      public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        getCase().setRehabilitationOffer(newValue);
      }
    });

    /**
     * Sets if the content should be shown. If true content is shown.
     */
    YesOrNo.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
      @Override
      public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
        toggleContent(!toggled);
        toggled = !toggled;
      }

    });

  }

  /**
   * Method that toggles the visibily of the content
   *
   * @param toggle
   */
  public void toggleContent(boolean toggle) {
    contentBox.setVisible(toggle);
  }
}
