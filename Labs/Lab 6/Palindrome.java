/*
 * Alberto Ramos
 * 10/17/2019
 * CS 121 Lab
 * Palindrome
 * 
 * This program prompts the user to enter a five-digit integer and determines whether it is a palindrome integer
 */

//import the Scanner
import java.util.Scanner;
//name the class, main method and Scanner
public class Palindrome{
  public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    //prompt the user to enter a five-digit number and store it
    System.out.print("Enter a five-digit integer: ");
    String palindrome = input.nextLine();
    //store each digit of the entered number separately
    int digit1 = palindrome.charAt(0);
    int digit2 = palindrome.charAt(1);
    int digit3 = palindrome.charAt(2);
    int digit4 = palindrome.charAt(3);
    int digit5 = palindrome.charAt(4);
    //if the number is a palindrome, print it
    if((digit1 == digit5) && (digit2 == digit4)){
      System.out.println(palindrome + " is a palindrome");
    }
    //if the number is not a palindrome, print it
    else{
      System.out.println(palindrome + " is not a palindrome"); 
      //if the number is not a palindrome and the second and second last digits do not match, print it
      if(digit1 == digit5 && digit2 != digit4){
         System.out.println("Second and second last digits do not match");
      }
      //if the number is not a palindrome and the first and last digits do not match, print it
      else if(digit1 != digit5 && digit2 == digit4){
        System.out.println("First and last digits do not match");
      }
      //if the number is not a palindrome and none of the digits match, print it
      else{
        System.out.println("None of the digits match");
      }
    }
  }
}
