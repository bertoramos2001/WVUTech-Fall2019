/* * Alberto Ramos 
 * 
 * 10/24/2019
 * CS 121 Lab
 * Receipt
 *  
 * This program  creates a nicely formatted receipt assuming there are only 3 items in the receipt
 */
//import the Scanner
import java.util.Scanner;
//name the class, main method and Scanner
public class Receipt {
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    //prompt the user to enter the amount of oragnes, apples and onions
    System.out.println("Enter the amount of oranges");
    double orangeAmount = input.nextFloat();
    System.out.println("Enter the amount of apples");
    double appleAmount = input.nextFloat();
    System.out.println("Enter the amount of onions");
    double onionAmount = input.nextFloat();
    //check if the user entered amounts are correct
    if((orangeAmount>=0 && orangeAmount<=10000)&&(appleAmount>=0 && appleAmount<=10000) && (appleAmount>=0 && appleAmount<=10000)){
      //enter the prices of each object
      double orangePrice = 1.59;
      double applePrice = 1.99;
      double onionPrice = 0.50;
      //print the first part of the receipt using format
      System.out.println("Item      Price/lb     weight       Price ");
      System.out.printf("Orange  : $%4.2f/lb %9.2f lb  $%,9.2f\n\n", orangePrice, orangeAmount, orangeAmount * orangePrice);
      System.out.printf("Apple   : $%4.2f/lb %9.2f lb  $%,9.2f\n\n", applePrice, appleAmount, appleAmount * applePrice);
      System.out.printf("Onion   : $%4.2f/lb %9.2f lb  $%,9.2f\n\n", onionPrice, onionAmount, onionAmount * onionPrice);
      //leave a blank space between the two parts of the receipt
      System.out.println("    ");
      //calculate total, tax and subtotal
      double subtotal = orangeAmount*orangePrice + appleAmount*applePrice + onionAmount*onionPrice;
      double tax = (subtotal * 7) / 100;
      double total = subtotal + tax;
      //print the second part of the receipt
      System.out.printf("Subtotal:\t\t\t  $%,9.2f\n",subtotal);
      System.out.printf("Tax     :\t\t\t  $%,9.2f\n",tax);
      System.out.printf("Total   :\t\t\t  $%,9.2f\n",total);
    }    //indicate the user that his input is invalid if he enters an invalid input
    else{      System.out.println("invalid input");
    } 
  }
}