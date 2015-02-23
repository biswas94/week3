/*
 * 
 */
package week4;

/**
 *
 * @author 1309400
 */
public class Address {
    private String emailAddress;
    private String city;
    private String postCode;
    
    /**
     * 
     * @param emailAddress email address
     */
    public Address(String city, String emailAddress, String postCode) {
        this.emailAddress = emailAddress;
        this.city = city;
        this.postCode = postCode;
    }
}
