/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acq;

public interface IDomain {

  /**
   * Inject data
   *
   * @param data
   */
  public void inject(IData data);

  /**
   * Verify login
   *
   * @param username
   * @param password
   * @return true if ok
   */
  public boolean verify(String username, String password);
}
