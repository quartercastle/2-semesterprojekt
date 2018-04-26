package data.model;

import acq.IAddress;
import acq.ICompany;

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
