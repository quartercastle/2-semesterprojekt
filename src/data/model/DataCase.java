package data.model;

import acq.ICase;
import acq.ICitizen;
import acq.IEffort;
import acq.IUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

/**
 *
 * DataCase class
 */
public class DataCase implements ICase {

  /**
   * Id of the case
   */
  private UUID id;

  /**
   * The responsible user for the case
   */
  private IUser responsible;

  /**
   * The citizin which the case is about
   */
  private ICitizen citizen;

  /**
   * Effort TODO not described correctly?
   */
  private IEffort effort;

  /**
   * Collection of case participants TODO Not currently implemented
   */
  private Collection<ICitizen> participants;
  /**
   * Case inquiry
   */
  private String inquiry;

  /**
   * Has the citizen been informed of his/her rights, from Case-opening
   */
  private boolean informedAboutRights;

  /**
   * Has the citizen been informed of his/her duties, from Case-opening
   */
  private boolean informedAboutDuties;

  /**
   * Does the citizen need support for practical tasks, from Case-opening
   */
  private boolean practicalTasksSupport;

  /**
   * Does the citizen need support for personal care, from Case-opening
   */
  private boolean personalCareSupport;

  /**
   * Does the citizen need support for grosery shopping, from Case-opening
   */
  private boolean groserySupport;

  /**
   * Does the citizen need support for temporary stay, from Case-opening
   */
  private boolean temporaryStay;

  /**
   * Does the citizen need support for longer stay, from Case-opening
   */
  private boolean longerStay;

  /**
   * Does the citizen need support for learning support, from Case-opening
   */
  private boolean learningSupport;

  /**
   * Does the citizen need support for rehabilitation, from Case-opening
   */
  private boolean rehabilitationSupport;

  /**
   * Does the citizen need support for dring, from Case-opening
   */
  private boolean drivingSupport;

  /**
   * Does the citizen need an offer for a temporary house, from Case-opening
   */
  private boolean temporaryHouseOffer;

  /**
   * Does the citizen need an offer for personal care, from Case-opening
   */
  private boolean personalCareOffer;

  /**
   * Does the citizen need an offer for grocery shopping, from Case-opening
   */
  private boolean supportGroceryOffer;

  /**
   * Does the citizen need an offer for a longer stay, from Case-opening
   */
  private boolean longerStayOffer;

  /**
   * Does the citizen need an offer for learning school help, from Case-opening
   */
  private boolean learningOffer;

  /**
   * Does the citizen need an offer for rehabilitation, from Case-opening
   */
  private boolean rehabilitationOffer;

  /**
   * Create a new DataCase
   *
   * @param id
   * @param responsible
   * @param citizen
   * @param effort
   */
  public DataCase(UUID id, IUser responsible, ICitizen citizen, IEffort effort) {
    this.id = id;
    this.responsible = responsible;
    this.citizen = citizen;
    this.effort = effort;
    this.participants = new ArrayList();
  }

  /**
   * Get id
   *
   * @return id
   */
  @Override
  public UUID getId() {
    return this.id;
  }

  /**
   * Get responsible
   *
   * @return responsible
   */
  @Override
  public IUser getResponsible() {
    return this.responsible;
  }

  /**
   * Get Citizen
   *
   * @return Citizen
   */
  @Override
  public ICitizen getCitizen() {
    return this.citizen;
  }

  /**
   * Get effort
   *
   * @return effort
   */
  @Override
  public IEffort getEffort() {
    return this.effort;
  }

  /**
   * Get participants
   *
   * @return participants
   */
  @Override
  public Collection<ICitizen> getParticipants() {
    return this.participants;
  }

  /**
   * Get inquiry
   *
   * @return inquiry
   */
  @Override
  public String getInquiry() {
    return inquiry;
  }

  /**
   * Set inquiry
   *
   * @param inquiry
   */
  @Override
  public void setInquiry(String inquiry) {
    this.inquiry = inquiry;
  }

  /**
   * Get informed about rights status
   *
   * @return informedAboutRights
   */
  @Override
  public boolean isInformedAboutRights() {
    return this.informedAboutRights;
  }

  /**
   * Set whether citizen is informed about rights
   *
   * @param informed
   */
  @Override
  public void setInformedAboutRights(boolean informed) {
    this.informedAboutRights = informed;
  }

  /**
   * Get informed about duties status
   *
   * @return informedAboutRights
   */
  @Override
  public boolean isInformedAboutDuties() {
    return this.informedAboutDuties;
  }

  /**
   * Set whether citizen is informed about rights
   *
   * @param informed
   */
  @Override
  public void setInformedAboutDuties(boolean informed) {
    this.informedAboutDuties = informed;
  }

  /**
   * Get informed about if they need support for practical tasks
   *
   * @return needPracticalTasksSupport
   */
  @Override
  public boolean needPracticalTasksSupport() {
    return this.practicalTasksSupport;
  }

  /**
   * Set whether the citizen need support to practical tasks
   *
   * @param needSupport
   */
  @Override
  public void setPracticalTasksSupport(boolean needSupport) {
    this.practicalTasksSupport = needSupport;
  }

  /**
   * Get informed about if the citizen need support for personal care
   *
   * @return needPersonalCareSupport
   */
  @Override
  public boolean needPersonalCareSupport() {
    return this.personalCareSupport;
  }

  /**
   * Set whether the citizen needs support to personal care
   *
   * @param needSupport
   */
  @Override
  public void setPersonalCareSupport(boolean needSupport) {
    this.personalCareSupport = needSupport;
  }

