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
     
     System.out.print("Enter the coefficients of a quadratic equation (enter only integer values) a, b, c");
      int coefficient1 = input.nextInt();
      int coefficient2 = input.nextInt();
      int coefficient3 = input.nextInt();
      
      double calculation = (Math.pow(coefficient2, 2) - 4* coefficient1 * coefficient3);
       double result1 = (-coefficient2 + Math.pow(calculation, 0.5)) / 2 * coefficient1;
       double result2 = (-coefficient2 + Math.pow(calculation, 0.5)) / 2 * coefficient1;
       double result3 = (-coefficient2 - Math.pow(calculation, 0.5))  / 2 * coefficient1;
      if (calculation < 0)
        System.out.print("The equation has no real roots");
      if (calculation == 0) 
         System.out.print("The equation has one result " + result1);
      if (calculation > 0)
        System.out.print("The equation has two results " + result2 + " and " + result3);
  }
}