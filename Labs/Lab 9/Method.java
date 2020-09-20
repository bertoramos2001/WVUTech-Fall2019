/*
 * Alberto Ramos
 * 11/7/2019
 * CS 121 Lab
 * Method exercise
 * 
 * This program performs certain computations as an exercise to understand methods
 */
//import the scanner for all the class
import java.util.Scanner;
//name the class, main method and the scanner of the main method
public class Method {
public static void main(String[] args) {
  Scanner input = new Scanner (System.in);
  //prompt the user to entr an integer and a double
    System.out.print("Enter an integer");
    int num = input.nextInt();
    System.out.print("Enter a double");
    double dec = input.nextDouble();
    //invoke the second method to perform the calculations
    two(num, dec);
}
//method 1
public static int one(int x, int y) {
  //create a result variable
  int result1;
  //if x is greater than y, assign a value to result1
  if (x > y){
    result1 = (x+y);
  }
  // if x is not greater than y, assign another value to result1
  else{
   result1 = (x - (2*y));
  
}
  //return whichever value that result1 has been assigned
  return result1;
}
//method 2
public static double two(int x, double a) {
  //name the scanner for this method
  Scanner input = new Scanner (System.in);
  //create an int and double variables
  int first;
  //read a new double value from the user
  System.out.print("Enter a new double value");
  double z = input.nextDouble();
  //add a to z and record it as z
  z += a;
  //invoke method 1 to perform the calculations in order to assign a value to the "first" value
  first = one(6,8);
  //add "first" to "x" and record it as "first"
  first += x;
  //print certain output if z is greater than twice the first
  if (z > (2* first)){
   System.out.println("z is: " + z); 
  }
  //print other output if z is not greater than twice the first
      else{
        int mult = (2*first);
       System.out.println("The substraction of " + (2 * first) + " - " + z + " is: " + ((mult) - z)); 
      }
      //return 0 if no other of the previous conditions execute (will never happen)
      return 0;
}
}