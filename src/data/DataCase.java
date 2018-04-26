package data;

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

  private UUID id;
  private IUser user;
  private ICitizen citizen;
  private IEffort effort;
  private Collection<ICitizen> participants;

  public DataCase(UUID id, IUser user, ICitizen citizen, IEffort effort) {
    this.id = id;
    this.user = user;
    this.citizen = citizen;
    this.effort = effort;
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
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

}
