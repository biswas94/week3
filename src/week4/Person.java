/*
 * Represents a person with a first name and a last name
 */
package week4;

/**
 *
 * @author Biswas Bhandari
 * @version 23/02/2015
 */
public class Person {
    
    private String firstName;
    private String lastName;
    
    /**
     * 
     * @param first first name
     * @param last last name
     */
    public Person(String first, String last){
        this.firstName = first;
        this.lastName = last;
    }

    /**
     * 
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param firstName first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @param lastName last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
}
