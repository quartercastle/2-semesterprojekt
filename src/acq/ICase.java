package acq;

import java.util.UUID;

public interface ICase {

  UUID getId();

  IUser getResponsible();

  ICitizen getCitizen();

  IEffort getEffort();

  ICitizen getParticipants();

}
