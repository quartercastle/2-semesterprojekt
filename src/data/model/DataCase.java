package data.model;

import acq.ICase;
import acq.ICaseWorker;
import acq.ICitizen;
import acq.ICompany;
import acq.IEffort;
import acq.IOffer;
import data.Database;
import acq.IParagraph;
import acq.IService;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashSet;

/**
 *
 * DataCase class
 */
public class DataCase implements ICase {

  /**
   * The responsible user for the case
   */
  private ICaseWorker responsible;

  /**
   * The citizen which the case is about
   */
  private ICitizen citizen;

  /**
   * Effort TODO not described correctly?
   */
  private Collection<IEffort> efforts = new HashSet<>();

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
   * Case id
   */
  private int id;

  /**
   * No args
   */
  public DataCase() {
  }

  /**
   * Create a new DataCase
   *
   *
   * @param responsible
   * @param citizen
   */
  public DataCase(ICaseWorker responsible, ICitizen citizen) {
    this.id = 0;
    this.responsible = responsible;
    this.citizen = citizen;

  }

  /**
   * get case id
   *
   * @return id
   */
  @Override
  public int getId() {
    return this.id;
  }

  /**
   * set server id
   *
   * @param id
   */
  @Override
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Get responsible
   *
   * @return responsible
   */
  @Override
  public ICaseWorker getResponsible() {
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
  public Collection<IEffort> getEfforts() {
    Collection<IEffort> ef = new HashSet<>();

    for (IEffort df : this.efforts) {
      ef.add(df);
    }

    return ef;
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

  /**
   * set efforts
   *
   * @param efforts
   */
  @Override
  public void setEfforts(Collection<IEffort> efforts) {
    this.efforts = efforts;
  }

  /**
   *
   *
   * @param responsible responsible caseworker
   */
  @Override
  public void setResponsible(ICaseWorker responsible) {
    this.responsible = responsible;
  }

  /**
   * Method to find DataCase in database
   *
   * @param id of the case to find
   * @return if found, the instance of DataCase with the specified id
   */
  public static DataCase find(int id) {
    DataCase dc = new DataCase(null, null);
    Database.getInstance().query(
            "SELECT id, citizen_id, case_worker_id, circumstance, inquiry, further_course, is_informed_about_rights, is_informed_about_duties, "
            + "practical_tasks_support, personal_care_support, grocery_support, temporary_stay, longer_stay, rehabilitation_support, "
            + "driving_support, temporary_house_offer, personal_care_offer, support_grocery_offer, longer_stay_offer, learning_offer, "
            + "rehabilitation_offer, guardianship, none_acting_guardian, curatorship, assessor, party_representative, power_of_attorney, "
            + "right_to_assessor_or_party_representative, information_saved_online "
            + "FROM cases "
            + "WHERE id = " + id,
            rs -> {
              dc.setId(rs.getInt(1));
              dc.setCitizen(DataCitizen.find(rs.getInt(2)));
              dc.setResponsible(DataCaseWorker.find(rs.getInt(3)));
              dc.setCircumstance(rs.getString(4));
              dc.setInquiry(rs.getString(5));
              dc.setFurtherCourse(rs.getString(6));
              dc.setInformedAboutRights(rs.getBoolean(7));
              dc.setInformedAboutDuties(rs.getBoolean(8));
              dc.setPracticalTasksSupport(rs.getBoolean(9));
              dc.setPersonalCareSupport(rs.getBoolean(10));
              dc.setGrocerySupport(rs.getBoolean(11));
              dc.setTemporaryStay(rs.getBoolean(12));
              dc.setLongerStay(rs.getBoolean(13));
              dc.setRehabilitationSupport(rs.getBoolean(14));
              dc.setDrivingSupport(rs.getBoolean(15));
              dc.setTemporaryHouseOffer(rs.getBoolean(16));
              dc.setPersonalCareOffer(rs.getBoolean(17));
              dc.setSupportGroceryOffer(rs.getBoolean(18));
              dc.setLongerStayOffer(rs.getBoolean(19));
              dc.setLearningOffer(rs.getBoolean(20));
              dc.setRehabilitationOffer(rs.getBoolean(21));
              dc.setGuardianship(rs.getBoolean(22));
              dc.setNoneActingGuardian(rs.getBoolean(23));
              dc.setCuratorship(rs.getBoolean(24));
              dc.setAssessor(rs.getBoolean(25));
              dc.setPartyRepresentative(rs.getBoolean(26));
              dc.setPowerOfAttorney(rs.getBoolean(27));
              dc.setRightToAssessorOrPartyRepresentative(rs.getBoolean(28));
              dc.setInformationSavedOnline(rs.getBoolean(29));
            });
    return dc;
  }

  public void save() {
    String query = null;

    ((DataCitizen) citizen).save();

    if (getId() == 0) {
      System.out.println("getCitizen " + getCitizen());
      System.out.println("getResponsible " + getResponsible());
      query = "INSERT INTO cases (citizen_id, case_worker_id, circumstance, inquiry, further_course, is_informed_about_rights, is_informed_about_duties, "
              + "practical_tasks_support, personal_care_support, grocery_support, temporary_stay, longer_stay, rehabilitation_support, "
              + "driving_support, temporary_house_offer, personal_care_offer, support_grocery_offer, longer_stay_offer, learning_offer, "
              + "rehabilitation_offer, guardianship, none_acting_guardian, curatorship, assessor, party_representative, power_of_attorney, "
              + "right_to_assessor_or_party_representative, information_saved_online ) "
              + "VALUES('" + getCitizen().getId() + "','" + getResponsible().getId() + "','" + getCircumstance() + "','" + getInquiry() + "','" + getFurtherCourse() + "','" + isInformedAboutRights() + "','" + isInformedAboutDuties()
              + "','" + needPracticalTasksSupport() + "','" + needPersonalCareSupport() + "','" + needGrocerySupport() + "','" + needTemporaryStay() + "','" + needLongerStay() + "','" + needRehabilitationSupport() + "','"
              + needDrivingSupport() + "','" + needTemporaryHouseOffer() + "','" + needPersonalCareOffer() + "','" + needSupportGroceryOffer() + "','" + needLongerStayOffer() + "','" + needLearningOffer()
              + "','" + needRehabilitationOffer() + "','" + isGuardianship() + "','" + isNoneActingGuardian() + "','" + isCuratorship() + "','" + isAssessor() + "','" + isPartyRepresentative()
              + "','" + isPowerOfAttorney() + "','" + isRightToAssessorOrPartyRepresentative() + "','" + isInformationSavedOnline() + "') "
              + "RETURNING id;";
    } else {
      query = "UPDATE cases "
              + "SET citizen_id ='" + getCitizen().getId() + "', case_worker_id='" + getResponsible().getId() + "', circumstance = '" + getCircumstance() + "', inquiry ='"
              + getInquiry() + "', further_course='" + getFurtherCourse() + "', is_informed_about_rights='" + isInformedAboutRights()
              + "', is_informed_About_duties='" + isInformedAboutDuties() + "', practical_tasks_support='" + needPracticalTasksSupport()
              + "', personal_care_support='" + needPersonalCareSupport() + "', grocery_support='" + needGrocerySupport() + "', temporary_stay='" + needTemporaryStay() + "', longer_stay='" + needLongerStay() + "', rehabilitation_support='"
              + needRehabilitationSupport() + "', driving_support='" + needDrivingSupport() + "', temporary_house_offer='" + needTemporaryHouseOffer() + "', personal_care_offer='"
              + needPersonalCareOffer() + "', support_grocery_offer='" + needSupportGroceryOffer() + "', longer_stay_offer='" + needLongerStayOffer() + "', learning_offer='" + needLearningOffer()
              + "', rehabilitation_offer='" + needRehabilitationOffer() + "', guardianship='" + isGuardianship() + "', none_acting_guardian='" + isNoneActingGuardian() + "', curatorship='"
              + isCuratorship() + "', assessor='" + isAssessor() + "', party_representative='" + isPartyRepresentative() + "', power_of_attorney='" + isPowerOfAttorney()
              + "', right_to_assessor_or_party_representative='" + isRightToAssessorOrPartyRepresentative() + "', information_saved_online='" + isInformationSavedOnline()
              + "' "
              + "WHERE id = " + id;
    }

    Database.getInstance().query(query, rs -> {
      if (id == 0) {
        id = rs.getInt(1);
      }
    });
  }

  /**
   * Add effort
   *
   * @param service
   * @param offer
   * @param paragraphs
   * @param start
   * @param end
   * @param company
   */
  @Override
  public void addEffort(IService service, IOffer offer, Collection<IParagraph> paragraphs, GregorianCalendar start, GregorianCalendar end, ICompany company) {
    IEffort effort = new DataEffort(service.getPrice() + offer.getPrice(), start, end, (DataCompany) company);
    this.efforts.add(effort);
  }
}