  /**
   * Get informed about if the citizen need support for grosery shopping
   *
   * @return needGroserySupport
   */
  @Override
  public boolean needGrocerySupport() {
    return this.groserySupport;
  }

  /**
   * Set whether the citizen needs support for grosery shopping
   *
   * @param needSupport
   */
  @Override
  public void setGrocerySupport(boolean needSupport) {
    this.groserySupport = needSupport;
  }

  /**
   * Get informed if the citizen needs support for a temporary stay
   *
   * @return needTemporaryStay
   */
  @Override
  public boolean needTemporaryStay() {
    return this.temporaryStay;
  }

  /**
   * Set whether the citizen needs support for a temporary stay
   *
   * @param needTemporaryStay
   */
  @Override
  public void setTemporaryStay(boolean needTemporaryStay) {
    this.temporaryStay = needTemporaryStay;
  }

  /**
   * Get informed if the citizen needs support for a longer stay
   *
   * @return needLongerStay
   */
  @Override
  public boolean needLongerStay() {
    return this.longerStay;
  }

  /**
   * Set whether the citizen needs support for a longer stay
   *
   * @param needLongerStay
   */
  @Override
  public void setLongerStay(boolean needLongerStay) {
    this.longerStay = needLongerStay;
  }

  /**
   * Get informed if the citizen needs support for learning
   *
   * @return needLearningSupport
   */
  @Override
  public boolean needLearningSupport() {
    return this.learningSupport;
  }

  /**
   * Set whether the citizen needs support for learning
   *
   * @param needLearningSupport
   */
  @Override
  public void setLearningSupport(boolean needLearningSupport) {
    this.learningSupport = needLearningSupport;
  }

  /**
   * Get informed if the citizen needs support for rehabilitation
   *
   * @return needLearningSupport
   */
  @Override
  public boolean needRehabilitationSupport() {
    return this.rehabilitationSupport;
  }

  /**
   * Set whether the citizen needs support for rehabilitation
   *
   * @param needRehabilitationSupport
   */
  @Override
  public void setRehabilitationSupport(boolean needRehabilitationSupport) {
    this.rehabilitationSupport = needRehabilitationSupport;
  }

  /**
   * Get informed if the citizen needs support for driving
   *
   * @return needDrivingSupport
   */
  @Override
  public boolean needDrivingSupport() {
    return this.drivingSupport;
  }

  /**
   * Set whether the citizen needs support for rehabilitation
   *
   * @param needDrivingSupport
   */
  @Override
  public void setDrivingSupport(boolean needDrivingSupport) {
    this.drivingSupport = needDrivingSupport;
  }

  /**
   * Get informed if the citizen need an offer for a temporary house
   *
   * @return needTemporaryHouseOffer
   */
  @Override
  public boolean needTemporaryHouseOffer() {
    return this.temporaryHouseOffer;
  }

  /**
   * Set whether the citizen need an offer for a temporary house
   *
   * @param needTemporaryHouseOffer
   */
  @Override
  public void setTemporaryHouseOffer(boolean needTemporaryHouseOffer) {
    this.temporaryHouseOffer = needTemporaryHouseOffer;
  }

  /**
   * Get informed if the citizen need an offer for personal care
   *
   * @return needTemporaryHouseOffer
   */
  @Override
  public boolean needPersonalCareOffer() {
    return this.personalCareOffer;
  }

  /**
   * Set whether the citizen need an offer for personal care
   *
   * @param needPersonalCareOffer
   */
  @Override
  public void setPersonalCareOffer(boolean needPersonalCareOffer) {
    this.personalCareOffer = needPersonalCareOffer;
  }

  /**
   * Get informed if the citizen need an offer for support to grocery shopping
   *
   * @return needSupportGroceryOffer
   */
  @Override
  public boolean needSupportGroceryOffer() {
    return this.supportGroceryOffer;
  }

  /**
   * Set whether the citizen need an offer for support to grocery shopping
   *
   * @param needSupportGroceryOffer
   */
  @Override
  public void setSupportGroceryOffer(boolean needSupportGroceryOffer) {
    this.supportGroceryOffer = supportGroceryOffer;
  }

  /**
   * Get informed if the citizen need an offer for a longer house stay
   *
   * @return needSupportGroceryOffer
   */
  @Override
  public boolean needLongerStayOffer() {
    return this.longerStayOffer;
  }

  /**
   * Set whether the citizen need an offer for a longer house stay
   *
   * @param needLongerStayOffer
   */
  @Override
  public void setLongerStayOffer(boolean needLongerStayOffer) {
    this.longerStayOffer = needLongerStayOffer;
  }

  /**
   * Get informed if the citizen need an offer for learning
   *
   * @return needLearningOffer
   */
  @Override
  public boolean needLearningOffer() {
    return this.learningOffer;
  }

  /**
   * Set whether the citizen need an offer for learning
   *
   * @param needLearningOffer
   */
  @Override
  public void setLearningOffer(boolean needLearningOffer) {
    this.learningOffer = needLearningOffer;
  }

  /**
   * Get informed if the citizen need an offer for Rehabilitation
   *
   * @return needLearningOffer
   */
  @Override
  public boolean needRehabilitationOffer() {
    return this.rehabilitationOffer;
  }

  /**
   * Set whether the citizen need an offer for Rehabilitation
   *
   * @param needRehabilitationOffer
   */
  @Override
  public void setRehabilitationOffer(boolean needRehabilitationOffer) {
    this.rehabilitationOffer = needRehabilitationOffer;
  }

}
