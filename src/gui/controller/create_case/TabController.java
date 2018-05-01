package gui.controller.create_case;

import acq.ICase;
import gui.controller.Controller;

/**
 * A controller used in controllers that is a part of create case
 */
public abstract class TabController extends Controller {

  /**
   * Reference Case
   */
  protected ICase c;

  /**
   * Set case
   *
   * @param c
   */
  public void setCase(ICase c) {
    this.c = c;
  }
}
