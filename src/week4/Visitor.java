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
    
    /**
     * 
     * @param first first name
     * @param last last name
     * @param d visit date 
     */
    public Visitor(String first, String last, Date d) {
        super(first, last);
        this.visitDate = d;
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

}
