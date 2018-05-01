package gui.controller;

import gui.GUI;
import gui.controller.create_case.TabController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Pane;

public class CreateCaseController extends TabController {

  /**
   * Tabpane holding the different stages in case-creation
   */
  @FXML
  private TabPane tabPane;

  /**
   * Previous button
   */
  @FXML
  private Button previousBut;

  /**
   * Next button
   */
  @FXML
  private Button nextBut;

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    tabPane.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
      @Override
      public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
        nextBut.setText("Næste");

        if (newValue.intValue() == 0) {
          previousBut.setVisible(false);
          return;
        } else if (newValue.intValue() == tabPane.getTabs().size() - 1) {
          nextBut.setText("Gem");
        }

        previousBut.setVisible(true);
      }
    });
  }

  /**
   * Method for open window
   */
  public void open() {
    super.open();
    if (c == null) {
      c = GUI.getInstance().getDomain().createCase();
      setupControllers();
    }
  }

  /**
   * Setup the controllers
   */
  private void setupControllers() {
    //A array of all the names of the fxml files
    String[] tabNames = {"Inquiry", "Rights", "BasicInformation", "Circumstances", "FurtherCourse"};
    //A list of all the tabs
    ObservableList<Tab> tabs = tabPane.getTabs();

    for (int i = 0; i < tabs.size(); i++) {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/create_case/" + tabNames[i] + ".fxml"));

      try {
        Pane statPane = loader.load();
        tabs.get(i).setContent(statPane);
      } catch (IOException ex) {
        ex.printStackTrace();
      }

      ((TabController) loader.getController()).setCase(c);
    }
  }

  /**
   * Go to previous tab in the process
   *
   * @param event
   */
  @FXML
  private void previousButAction(ActionEvent event) {
    tabPane.getSelectionModel().selectPrevious();
  }

  /**
   * Go to next tab in the process, if at last tab save the case
   *
   * @param event
   */
  @FXML
  private void nextButAction(ActionEvent event) {
    if (tabPane.getSelectionModel().getSelectedIndex() == tabPane.getTabs().size() - 1) {
      //SAVE CASE
      return;
    }
    tabPane.getSelectionModel().selectNext();
  }
}
