/*
 * Alberto Ramos
 * 9/12/2019
 * CS 121 Lab
 * Vehicle Mileage
 * This program computes the number of miles an automobile can be driven without refueling it
 */

import java.util.Scanner;

public class Mileage {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in); 
    
     //prompt the user for input of gallons
    System.out.print("Enter the capacity in gallons: ");
    float gallons = input.nextFloat();
    
    //prompt the user for input of miles per gallon
    System.out.println("Enter the miles per gallon of the vehicle: "); 
    float milesPerGallon = input.nextFloat();
    
     //calculate how many miles can the automobile be driven with no refueling
    float milesNoRefueling = gallons * milesPerGallon;
    System.out.println("The total miles the vehicle can drive without refueling is: " + milesNoRefueling);
    
  }
}