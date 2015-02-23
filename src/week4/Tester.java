/*
 * 
 */
package week4;

import java.util.Date;

/**
 *
 * @author Biswas Bhandari
 * @version  23/02/2015
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date = new Date();
        
        Customer customer = new Customer("Julian", "Bass", 200);
        
        Visitor visitor = new Visitor("Mark", "Zarb", date);
    }
    
}
