package domain;

/**
 * Participant
 */
public class Participant {
    /**
     * Participant role
     */
    private ParticipantRole role;
    
    /**
     * 
     */
    private boolean consent;

    public Participant(ParticipantRole role, boolean consent) {
        this.role = role;
        this.consent = consent;
    }

    /**
     * Get role
     * @return 
     */
    public ParticipantRole getRole() {
        return role;
    }

    /**
     * Set Role
     * @param role 
     */
    public void setRole(ParticipantRole role) {
        this.role = role;
    }

    /**
     * Get consent
     * @return 
     */
    public boolean isConsent() {
        return consent;
    }

    /**
     * Set consent
     * @param consent 
     */
    public void setConsent(boolean consent) {
        this.consent = consent;
    }
}
