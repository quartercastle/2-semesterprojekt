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
  void setSupportPracticalTasks(boolean needSupport);

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
  void setSupportPersonalCare(boolean needSupport);

  /**
   * Get informed about if the citizen need support for grosery shopping
   *
   * @return needGroserySupport
   */
  boolean needGroserySupport();

  /**
   * Set whether the citizen needs support for grosery shopping
   *
   * @param needSupport
   */
  void setSupportGrosery(boolean needSupport);

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

}
