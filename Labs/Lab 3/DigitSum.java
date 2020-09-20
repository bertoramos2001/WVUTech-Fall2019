/*
 * Alberto Ramos
 * 9/12/2019
 * CS 121 Lab
 * Vehicle Mileage
 * This program computes the number of miles an automobile can be driven without refueling it
 */

import java.util.Scanner;

public class DigitSum {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    
    //prompt the user to enter a number
    System.out.print("Enter an integer between 0 and 1000: ");
    int number = input.nextInt();
    //calculate the first digit and extract the remaining number
    int firstDigit = number % 10;
    int resultAfterFirstDigit = number / 10;
    //calculate the second digit and extract the remaining number
      int secondDigit =  resultAfterFirstDigit % 10;
      int resultAfterSecondDigit =  resultAfterFirstDigit / 10;
    //calculate the third digit and extract the remaining number
        int thirdDigit = resultAfterSecondDigit % 10;
        int resultAfterThirdDigit = resultAfterSecondDigit / 10;
    //calculate the sum of all the digits
    int finalResult = firstDigit + secondDigit + thirdDigit;
    System.out.println("The sum of all digits is: " + thirdDigit + " + " + secondDigit + " + " + firstDigit + " = " + finalResult);
  }
}