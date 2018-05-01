/**
 * Case class, containing the data relevant for each individual case
 */
package domain;

import acq.ICitizen;
import java.util.Collection;
import java.util.UUID;
import acq.ICase;
import java.util.HashSet;

public class Case implements ICase {

  /**
   * Unique ID for the case
   */
  private UUID id;
  /**
   * The user responsile for the case
   */
  private User responsible;
  /**
   * Citizen attached to the case
   */
  private Citizen citizen;
  /**
   * Effort attached to the case
   */
  private Effort effort;
  /**
   * Participating citizens
   */
  private Collection<ICitizen> participants;

  /**
   * Case constructor
   *
   * @param responsible
   * @param citizen
   * @param effort
   */
  public Case(User responsible, Citizen citizen, Effort effort) {
    this.id = new UUID(5, 7);
    this.responsible = responsible;
    this.citizen = citizen;
    this.effort = effort;
    this.participants = new HashSet<>();
  }

  /**
   * Returns case ID
   *
   * @return id
   */
  @Override
  public UUID getId() {
    return id;
  }

  /**
   * Sets case-id
   *
   * @param id
   */
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   * returns the case-responsible user
   *
   * @return responsible
   */
  @Override
  public User getResponsible() {
    return responsible;
  }

  /**
   * Sets the case-responsible user
   *
   * @param responsible
   */
  public void setResponsible(User responsible) {
    this.responsible = responsible;
  }

  /**
   * Returns citizen
   *
   * @return citizen
   */
  @Override
  public Citizen getCitizen() {
    return citizen;
  }

  /**
   * sets citizen
   *
   * @param citizen
   */
  public void setCitizen(Citizen citizen) {
    this.citizen = citizen;
  }

  /**
   * Returns the effort created for the case
   *
   * @return effort
   */
  @Override
  public Effort getEffort() {
    return effort;
  }

  /**
   * Sets the effort asigned to the case
   *
   * @param effort
   */
  public void setEffort(Effort effort) {
    this.effort = effort;
  }

  /**
   * Returns the participants in the case
   *
   * @return participants
   */
  @Override
  public Collection<ICitizen> getParticipants() {
    return participants;
  }

  /**
   * Sets participants in the case
   *
   * @param participants
   */
  public void setParticipants(Collection<ICitizen> participants) {
    this.participants = participants;
  }

}
