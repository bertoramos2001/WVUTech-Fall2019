/*
 * Alberto Ramos
 * 09/15/2019
 * CS 121 T01
 * Tip Calculator
 * This program helps the user to compute a final bill in a restaurant
 */

import java.util.Scanner;

public class RamosBillCalculator {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    //prompt the user for a subtotal of their bill
    System.out.print("Enter subtotal: ");
    double subtotalAmount = input.nextDouble();
    //prompt the user for the percentage of tips that he wishes to pay
    System.out.print("Enter tips rate: ");
    double tipsAmount = input.nextDouble();
    //calcuate the tips percentage into decimals and we multiply that to the previous sbtotal amount, we get the gratuity
    double gratuity = (tipsAmount/100) * subtotalAmount;
    //add the gratuity to the subtotal amount in order to obtain the total cost, including the tips
    double totalAmount = gratuity + subtotalAmount;
    System.out.println("The gratuity is " +gratuity+ ", total is " + totalAmount);
  }
}