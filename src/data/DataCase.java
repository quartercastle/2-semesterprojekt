package data;

import acq.ICase;
import acq.ICitizen;
import acq.IEffort;
import acq.IUser;
import java.util.UUID;

/**
 *
 * DataCase class
 */
public class DataCase implements ICase {

  private String NAME;
  private String LOCATION;
  private UUID id;
  private IUser user;
  private ICitizen citizen;
  private IEffort effort;
  private ICitizen participants;

  public DataCase(UUID id, IUser user, ICitizen citizen, IEffort effort, ICitizen participants) {
    this.id = id;
    this.user = user;
    this.citizen = citizen;
    this.effort = effort;
    this.participants = participants;
  }

  @Override
  public UUID getId() {
    return this.id;
  }

  @Override
  public IUser getResponsible() {
    return this.user;
  }

  @Override
  public ICitizen getCitizen() {
    return this.citizen;
  }

  @Override
  public IEffort getEffort() {
    return this.effort;
  }

  @Override
  public ICitizen getParticipants() {
    return this.participants;
  }

  @Override
  public String toString() {
    return NAME + " " + LOCATION;
  }
}
