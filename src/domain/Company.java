package domain;

/**
 * Company
 */
public class Company {
    
    /**
     * Name of the company
     */
    private String name;
    
    /**
     * The company's address
     */
    private Address address;

    public Company(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get address
     * @return address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Set address
     * @param address 
     */
    public void setAddress(Address address) {
        this.address = address;
    }
    
}
