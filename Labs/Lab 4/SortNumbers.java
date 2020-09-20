/*
 * Alberto Ramos
 * 9/19/2019
 * CS 121 Lab
 * Sort Numbers
 * 
 * This program asks the user to enter three integers and displays the integer in non-decreasing order
 */
import java.util.Scanner;
  
public class SortNumbers {
  public static void main (String [] args) {
     Scanner input = new Scanner(System.in);
     //initialize a variable temp so you can add to it the values of the input integers in order to change their order
     int temp = 0;
    //prompt the user for first integer
    System.out.print("Enter first integer: ");
    int firstInteger = input.nextInt();
    //prompt the user for second integer
    System.out.print("Enter second integer: ");
    int secondInteger = input.nextInt();
    //prompt the user for third integer
    System.out.print("Enter third integer: ");
    int thirdInteger = input.nextInt();
    //if the first integer is greater than the second, switch their values
    if (firstInteger > secondInteger) {
      temp = firstInteger;
      firstInteger = secondInteger;
      secondInteger = temp;
    }
    //if the new second integer is greater than the third integer, switch their values
    if (secondInteger > thirdInteger) {
      temp = secondInteger;
      secondInteger = thirdInteger;
      thirdInteger = temp;
    }
    //if the new first integer is greater than the new second integer, switch their values
    if (firstInteger > secondInteger) {
      temp = firstInteger;
      firstInteger = secondInteger;
      secondInteger = temp;
    }
    System.out.print("The sorted numbers are " + firstInteger + " " + secondInteger + " " + thirdInteger);
  }
}