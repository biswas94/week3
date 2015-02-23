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
    
    /**
     * 
     * @param first first name
     * @param last last name
     * @param id customer id number
     */
    public Customer(String first, String last, int id) {
        super(first, last);
        this.customerId = id;
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
    
}
