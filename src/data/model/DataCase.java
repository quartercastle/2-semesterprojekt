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
   * Effort
   * TODO not described correctly?
   */
  private IEffort effort;

  /**
   * Collection of case participants
   * TODO Not currently implemented
   */
  private Collection<ICitizen> participants;

  /**
   * Create a new DataCase
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
   * @return id
   */
  @Override
  public UUID getId() {
    return this.id;
  }

  /**
   * Get responsible
   * @return responsible
   */
  @Override
  public IUser getResponsible() {
    return this.responsible;
  }

  /**
   * Get Citizen
   * @return Citizen
   */
  @Override
  public ICitizen getCitizen() {
    return this.citizen;
  }

  /**
   * Get effort
   * @return effort
   */
  @Override
  public IEffort getEffort() {
    return this.effort;
  }

  /**
   * Get participants
   * @return participants
   */
  @Override
  public Collection<ICitizen> getParticipants() {
    return this.participants;
  }

}
