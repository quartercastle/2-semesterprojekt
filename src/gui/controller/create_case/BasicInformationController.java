package gui.controller.create_case;

import acq.IAddress;
import acq.ICitizen;
import gui.GUI;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class BasicInformationController extends TabController {

  /**
   * First name
   */
  @FXML
  private TextField firstName;

  /**
   * Middle name
   */
  @FXML
  private TextField middleName;

  /**
   * Last nane
   */
  @FXML
  private TextField lastName;

  /**
   * CPR number
   */
  @FXML
  private TextField cpr;

  /**
   * Address field
   */
  @FXML
  private TextField address;

  /**
   * Zip code
   */
  @FXML
  private TextField zip;

  /**
   * City
   */
  @FXML
  private TextField city;

  /**
   * Email
   */
  @FXML
  private TextField email;

  /**
   * Phone
   */
  @FXML
  private TextField phone;

  /**
   * Guardianship
   */
  @FXML
  private CheckBox guardianship;

  /**
   * None Acting Guardian
   */
  @FXML
  private CheckBox noneActingGuardian;

  /**
   * Curatorship
   */
  @FXML
  private CheckBox curatorship;

  /**
   * Assessor
   */
  @FXML
  private CheckBox assessor;

  /**
   * Party Representative
   */
  @FXML
  private CheckBox partyRepresentative;

  /**
   * Power of Attorney
   */
  @FXML
  private CheckBox powerOfAttorney;

  /**
   * Right to Assessor or Party Representative
   */
  @FXML
  private CheckBox rightToAssessorOrPartyRepresentative;

  /**
   * Information Saved Online
   */
  @FXML
  private CheckBox informationSavedOnline;

  /**
   * Initializes the controller class and setup change listeners.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    guardianship.selectedProperty().addListener((e, oldState, state) -> {
      getCase().setGuardianship(state);
    });

    noneActingGuardian.selectedProperty().addListener((e, oldState, state) -> {
      getCase().setNoneActingGuardian(state);
    });

    curatorship.selectedProperty().addListener((e, oldState, state) -> {
      getCase().setCuratorship(state);
    });

    assessor.selectedProperty().addListener((e, oldState, state) -> {
      getCase().setAssessor(state);
    });

    partyRepresentative.selectedProperty().addListener((e, oldState, state) -> {
      getCase().setPartyRepresentative(state);
    });

    powerOfAttorney.selectedProperty().addListener((e, oldState, state) -> {
      getCase().setPowerOfAttorney(state);
    });

    rightToAssessorOrPartyRepresentative.selectedProperty().addListener((e, oldState, state) -> {
      getCase().setRightToAssessorOrPartyRepresentative(state);
    });

    informationSavedOnline.selectedProperty().addListener((e, oldState, state) -> {
      getCase().setInformationSavedOnline(state);
    });
  }

  /**
   * Helper method to retreive the Citizen
   *
   * @return citizen
   */
  private ICitizen getCitizen() {
    if (getCase().getCitizen() == null) {
      getCase().setCitizen(GUI.getInstance().getDomain().createCitizen());
    }

    return getCase().getCitizen();
  }

  /**
   * Helper method to retreive the Address
   *
   * @return address
   */
  private IAddress getAddress() {
    if (getCitizen().getAddress() == null) {
      getCitizen().setAddress(GUI.getInstance().getDomain().createAddress());
    }

    return getCase().getCitizen().getAddress();
  }

  /**
   * Write first name to Citizen on change
   *
   * @param event
   */
  @FXML
  private void firstNameChanged(KeyEvent event) {
    getCitizen().setFirstName(firstName.getText());
  }

  /**
   * Write middle name to Citizen on change
   *
   * @param event
   */
  @FXML
  private void middleNameChanged(KeyEvent event) {
    getCitizen().setMiddleName(middleName.getText());
  }

  /**
   * Write last name name to Citizen on change
   *
   * @param event
   */
  @FXML
  private void lastNameChanged(KeyEvent event) {
    getCitizen().setLastName(lastName.getText());
  }

  /**
   * Write cpr to Citizen on change
   *
   * @param event
   */
  @FXML
  private void cprChanged(KeyEvent event) {
    getCitizen().setCPR(cpr.getText());
  }

  /**
   * Write email to Citizen on change
   *
   * @param event
   */
  @FXML
  private void emailChanged(KeyEvent event) {
    getCitizen().setEmail(email.getText());
  }

  /**
   * Write phone to Citizen on change
   *
   * @param event
   */
  @FXML
  private void phoneChanged(KeyEvent event) {
    getCitizen().setPhone(phone.getText());
  }

  /**
   * Write address line to Address on change
   *
   * @param event
   */
  @FXML
  private void addressChanged(KeyEvent event) {
    getAddress().setPrimaryLine(address.getText());
  }

  /**
   * Write zip to Address on change
   *
   * @param event
   */
  @FXML
  private void zipChanged(KeyEvent event) {
    getAddress().setZip(zip.getText());
  }

  /**
   * Write city to Address on change
   *
   * @param event
   */
  @FXML
  private void cityChanged(KeyEvent event) {
    getAddress().setCity(city.getText());
  }

}
