/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starter;

import acq.IDatabase;
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

  public static void main(String[] args) {
    IDatabase idb = new DataFacade();
    IDomain id = DomainFacade.getInstance();
    IGUI ig = GUI.getInstance();
    id.injectData(idb);
    ig.injectDomain(id);
  }
}
