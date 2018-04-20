/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Jeppe
 */
public class role {

  /**
   * Name of role
   */
  private String name;

  /**
   * can the role open case
   */
  private Boolean canOpenCase;

  /**
   * Can the role view case
   */
  private Boolean canViewCase;

  /**
   * can the role evaluate case
   */
  private Boolean canEvaluateCase;

  /**
   * can close case
   */
  private Boolean canCloseCase;

  public String getName() {
    return name;
  }

  public Boolean getCanOpenCase() {
    return canOpenCase;
  }

  public Boolean getCanViewCase() {
    return canViewCase;
  }

  public Boolean getCanEvaluateCase() {
    return canEvaluateCase;
  }

  public Boolean getCanCloseCase() {
    return canCloseCase;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCanOpenCase(Boolean canOpenCase) {
    this.canOpenCase = canOpenCase;
  }

  public void setCanViewCase(Boolean canViewCase) {
    this.canViewCase = canViewCase;
  }

  public void setCanEvaluateCase(Boolean canEvaluateCase) {
    this.canEvaluateCase = canEvaluateCase;
  }

  public void setCanCloseCase(Boolean canCloseCase) {
    this.canCloseCase = canCloseCase;
  }

}
