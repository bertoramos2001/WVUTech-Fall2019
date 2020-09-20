/*
 * Alberto Ramos
 * 9/26/2019
 * CS 121 Lab
 * Days in month
 * 
 * This program prompts the user to enter a month and a year and it prints out the year, month number and number of days of the month
 */
//import the Scanner
import java.util.Scanner;
//name class, main method and Scanner
public class DaysInMonth {
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    //prompt the user to enter the month
    System.out.println("Please enter the Month in numbers");
    int month = input.nextInt();
    //if the entered month is valid, then it continues executing the program, if it is not, it prints out that the month is invalid
    if (month >= 1 && month <= 12) {
      //prompt the user to enter the year
    System.out.println("Please enter the Year");
    int year = input.nextInt();
    // if the entered year is valid, then it continues executing the program, if it is not, it prints out that the year is invalid
    if (year> 1000) {
      //assign what will happen on each case, except from February, all the months will show the same output no matter the year it is
     switch(month) {
        case 1 : System.out.println("Number of days in year " + year + "and month 1 is 31");
          break;
          //if the month is February, we calculate whether it is a leap year or not and we execute 29 or 28 depending on this
       case 2  : if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
         System.out.println("Number of days in year " + year + "and month 2 is 29");
       }
       else {
         System.out.println("Number of days in year " + year + " and month 2 is 28");
       }
          break;
        case 3 : System.out.println("Number of days in year " + year + " and month 3 is 31");
          break;
        case 4 : System.out.println("Number of days in year " + year + " and month 4 is 30");
          break;
        case 5 : System.out.println("Number of days in year " + year + " and month 5 is 31");
          break;
        case 6 : System.out.println("Number of days in year " + year + " and month 6 is 30");
          break;
        case 7 : System.out.println("Number of days in year " + year + " and month 7 is 31");
          break;
        case 8 : System.out.println("Number of days in year " + year + " and month 8 is 31");
          break;
        case 9 : System.out.println("Number of days in year " + year + " and month 9 is 30");
          break;
        case 10 : System.out.println("Number of days in year " + year + " and month 10 is 31");
          break;
        case 11 : System.out.println("Number of days in year " + year + " and month 11 is 30");
          break;
        case 12 : System.out.println("Number of days in year " + year + " and month 12 is 31");
          break;
     }
    }
    //show output if the entered year was invalid
    else {
      System.out.println("Invalid input. Months must be between 1 and 12, year must be greater than 1000.");
    }
    }
    //show output if the entered month was invalid
    else {
      System.out.println("Invalid input. Months must be between 1 and 12, year must be greater than 1000.");
    }
  }
}