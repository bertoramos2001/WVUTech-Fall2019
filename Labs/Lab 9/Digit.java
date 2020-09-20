/*
 * Alberto Ramos
 * 11/09/2019
 * CS 121 Lab
 * Reverse Digit
 * 
 * This program takes an integer as a parameter and returns the number with its digits reverse
 */
//import the scanner, name the class, the main method and scanner
import java.util.Scanner;
public class Digit {
  public static void main (String [] args) {
    Scanner input = new Scanner (System.in);
    //prompt the user to enter an integer and read it
    System.out.print("Enter an integer");
    int num = input.nextInt();
    //print the result of the result integer by invoking the reverseDigit method
    System.out.print("The number entered with its digits reversed is: " + reverseDigit(num));
  }
  //reverse Digit method
  public static int reverseDigit(int a){
    //get the length of the integer entered by transforming it to a string and using .length()
   int length = String.valueOf(a).length();
   //set the count of the loop to 0
   int count = 0;
   //set the variable of the reverse number to 0
   int revNumber = 0;
   //initialize a loop while the count is less than the length of the entered integer
   while(count < length) {
     //use the algorithm to solve the problem, by multiplying each time the reverse number times 10 and adding it to the remainder of the integer entered by the user,
     //that is divided by 10 each iteration
    revNumber = revNumber * 10 + a % 10;
    a = a / 10;
    //increase the count of the loop after each iteration
    count++;
   }
   //return the calculated reversed number
   return revNumber;
  }
}