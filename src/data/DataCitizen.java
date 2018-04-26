/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import acq.IAddress;
import acq.ICitizen;
import domain.Address;

/**
 *
 * @author niclasjohansen
 */
public class DataCitizen implements ICitizen {

  private String firstName;
  private String middleName;
  private String lastName;
  private String CPR;
  private IAddress address;
  private String phone;
  private String email;

  public DataCitizen(String firstName, String middleName, String lastName, String CPR, IAddress address, String phone, String email) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.CPR = CPR;
    this.address = address;
    this.phone = phone;
    this.email = email;
  }

  @Override
  public String getFirstName() {
    return this.firstName;
  }

  @Override
  public String getMiddleName() {
    return this.middleName;
  }

  @Override
  public String getLastName() {
    return this.lastName;
  }

  @Override
  public String getCPR() {
    return this.CPR;
  }

  @Override
  public IAddress getAddress() {
    return this.address;
  }

  @Override
  public String getPhone() {
    return this.phone;
  }

  @Override
  public String getEmail() {
    return this.email;
  }

}
