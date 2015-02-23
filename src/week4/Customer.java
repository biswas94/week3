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
    private int areaId;
    /**
     * 
     * @param first first name
     * @param last last name
     * @param customerId customer customerId number
     */
    public Customer(String first, String last, int customerId) {
        super(first, last);
        this.customerId = customerId;
    }
    
    public Customer(String first, String last, int areaId){
        super(first, last);
        this.areaId = areaId;
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
