/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import acq.IGUI;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import java.lang.Exception;

/**
 *
 * @author Victor Gram
 */
public class GUI implements IGUI {

  /**
   * Instance of the class itself, used for singleton setup. Is set to null
   * initially, instantiated if needed though getInstance()
   */
  private static GUI gui;

  /**
   * Stage instance
   */
  private Stage stage;

  /**
   * Singleton setup for GUI, returns instance of the class if none has been
   * made. If one has been made, returns that created instance
   *
   * @return GUI
   */
  public static GUI getInstance() {
    if (gui == null) {
      gui = new GUI();
    }

    return gui;
  }

  /**
   * star
   *
   * @param stage
   */
  public void star(Stage stage) {
    this.stage = stage;
    this.loadController();
  }

  /**
   * Load view and controller
   */
  private void loadController() {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("view/Login.fxml"));
    try {
      Parent view = (Parent) loader.load();

      // Get controller instance
      // Controller controller = loader.getController();
      this.createScene(this.stage, view);
    } catch (Exception err) {
      System.out.print(err);
    }
  }

  /**
   * Create scen
   *
   * @param stage
   * @param view
   */
  private void createScene(Stage stage, Parent view) {
    Scene scene = new Scene(view);
    stage.setScene(scene);
    stage.show();
  }

}
