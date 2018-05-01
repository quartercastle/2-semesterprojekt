package gui.controller.create_case;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

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

}
