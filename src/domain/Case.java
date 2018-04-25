/**
 * Case class, containing the data relevant for each individual case
 */
package domain;

import acq.ICase;
import java.util.UUID;

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
  private Citizen participants;

  /**
   * Returns case ID
   *
   * @return id
   */
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
  public Citizen getParticipants() {
    return participants;
  }

  /**
   * Sets participants in the case
   *
   * @param participants
   */
  public void setParticipants(Citizen participants) {
    this.participants = participants;
  }

}
