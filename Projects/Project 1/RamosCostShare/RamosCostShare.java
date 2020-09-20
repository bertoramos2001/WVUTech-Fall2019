/*
 * Alberto Ramos
 * 09/15/2019
 * CS 121 T01
 * Shared car cost per student
 * This program calculates the amount of money that each student has to pay if they split the total cost by the distance that each one does
 */

import java.util.Scanner;
 
public class RamosCostShare {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    //prompt the user to introduce the distance of Adam's house from the University
    System.out.println("Hello!");
    System.out.println("Enter how far is Adam's house from the University?");
    int distanceAdam = input.nextInt();
    //prompt the user to introduce the distance of John's house from the University
    System.out.println("Enter how far is John's house from the University?");
    int distanceJohn = input.nextInt();
    //prompt the user to introduce the distance of Michael's house from the University
    System.out.println("Enter how far is Michael's house from the University?");
    int distanceMichael = input.nextInt();
    
    float totalCost = 250;
    //add up all the three distances of the houses
    int totalMiles = distanceAdam + distanceJohn + distanceMichael;
    //calculate the cost per mile, dividing the total cost, which is invariable, and the sum of the three distances
    float costPerMile = totalCost / totalMiles;
    //calculate the total cost of each student, multiplying each distance and the amount of cost per mile
    float costAdam = costPerMile * distanceAdam;
    float costJohn = costPerMile * distanceJohn;
    float costMichael = costPerMile * distanceMichael;
    
    //output all the information as shown on the project heading
    System.out.println("Total cost is    : $" + totalCost);
    System.out.println("------------------------------");
    System.out.println("Adam     owes    : $" + (int)(costAdam * 100) / 100.0);
    System.out.println("John     owes    : $" + (int)(costJohn * 100) / 100.0);
    System.out.println("Michael  owes    : $" + (int)(costMichael * 100) / 100.0);
    System.out.println("------------------------------");
  }
}