/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClumps;

/**
 *
 * @author User
 */
public class ConDC {

    /**
     * @param args the command line arguments
     */
public static void main(String args[]) {
    String firstName = args[0];
    String lastName = args[1];
    Integer age = new Integer(args[2]);
    String gender = args[3];
    String occupation = args[4];
    String city = args[5];

    Person joe = new Person(firstName, lastName, age, gender, occupation, city);
    joe.welcomeNew();
    joe.work();
}

private static class Person {
    /* All parameters have been moved to the new Person class where they are properly grouped and encapsulated */
    String firstName;
    String lastName;
    Integer age;
    String gender;
    String occupation;
    String city;
    
    public Person(String firstName, String lastName, Integer age, String gender, String occupation, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.city = city;
    }
    
    /* Existing functionality relating to the data can also be incorporated into the new class, reducing the risk of scope collision */
    public void welcomeNew() {
        System.out.printf("Welcome %s %s, a %d-year-old %s from %s who works as a%s\n", firstName, lastName, age, gender, city, occupation);
    }
    /* Additionally, the new class may be an opportunity for new functionality to be added */
    public void work() {
        System.out.printf("This is %s working hard on %s in %s", firstName, occupation, city);
    }
}
    
}
