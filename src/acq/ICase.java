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
   * Get informed about if they need support for practical tasks
   *
   * @return needPracticalTasksSupport
   */
  boolean needPracticalTasksSupport();

  /**
   * Set whether the citizen need support to practical tasks
   *
   * @param needSupport
   */
  void setPracticalTasksSupport(boolean needSupport);

  /**
   * Get informed about if the citizen need support for personal care
   *
   * @return needPersonalCareSupport
   */
  boolean needPersonalCareSupport();

  /**
   * Set whether the citizen needs support to personal care
   *
   * @param needSupport
   */
  void setPersonalCareSupport(boolean needSupport);

  /**
   * Get informed about if the citizen need support for grosery shopping
   *
   * @return needGroserySupport
   */
  boolean needGrocerySupport();

  /**
   * Set whether the citizen needs support for grosery shopping
   *
   * @param needSupport
   */
  void setGrocerySupport(boolean needSupport);

  /**
   * Get informed if the citizen needs support for a temporary stay
   *
   * @return needTemporaryStay
   */
  boolean needTemporaryStay();

  /**
   * Set whether the citizen needs support for a temporary stay
   *
   * @param needTemporaryStay
   */
  void setTemporaryStay(boolean needTemporaryStay);

  /**
   * Get informed if the citizen needs support for a longer stay
   *
   * @return needLongerStay
   */
  boolean needLongerStay();

  /**
   * Set whether the citizen needs support for a longer stay
   *
   * @param needLongerStay
   */
  void setLongerStay(boolean needLongerStay);

  /**
   * Get informed if the citizen needs support for learning
   *
   * @return needLearningSupport
   */
  boolean needLearningSupport();

  /**
   * Set whether the citizen needs support for learning
   *
   * @param needLearningSupport
   */
  void setLearningSupport(boolean needLearningSupport);

  /**
   * Get informed if the citizen needs support for rehabilitation
   *
   * @return needLearningSupport
   */
  boolean needRehabilitationSupport();

  /**
   * Set whether the citizen needs support for rehabilitation
   *
   * @param needRehabilitationSupport
   */
  void setRehabilitationSupport(boolean needRehabilitationSupport);

  /**
   * Get informed if the citizen needs support for driving
   *
   * @return needDrivingSupport
   */
  boolean needDrivingSupport();

  /**
   * Set whether the citizen needs support for rehabilitation
   *
   * @param needDrivingSupport
   */
  void setDrivingSupport(boolean needDrivingSupport);

  /**
   * Get informed if the citizen need an offer for a temporary house
   *
   * @return needTemporaryHouseOffer
   */
  boolean needTemporaryHouseOffer();

  /**
   * Set whether the citizen need an offer for a temporary house
   *
   * @param needTemporaryHouseOffer
   */
  void setTemporaryHouseOffer(boolean needTemporaryHouseOffer);

  /**
   * Get informed if the citizen need an offer for personal care
   *
   * @return needTemporaryHouseOffer
   */
  boolean needPersonalCareOffer();

  /**
   * Set whether the citizen need an offer for personal care
   *
   * @param needPersonalCareOffer
   */
  void setPersonalCareOffer(boolean needPersonalCareOffer);

  /**
   * Get informed if the citizen need an offer for support to grocery shopping
   *
   * @return needSupportGroceryOffer
   */
  boolean needSupportGroceryOffer();

  /**
   * Set whether the citizen need an offer for support to grocery shopping
   *
   * @param needSupportGroceryOffer
   */
  void setSupportGroceryOffer(boolean needSupportGroceryOffer);

  /**
   * Get informed if the citizen need an offer for a longer house stay
   *
   * @return needSupportGroceryOffer
   */
  boolean needLongerStayOffer();

  /**
   * Set whether the citizen need an offer for a longer house stay
   *
   * @param needLongerStayOffer
   */
  void setLongerStayOffer(boolean needLongerStayOffer);

  /**
   * Get informed if the citizen need an offer for learning
   *
   * @return needLearningOffer
   */
  boolean needLearningOffer();

  /**
   * Set whether the citizen need an offer for learning
   *
   * @param needLearningOffer
   */
  void setLearningOffer(boolean needLearningOffer);

  /**
   * Get informed if the citizen need an offer for Rehabilitation
   *
   * @return needLearningOffer
   */
  boolean needRehabilitationOffer();

  /**
   * Set whether the citizen need an offer for Rehabilitation
   *
   * @param needRehabilitationOffer
   */
  void setRehabilitationOffer(boolean needRehabilitationOffer);
  
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
   * @return getFurtherCourse
   */
  String getFurtherCourse();

  /**
   * Set furtherCource
   *
   * @param fourtherCourse
   */
  void setFurtherCourse(String fourtherCourse);

}
