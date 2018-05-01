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

  /**
   * Set citizen
   *
   * @param citizen
   */
  void setCitizen(ICitizen citizen);

  /**
   * Get informed about rights status
   *
   * @return informedAboutRights
   */
  boolean isInformedAboutRights();

  /**
   * Set whether citizen is informed about rights
   *
   * @param informed
   */
  void setInformedAboutRights(boolean informed);

  /**
   * Get informed about duties status
   *
   * @return informedAboutDuties
   */
  boolean isInformedAboutDuties();

  /**
   * Set whether citizen is informed about duties
   *
   * @param informed
   */
  void setInformedAboutDuties(boolean informed);

  /**
   * Get eventual circumstance
   *
   * @return
   */
  String getCircumstance();

  /**
   * Set circumstance
   *
   * @param circumstance
   */
  void setCircumstance(String circumstance);
}
