/**
 * Interface class used for all implementations of Case
 */
package acq;

import java.util.Collection;
import java.util.UUID;

public interface ICase {

  /**
   * Get id
   *
   * @return unique case ID
   */
  UUID getId();

  /**
   * Get responsible user
   *
   * @return User resposible for the case
   */
  IUser getResponsible();

  /**
   * Get citizen
   *
   * @return Citizen
   */
  ICitizen getCitizen();

  /**
   * Get effort
   *
   * @return Effort linked to the case
   */
  IEffort getEffort();

  /**
   * Get collection of participating citizens
   *
   * @return participants
   */
  Collection<ICitizen> getParticipants();

  /**
   * Get inquiry
   *
   * @return referral
   */
  String getInquiry();

  /**
   * Set inquiry
   *
   * @param referral
   */
  void setInquiry(String referral);
}
