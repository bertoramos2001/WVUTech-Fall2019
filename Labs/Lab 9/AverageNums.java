/*
 * Alberto Ramos
 * 11/7/2019
 * CS 121 Lab
 * Overloading average
 * 
 * This program is an exercise to check the method overloading
 */
//name the class and the main method
public class AverageNums {
  public static void main (String [] args) {
    //show the outputs of each case, invoking the methods
    System.out.println("The average value of 4 and 6 is: " + (average(4,6)));
    System.out.println("The average value of 2.89 and 6.75 is: " + (average(2.89,6.75)));
    System.out.println("The average value of 5.67, 2.93 and 7.43 is: " + (average(5.67,2.93,7.43)));
  }
  //first average method, works with two integers and returns another integer
  public static int average(int num1, int num2){
    int result;
    //add both numbers and divide them by 2
    result = ((num1 + num2)/2);
    return result;
  }
   //second average method, works with two doubles and returns another double
  public static double average(double num1, double num2) {
    double result;
    //add both numbers and divide them by 2
    result = ((num1 + num2)/2);
    return ((int)(result*1000)/1000);
  }
   //third average method, works with three doubles and returns another double
  public static double average(double num1, double num2, double num3) {
    double result;
    //add the three numbers and divide them by 3
    result = ((num1 + num2 + num3)/3);
    return ((int)(result*1000)/1000);
  }
}