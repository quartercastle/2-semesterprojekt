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

  private String furtherCourse;

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

}
