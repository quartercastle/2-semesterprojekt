/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acq;

public interface IGUI {

  /**
   * Injects Domain layer into GUI layer
   *
   * @param id instance of IDomain
   *
   */
  void injectDomain(IDomain id);
}
