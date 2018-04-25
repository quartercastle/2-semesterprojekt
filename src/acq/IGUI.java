/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acq;

import javafx.stage.Stage;

public interface IGUI {
  /**
   * Ibject domain
   * @param domain
   */
  public void inject (IDomain domain);

  /**
   * Start the javafx thread
   * @param args
   */
  public void initialize (String[] args);
}
