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
public class SinDC {

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
    welcomeNew(firstName, lastName, age, gender, occupation, city);
}

public static void welcomeNew(String firstName, String lastName, Integer age, String gender, String occupation, String city) {
    System.out.printf("Welcome %s %s, a %d-year-old %s from %s who works as a%s\n",firstName, lastName, age, gender, city, occupation);
}
    
}
