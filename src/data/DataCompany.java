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
  private IAddress address;

  public DataCompany(String name, IAddress address) {
    this.name = name;
    this.address = address;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public IAddress getAddress() {
    return this.address;
  }

}
