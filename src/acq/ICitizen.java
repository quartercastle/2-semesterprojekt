/**
 * Interface class used for all implementations of Citizen
 */
package acq;

public interface ICitizen {

  /**
   * Get CPR
   *
   * @return CPR number of citizen
   */
  String getCPR();

  /**
   * Set CPR
   *
   * @param cpr
   */
  void setCPR(String cpr);

}
