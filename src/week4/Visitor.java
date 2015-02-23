/*
 * Extends the Person class, with a visit date for the visitor
 */
package week4;

import java.util.Date;

/**
 *
 * @author Biswas Bhandari
 * @version 23/02/2015
 */
public class Visitor extends Person{
    private Date visitDate;
    private Address emailAddress;
    
    /**
     * 
     * @param first first name
     * @param last last name
     * @param d visit date 
     */
    public Visitor(String first, String last, Address emailAddress, Date d) {
        super(first, last);
        this.visitDate = d;
        this.emailAddress = emailAddress;
    }

    /**
     * 
     * @return visit date
     */
    public Date getVisitDate() {
        return visitDate;
    }

    /**
     * 
     * @param visitDate visit date
     */
    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
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
