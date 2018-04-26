/**
 * Interface class for all implementations of Case
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
   * Get responsible
   *
   * @return User resposible for the case
   */
  IUser getResponsible();

  /**
   * get Citizen
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
   * Get list of participating citizens
   *
   * @return participants
   */
  Collection<ICitizen> getParticipants();

}
