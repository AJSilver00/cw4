package cwk4;

public class Force {

    // Fields
    private String reference;
    private String name;
    private ForceState state;
    private int strength;
    private int activationFee;

    /**
     * Constructor which creates a force with a reference, name, strength, and activation fee.
     */
    public Force(String ref, String nme) {
        setReference(ref);
        setName(nme);
        state = ForceState.DOCKED;
    }
    
    public void setReference(String ref) {
    	reference = ref;
    }
    
    public void setName(String nme) {
    	name = nme;
    }
    
    public void setStrength(int str) {
    	strength = str;
    }
    
    public void setFee(int fee) {
    	activationFee = fee;
    }
    
    /**
     * Getter method which returns force's reference
     * @return force reference
     */
    public String getReference() {
        return reference;
    }
    /**
     * Getter method which returns force's name
     * @return force name
     */
    public String getName() {
        return name;
    }
    /**
     * Getter method which returns force's state
     * @return force state
     */
    //public int getState() {

    //}
    /**
     * Mutator method which updates force's state
     * @param st is the state which the force will be updated to.
     */
    //public void changeState(String st) {

    //}
    /**
     * Getter method which returns force's strength
     * @return force strength
     */
    public int getStrength() {
        return strength;
    }
    /**
     * Getter method which returns force's activation fee
     * @return force activation fee
     */
    public int getActivationFee() {
        return activationFee;
    }
    /**
     * Getter method which returns all relevant information related to this force.
     * @return all relevant information related to this force
     */
    public String toString() {
        String s =  "\nRef: " +reference+
                    "\nName: " +name+
                    "\nState: " +state+
                    "\nStrength: " +strength+
                    "\nActivation Fee: " +activationFee;
        return s;
    }
}
