/**
 * Interface class for all implementations of Case
 */
package acq;

import java.util.UUID;

public interface ICase {

  /**
   *
   * @return unique case ID
   */
  UUID getId();

  /**
   *
   * @return User resposible for the case
   */
  IUser getResponsible();

  /**
   *
   * @return Citizen
   */
  ICitizen getCitizen();

  /**
   *
   * @return Effort linked to the case
   */
  IEffort getEffort();

  /**
   *
   * @return participants
   */
  ICitizen getParticipants();

}
