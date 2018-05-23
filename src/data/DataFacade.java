package data;

import acq.ICase;
import acq.ICaseWorker;
import acq.IUser;
import acq.IData;
import acq.IRole;
import data.model.DataAddress;
import data.model.DataCase;
import data.model.DataCaseWorker;
import data.model.DataCitizen;
import data.model.DataRole;
import data.model.DataUser;
import java.util.Collection;
import util.Mapper;

public class DataFacade implements IData {

  /**
   * Instance of the class itself, used for singleton setup. Is set to null
   * initially, instantiated if needed though getInstance()
   */
  public static DataFacade data;

  /**
   * Instance of database
   */
  private Database database;

  /**
   * Disable normal instantiation
   */
  private DataFacade() {
    database.getInstance();
  }

  /**
   * Singleton setup for DomainFacade, returns instance of the class if none has
   * been made. If one has been made, returns that created instance
   *
   * @return Singleton instanse of DataFacade
   */
  public static DataFacade getInstance() {
    if (data == null) {
      data = new DataFacade();
    }

    return data;
  }

  /**
   * Add case
   *
   * @param c
   */
  @Override
  public void addCase(ICase c) {
    DataCase dc = new DataCase();
    DataCaseWorker dw = new DataCaseWorker();
    DataCitizen dataCitizen = new DataCitizen();
    DataUser du = new DataUser();
    DataAddress da = new DataAddress();
    DataRole dr = new DataRole();

    //DataAddress
    da.setPrimaryLine(c.getCitizen().getAddress().getPrimaryLine());
    da.setZip(c.getCitizen().getAddress().getZip());
    da.setCity(c.getCitizen().getAddress().getCity());
    da.setId(c.getCitizen().getAddress().getId());

    //DataCitizen
    dataCitizen.setCPR(c.getCitizen().getCPR());
    dataCitizen.setFirstName(c.getCitizen().getCPR());
    dataCitizen.setMiddleName(c.getCitizen().getMiddleName());
    dataCitizen.setLastName(c.getCitizen().getLastName());
    dataCitizen.setAddress(da);
    dataCitizen.setPhone(c.getCitizen().getPhone());
    dataCitizen.setEmail(c.getCitizen().getEmail());
    dataCitizen.setId(c.getCitizen().getId());

//    //DataRole
//    IRole role = c.getResponsible().getUser().getRole();
//    dr.setName(role.getName());
//    dr.setCanCreateCase(role.canCreateCase());
//    dr.setCanViewCase(role.canViewCase());
//    dr.setCanEditCase(role.canEditCase());
//    dr.setCanCloseCase(role.canViewCase());
//    dr.setId(role.getId());
//    //DataUser
//    IUser user = c.getResponsible().getUser();
//    du.setUsername(user.getUsername());
//    du.setPassword(user.getPassword());
//    du.setRole(null);
//    du.setId(user.getId());
    //DataCaseWorker
    dw.setId(c.getResponsible().getId());
    dw.setUser(null);
    dw.setId(c.getResponsible().getId());

    //DataCase
    dc.setResponsible(dw);
    dc.setAssessor(c.isAssessor());
    dc.setCircumstance(c.getCircumstance());
    dc.setCitizen(dataCitizen);
    dc.setCuratorship(c.isCuratorship());
    dc.setDrivingSupport(c.needDrivingSupport());
    dc.setEffort(c.getEffort());
    dc.setFurtherCourse(c.getFurtherCourse());
    dc.setGrocerySupport(c.needGrocerySupport());
    dc.setGuardianship(c.isGuardianship());
    dc.setId(c.getId());
    dc.setInformationSavedOnline(c.isInformationSavedOnline());
    dc.setInformedAboutDuties(c.isInformedAboutDuties());
    dc.setInformedAboutRights(c.isInformedAboutRights());
    dc.setInquiry(c.getInquiry());
    dc.setLearningOffer(c.needLearningOffer());
    dc.setLearningSupport(c.needLearningSupport());
    dc.setLongerStay(c.needLongerStay());
    dc.setLongerStayOffer(c.needLongerStayOffer());
    dc.setNoneActingGuardian(c.isNoneActingGuardian());
    dc.setPartyRepresentative(c.isPartyRepresentative());
    dc.setPersonalCareOffer(c.needPersonalCareOffer());
    dc.setPersonalCareSupport(c.needPersonalCareSupport());
    dc.setPowerOfAttorney(c.isPowerOfAttorney());
    dc.setPracticalTasksSupport(c.needPracticalTasksSupport());
    dc.setRehabilitationOffer(c.needRehabilitationOffer());
    dc.setRehabilitationSupport(c.needRehabilitationSupport());
    dc.setRightToAssessorOrPartyRepresentative(c.isRightToAssessorOrPartyRepresentative());
    dc.setSupportGroceryOffer(c.needSupportGroceryOffer());
    dc.setTemporaryHouseOffer(c.needTemporaryHouseOffer());
    dc.setTemporaryStay(c.needTemporaryStay());

    dc.save();
  }

  /**
   * Delete case
   *
   * @param c
   */
  public void deleteCase(ICase c) {
    // TODO
  }

  /**
   * Get collection of cases
   *
   * @return collection of cases
   */
  @Override
  public Collection<ICase> getCases() {
    return null;
  }

  /**
   * Find a user from its username
   *
   * @param username
   * @return case worker
   */
  @Override
  public IUser findUser(String username) {
    return DataUser.where("username", username);
  }

  /**
   * Find a caseworker from its user_id
   *
   * @param id
   * @return CaseWorker
   */
  @Override
  public ICaseWorker findCaseWorker(int id) {
    return DataCaseWorker.where("user_id", "" + id);
  }
}
