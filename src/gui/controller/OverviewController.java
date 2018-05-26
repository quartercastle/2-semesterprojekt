package gui.controller;

import acq.ICase;
import acq.IDomain;
import domain.DomainFacade;
import domain.system.SystemFacade;
import gui.GUI;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 */
public class OverviewController extends Controller {

  /**
   * List of cases loaded from datalayer
   */
  private ArrayList<ICase> cases;

  /**
   * Listview holding cases saved in the system
   */
  @FXML
  private ListView<ICase> caseListView;

  /**
   * Initializer for controller, fills listview with cases
   *
   * @param url
   * @param rb
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    updateCaseList();

  }

  /**
   * Opens up CreateCase stage
   *
   * @param event
   */
  @FXML
  private void openCaseAction(ActionEvent event) {

    GUI.getInstance().getController("CreateCase").open();
  }

  /**
   * Updates overviewscreens list of cases
   */
  public void updateCaseList() {
    cases = new ArrayList<>(DomainFacade.getInstance().getCases());
    ObservableList<ICase> observableCaseList = FXCollections.observableArrayList(cases);
    caseListView.setItems(observableCaseList);

  }

}
