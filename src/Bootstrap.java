/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javafx.application.Application;
import javafx.stage.Stage;
import data.DataFacade;
import domain.DomainFacade;
import gui.GUI;

/**
 *
 * @author Victor Gram
 */
public class Bootstrap extends Application {

  /**
   * Boot application
   * @param args
   */
  public static void main(String[] args) {
    DataFacade.getInstance();
    DomainFacade.getInstance();
    GUI.getInstance();
    launch(args);
  }

  /**
   * Start the javafx thread
   * @param stage
   */
  public void start (Stage stage) {
    GUI.getInstance().start(stage);
  }
}
