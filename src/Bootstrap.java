/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import acq.IData;
import acq.IDomain;
import acq.IGUI;
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
   *
   * @param args
   */
  public static void main(String[] args) {
    IData data = DataFacade.getInstance();
    data.save();
    IDomain domain = DomainFacade.getInstance();
    IGUI gui = GUI.getInstance();
    domain.inject(data);
    gui.inject(domain);
    gui.initialize(args);

  }
}
