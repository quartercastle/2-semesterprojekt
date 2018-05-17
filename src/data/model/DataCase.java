package data.model;

import acq.ICase;
import acq.ICitizen;
import acq.IEffort;
import acq.IUser;
import data.Database;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

/**
 *
 * DataCase class
 */
public class DataCase implements ICase {

  /**
   * The responsible user for the case
   */
  private IUser responsible;

  /**
   * The citizen which the case is about
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
   * Eventual circumstances to the case
   */
  private String circumstance;

  /**
   * Guardianship
   */
  private boolean guardianship;

  /**
   * None acting Guardian
   */
  private boolean noneActingGuardian;

  /**
   * Curatorship
   */
  private boolean curatorship;

  /**
   * Assesor
   */
  private boolean assessor;

  /**
   * Party Representative
   */
  private boolean partyRepresentative;

  /**
   * Power of Attorney
   */
  private boolean powerOfAttorney;

  /**
   * Right To Assessor Or Party Representative
   */
  private boolean rightToAssessorOrPartyRepresentative;

  /**
   * Citizen is informed aboute their data is saved online
   */
  private boolean informationSavedOnline;

  /**
   * Further course for case
   */
  private String furtherCourse;

  /**
   * Case ID
   */
  private int ID;

  /**
   * Create a new DataCase
   *
   * @param id
   * @param responsible
   * @param citizen
   * @param effort
   */
  public DataCase(IUser responsible, ICitizen citizen, IEffort effort) {
    this.ID = 0;
    this.responsible = responsible;
    this.citizen = citizen;
    this.effort = effort;
    this.participants = new ArrayList();
  }

  /**
   * get case id
   *
   * @return id
   */
  @Override
  public int getID() {
    return this.ID;
  }

  /**
   * set server id
   *
   * @param id
   */
  @Override
  public void setID(int id) {
    this.ID = id;
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
   * Set citizen
   *
   * @param citizen
   */
  @Override
  public void setCitizen(ICitizen citizen) {
    this.citizen = citizen;
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
    this.supportGroceryOffer = needSupportGroceryOffer;
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

  /**
   * Get eventual circumstance
   *
   * @return
   */
  @Override
  public String getCircumstance() {
    return circumstance;
  }

  /**
   * Set circumstance
   *
   * @param circumstance
   */
  @Override
  public void setCircumstance(String circumstance) {
    this.circumstance = circumstance;
  }

  /**
   * Is guardian
   *
   * @return guardianship
   */
  @Override
  public boolean isGuardianship() {
    return guardianship;
  }

  /**
   * Set Guardianship
   *
   * @param guardianship
   */
  @Override
  public void setGuardianship(boolean guardianship) {
    this.guardianship = guardianship;
  }

  /**
   * Is none acting guardian
   *
   * @return noneActingGuardian
   */
  @Override
  public boolean isNoneActingGuardian() {
    return noneActingGuardian;
  }

  /**
   * Set None Acting Guardian
   *
   * @param noneActingGuardian
   */
  @Override
  public void setNoneActingGuardian(boolean noneActingGuardian) {
    this.noneActingGuardian = noneActingGuardian;
  }

  /**
   * Is curatorship
   *
   * @return curatorship
   */
  @Override
  public boolean isCuratorship() {
    return curatorship;
  }

  /**
   * Set curatorship
   *
   * @param curatorship
   */
  @Override
  public void setCuratorship(boolean curatorship) {
    this.curatorship = curatorship;
  }

  /**
   * Is assesort
   *
   * @return assessor
   */
  @Override
  public boolean isAssessor() {
    return assessor;
  }

  /**
   * Set assessor
   *
   * @param assessor
   */
  @Override
  public void setAssessor(boolean assessor) {
    this.assessor = assessor;
  }

  /**
   * Is party representative
   *
   * @return partyRepresentative
   */
  @Override
  public boolean isPartyRepresentative() {
    return partyRepresentative;
  }

  /**
   * Set party representative
   *
   * @param partyRepresentative
   */
  @Override
  public void setPartyRepresentative(boolean partyRepresentative) {
    this.partyRepresentative = partyRepresentative;
  }

  /**
   * Is power of attorney
   *
   * @return powerOfAttorney
   */
  @Override
  public boolean isPowerOfAttorney() {
    return powerOfAttorney;
  }

  /**
   * Set power of attorney
   *
   * @param powerOfAttorney
   */
  @Override
  public void setPowerOfAttorney(boolean powerOfAttorney) {
    this.powerOfAttorney = powerOfAttorney;
  }

  /**
   * is Right To Assessor Or Party Representative
   *
   * @return rightToAssessorOrPartyRepresentative
   */
  @Override
  public boolean isRightToAssessorOrPartyRepresentative() {
    return rightToAssessorOrPartyRepresentative;
  }

  /**
   * Set Right To Assessor Or Party Representative
   *
   * @param rightToAssessorOrPartyRepresentative
   */
  @Override
  public void setRightToAssessorOrPartyRepresentative(boolean rightToAssessorOrPartyRepresentative) {
    this.rightToAssessorOrPartyRepresentative = rightToAssessorOrPartyRepresentative;
  }

  /**
   * Is information saved online
   *
   * @return informationSavedOnline
   */
  @Override
  public boolean isInformationSavedOnline() {
    return informationSavedOnline;
  }

  /**
   * Set informationSavedOnline
   *
   * @param informationSavedOnline
   */
  @Override
  public void setInformationSavedOnline(boolean informationSavedOnline) {
    this.informationSavedOnline = informationSavedOnline;
  }

  /**
   * Get fourther cource for case
   *
   * @return furtherCource
   */
  @Override
  public String getFurtherCourse() {
    return furtherCourse;
  }

  /**
   * Set furtherCource
   *
   * @param furtherCourse
   */
  @Override
  public void setFurtherCourse(String furtherCourse) {
    this.furtherCourse = furtherCourse;
  }

  public DataCase find(int id) {
    // TODO
    return null;
  }

  public void save() {
    String query = null;

    if (getID() == 0) {
      query = "INSERT INTO addresses (primary_line, secondary_line, zip_code, city, country) "
              + "VALUES('" + primaryLine + "','" + secondaryLine + "','" + zip + "','" + city + "','" + country + "');";
    } else {
      query = "UPDATE addresses "
              + "SET primary_line = '" + getPrimaryLine() + "', secondary_line ='"
              + getZip() + "', city='" + getCity() + "', country='" + getCountry() + "' "
              + "WHERE id = " + id;
    }

    Database.getInstance().query(query, rs -> {
    });
  }

}
