/*
 * Extends the Person class, with a ID number for the customer
 */
package week4;

/**
 *
 * @author Biswas Bhandari
 * @version 23/02/2015
 */
public class Customer extends Person{
    private int customerId;
    private Address emailAddress;
    
    /**
     * 
     * @param first first name
     * @param last last name
     * @param id customer id number
     * @param emailAddress email address
     */
    public Customer(String first, String last, Address emailAddress, int id) {
        super(first, last);
        this.customerId = id;
        this.emailAddress = emailAddress;
    }

    /**
     * 
     * @return customer id number
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * 
     * @param customerId customer id number
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    /**
     * 
     * @return email address
     */
    public Address getEmailAddress() {
        return emailAddress;
    }

    /**
     * 
     * @param emailAddress email address 
     */
    public void setEmailAddress(Address emailAddress) {
        this.emailAddress = emailAddress;
    }
    
}
