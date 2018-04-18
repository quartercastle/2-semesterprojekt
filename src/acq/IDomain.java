/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acq;

/**
 *
 * @author Victor Gram
 */
public interface IDomain {

  /**
   * Injects datalayer into domain layer
   *
   * @param idb instance of IDatabase
   */
  void injectData(IDatabase idb);
}
