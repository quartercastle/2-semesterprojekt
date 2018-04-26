/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import acq.IAddress;
import acq.ICompany;

/**
 *
 * @author niclasjohansen
 */
public class DataCompany implements ICompany {

  private String name;
  private String address;

  public DataCompany(String name, String address) {
    this.name = name;
    this.address = address;
  }

  @Override
  public String getName() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public IAddress getAddress() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

}
