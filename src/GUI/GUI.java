/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Acq.IDomain;
import Acq.IGUI;

/**
 *
 * @author Victor Gram
 */
public class GUI implements IGUI {

  private static GUI gui = null;

  public GUI() {

  }

  @Override
  public void injectDomain(IDomain id) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  public static GUI getInstance() {
    if (gui == null) {
      gui = new GUI();
    }
    return gui;
  }

}
