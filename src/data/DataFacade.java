/*
 * Facade class for coommunicating with data layer
 */
package data;

import acq.ICase;
import acq.IDatabase;

public class DataFacade implements IDatabase {

  @Override
  public ICase getCase() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

}
