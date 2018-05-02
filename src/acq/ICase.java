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

  /**
   * Is guardianship
   *
   * @return guardianship
   */
  boolean isGuardianship();

  /**
   * Set Guardianship
   *
   * @param guardianship
   */
  void setGuardianship(boolean guardianship);

  /**
   * Is None Acting Guardian
   *
   * @return none acting guardian
   */
  boolean isNoneActingGuardian();

  /**
   * Set none acting guardian
   *
   * @param noneActingGuardian
   */
  void setNoneActingGuardian(boolean noneActingGuardian);

  /**
   * Is curatorship
   *
   * @return curatorship
   */
  boolean isCuratorship();

  /**
   * Set curatorship
   *
   * @param curatorship
   */
  void setCuratorship(boolean curatorship);

  /**
   * Is assessor
   *
   * @return assessor
   */
  boolean isAssessor();

  /**
   * Set assessor
   *
   * @param assessor
   */
  void setAssessor(boolean assessor);

  /**
   * Is Party Representative
   *
   * @return Party Representative
   */
  boolean isPartyRepresentative();

  /**
   * Set Party Representative
   *
   * @param partyRepresentative
   */
  void setPartyRepresentative(boolean partyRepresentative);

  /**
   * Is Power Of Attorney
   *
   * @return powerOfAttorney
   */
  boolean isPowerOfAttorney();

  /**
   * Set Power Of Attorney
   *
   * @param powerOfAttorney
   */
  void setPowerOfAttorney(boolean powerOfAttorney);

  /**
   * Is Right To Assessor Or Party Representative
   *
   * @return rightToAssessorOrPartyRepresentative
   */
  boolean isRightToAssessorOrPartyRepresentative();

  /**
   * Set Right To Assessor Or Party Representative
   *
   * @param rightToAssessorOrPartyRepresentative
   */
  void setRightToAssessorOrPartyRepresentative(boolean rightToAssessorOrPartyRepresentative);

  /**
   * Is Information Saved Online
   *
   * @return informationSavedOnline
   */
  boolean isInformationSavedOnline();

  /**
   * Set Information Saved Online
   *
   * @param informationSavedOnline
   */
  void setInformationSavedOnline(boolean informationSavedOnline);

  /**
   * Get further course for case
   *
   * @return
   */
  String getFurtherCourse();

  /**
   * Set furtherCource
   *
   * @param fourtherCourse
   */
  void setFurtherCourse(String fourtherCourse);

}
