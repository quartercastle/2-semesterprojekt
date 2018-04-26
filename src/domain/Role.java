package domain;

import acq.IRole;

public class Role implements IRole {

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

  /**
   * Get name
   *
   * @return name
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   * Is Case open
   *
   * @return canOpenCase
   */
  @Override
  public Boolean canOpenCase() {
    return canOpenCase;
  }

  /**
   * Can role view Case
   *
   * @return canViewCace
   */
  @Override
  public Boolean canViewCase() {
    return canViewCase;
  }

  /**
   * Can role evaluate Case
   *
   * @return canEvaluateCase
   */
  @Override
  public Boolean canEvaluateCase() {
    return canEvaluateCase;
  }

  /**
   * Can role close Case
   *
   * @return canCloseCase
   */
  @Override
  public Boolean canCloseCase() {
    return canCloseCase;
  }

  /**
   * Set name
   *
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Set canOpenCase
   *
   * @param canOpenCase
   */
  public void setOpenCase(Boolean canOpenCase) {
    this.canOpenCase = canOpenCase;
  }

  /**
   * Set canViewCase
   *
   * @param canViewCase
   */
  public void setCanViewCase(Boolean canViewCase) {
    this.canViewCase = canViewCase;
  }

  /**
   * Set canEvaluateCase
   *
   * @param canEvaluateCase
   */
  public void setCanEvaluateCase(Boolean canEvaluateCase) {
    this.canEvaluateCase = canEvaluateCase;

  }

  /**
   * Set canCloseCase
   *
   * @param canCloseCase
   */
  public void setCanCloseCase(Boolean canCloseCase) {
    this.canCloseCase = canCloseCase;
  }

}
