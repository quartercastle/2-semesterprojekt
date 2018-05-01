package gui.controller;

import acq.ICase;

/**
 * A controller used in controllers that is a part of create case
 */
public abstract class ControllerCreateCase extends Controller {

  /**
   * Reference Case
   */
  protected ICase c;

  /**
   * Set case
   *
   * @param c
   */
  public void setC(ICase c) {
    this.c = c;
  }
}
