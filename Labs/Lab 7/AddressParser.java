/*
 * Alberto Ramos
 * 10/24/2019
 * CS 121 Lab
 * Address Parser
 * 
 * This program  reads the address of a user as a single string, extracts the main street, city, state and zipcode and prints them out
 */
//import the scanner
import java.util.Scanner;
//name the class, main method and scanner
public class AddressParser {
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    //prompt the user to enter the address and read it
    System.out.println("Enter your address in the following form : 123 Main Street, City, State, ZipCode");
    String address = input.nextLine();
    //read from the first character to the first ','
    String mainStreet = address.substring(0, (address.indexOf(',')));
    //read from the first ',' excluding it until the second ',' excluding it
    String city = address.substring(address.indexOf(',')+1,address.indexOf(',',address.indexOf(',')+1));
    //read from the second ',' excluding it until the third ',' excluding it
    String state = address.substring((address.lastIndexOf(',',address.lastIndexOf(',')-1))+1,address.lastIndexOf(','));
    //read from the third ',' excluding it until the last ',' excluding it
    String zipCode = address.substring(address.lastIndexOf(',')+1);                                     
    //print the results for main street, city, state and zip code
    System.out.println("Main Street: " + mainStreet);
    System.out.println("City: " + city);
    System.out.println("State: " + state);
    System.out.println("Zip: " + zipCode);
  }
}
