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
        
        Address addr1 = new Address("Aberdeen", "j.m.bass@rgu.ac.uk", "54534");
        Address addr2 = new Address("Aberdeen", "m.zarb@rgu.ac.uk", "45545");
        
        Customer customer = new Customer("Julian", "Bass", addr1, 200);
        
        Visitor visitor = new Visitor("Mark", "Zarb", addr2, date);
    }
    
}
