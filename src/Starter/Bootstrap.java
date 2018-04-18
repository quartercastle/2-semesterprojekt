/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Starter;

import Acq.IDatabase;
import Acq.IDomain;
import Acq.IGUI;
import Data.DataFacade;
import Domain.DomainFacade;
import GUI.GUI;

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
