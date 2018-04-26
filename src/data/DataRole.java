/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import acq.IRole;
import com.google.gson.JsonObject;

/**
 *
 * @author niclasjohansen
 */
public class DataRole implements IRole {

  private String name;
  private boolean canOpenCase;
  private boolean canViewCase;
  private boolean canEvaluateCase;
  private boolean canCloseCase;

  public DataRole(String name, boolean canOpenCase, boolean canViewCase, boolean canEvaluateCase, boolean canCloseCase) {
    this.name = name;
    this.canOpenCase = canOpenCase;
    this.canViewCase = canViewCase;
    this.canEvaluateCase = canEvaluateCase;
    this.canCloseCase = canCloseCase;
  }

  @Override
  public String getName() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Boolean canOpenCase() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Boolean canViewCase() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Boolean canEvaluateCase() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Boolean canCloseCase() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

}
