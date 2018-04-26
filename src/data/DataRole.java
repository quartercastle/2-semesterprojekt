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
  private boolean canCreateCase;

  public DataRole(String name, boolean canOpenCase, boolean canViewCase, boolean canEvaluateCase, boolean canCloseCase, boolean canCreateCase) {
    this.name = name;
    this.canOpenCase = canOpenCase;
    this.canViewCase = canViewCase;
    this.canEvaluateCase = canEvaluateCase;
    this.canCloseCase = canCloseCase;
    this.canCreateCase = canCreateCase;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public boolean canOpenCase() {
    return this.canOpenCase;
  }

  @Override
  public boolean canViewCase() {
    return this.canViewCase;
  }

  @Override
  public boolean canEvaluateCase() {
    return this.canEvaluateCase;
  }

  @Override
  public boolean canCloseCase() {
    return this.canCloseCase;
  }

  @Override
  public void setCanOpenCase(boolean permission) {
    this.canOpenCase = permission;
  }

  @Override
  public void setCanViewCase(boolean permission) {
    this.canViewCase = permission;
  }

  @Override
  public void setCanEvaluateCase(boolean permission) {
    this.canEvaluateCase = permission;
  }

  @Override
  public void setCanCloseCase(boolean permission) {
    this.canCloseCase = permission;
  }

  @Override
  public boolean canCreateCase() {
    return this.canCreateCase;
  }

  @Override
  public void setCanCreateCase(boolean permission) {
    this.canCreateCase = permission;
  }

}
