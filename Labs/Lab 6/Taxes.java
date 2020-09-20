/*
 * Alberto Ramos
 * 10/17/2019
 * CS 1221 Lab
 * Taxes
 * 
 * This program prompts the user to enter their status and income and prints the amount of taxes they must pay
 */

//import the Scanner
import java.util.Scanner;
//name class, main method and Scanner
public class Taxes{
  public static void main (String [] args){
    Scanner input = new Scanner (System.in);
    //prompt the user to enter status
    System.out.print("Enter the status Single (0) or Married (1): ");
    int status = input.nextInt();
    //print invalid ststus if the status entered is not 1 or 0
    if((status > 1) || (status < 0)){
      System.out.print("Invalid status. Please input correct status.");
    }
    //evaluate what happens if the user selects status 0
    else if(status == 0){
    System.out.println("Enter the income: ");
    float income = input.nextFloat();
      //evaluate if the user has an income between 0 and 8000 and is single; compute tax
      if((income >= 0) && (income <= 8000)){
        float taxSingle0 = ((10 * income) / 100);
        System.out.println("The amount owed in taxes is: " + taxSingle0);
      }
      //evaluate if the user has an income between 8000 and 32000 and is single; compute tax
      else if((income > 8000) && (income <= 32000)){
        float taxSingle1 = (800 + (15 * (income - 8000)/100));
        System.out.println("The amount owed in taxes is: " + taxSingle1);
      }
      //evaluate if the user has an income over 32000 and is single; compute the tax
      else if(income > 32000){
        float taxSingle2 = (4400 + (25 * (income - 32000)/100));
        System.out.println("The amount owed in taxes is: " + taxSingle2);
      }
     }
    //evaluate what happens if the user selects status 1
    else if(status == 1) {
      System.out.println("Enter the income: ");
    float income = input.nextFloat();
       //evaluate if the user has an income between 0 and 16000 and is married; compute tax
      if((income >= 0) && (income <= 16000)){
        float taxMarried0 = ((10 * income) / 100);
        System.out.println("The amount owed in taxes is: " + taxMarried0);
      }
      //evaluate if the user has an income between 16000 and 64000000 and is married; compute tax
      else if((income > 16000) && (income <= 64000)){
        float taxMarried1 = (1600 + (15 * (income - 16000)/100));
        System.out.println("The amount owed in taxes is: " + taxMarried1);
      }
      //evaluate if the user has an income over 64000 and is married; compute tax
      else if(income > 64000){
        float taxMarried2 = (8800 + (25 * (income - 64000)/100));
        System.out.println("The amount owed in taxes is: " + taxMarried2);
      }
     }
  }
}

