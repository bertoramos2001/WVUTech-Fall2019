/*
 * Alberto Ramos
 * 9/19/2019
 * CS 121 Lab
 * Quadratic equation
 * 
 * This program 
 */
import java.util.Scanner;

public class QuadEquation {
  public static void main (String [] args){
     Scanner input = new Scanner(System.in);
     //prompt the user to enter the coefficients of the quadratic equation
     System.out.print("Enter the coefficients of a quadratic equation (enter only integer values) a, b, c");
      int coefficient1 = input.nextInt();
      int coefficient2 = input.nextInt();
      int coefficient3 = input.nextInt();
      //do the calculation of twhat is inside of the square root, as this will be the same in all the calculations
      double calculation = (Math.pow(coefficient2, 2) - 4* coefficient1 * coefficient3);
      //calculate the square root of the previous calculation and divide it by two in each case
       double result1 = (-coefficient2 + Math.pow(calculation, 0.5)) / 2 * coefficient1;
       double result2 = (-coefficient2 + Math.pow(calculation, 0.5)) / 2 * coefficient1;
       double result3 = (-coefficient2 - Math.pow(calculation, 0.5))  / 2 * coefficient1;
       //show the results depending on the input values
      if (calculation < 0)
        System.out.print("The equation has no real roots");
      if (calculation == 0) 
         System.out.print("The equation has one result " + result1);
      if (calculation > 0)
        System.out.print("The equation has two results " + result2 + " and " + result3);
  }
}