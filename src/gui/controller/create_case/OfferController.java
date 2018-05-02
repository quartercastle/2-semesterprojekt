/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.controller.create_case;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author niclasjohansen
 */
public class OfferController extends TabController {

  @FXML
  private ToggleGroup YesOrNo;
  @FXML
  private CheckBox supportPracticalTasks;
  @FXML
  private CheckBox supportPersonalCare;
  @FXML
  private CheckBox supportGrosery;
  @FXML
  private CheckBox temporaryStay;
  @FXML
  private CheckBox longerStay;
  @FXML
  private CheckBox supportLearning;
  @FXML
  private CheckBox supportRehabilitation;
  @FXML
  private CheckBox supportDriving;
  @FXML
  private CheckBox temporaryHouseOffer;
  @FXML
  private CheckBox supportOfferPersonalCare;
  @FXML
  private CheckBox supportOfferGrocery;
  @FXML
  private CheckBox longerStayOffer;
  @FXML
  private CheckBox supportOfferLearning;
  @FXML
  private CheckBox supportOfferRehabilitation;

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
        getCase().setSupportPracticalTasks(newValue);
      }
    });

    /**
     * Sets citizens supportPersonalCare boolean to true, if checkbox is checked
     */
    supportPersonalCare.selectedProperty().addListener(new ChangeListener<Boolean>() {
      @Override
      public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        getCase().setSupportPersonalCare(newValue);
      }
    });

    /**
     * Sets citizens supportGrosery boolean to true, if checkbox is checked
     */
    supportGrosery.selectedProperty().addListener(new ChangeListener<Boolean>() {
      @Override
      public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        getCase().setSupportGrosery(newValue);
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
  }

}
