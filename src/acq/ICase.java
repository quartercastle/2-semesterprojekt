/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acq;

import java.util.UUID;

/**
 *
 * @author Victor Gram
 */
public interface ICase {

  UUID getId();

  IUser getResponsible();

  ICitizen getCitizen();

  IEffort getEffort();

  ICitizen getParticipants();

}
