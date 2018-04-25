/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import data.DataFacade;
import domain.DomainFacade;
import gui.GUI;

/**
 *
 * @author Victor Gram
 */
public class Bootstrap {

  /**
   * Boot application
   * @param args
   */
  public static void main(String[] args) {
    DataFacade.getInstance();
    DomainFacade.getInstance();
    GUI.getInstance().initialize(args);;
  }
}
