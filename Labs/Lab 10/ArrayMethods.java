/*Alberto Ramos
 * 11/21/2019
 * CS 121 Lab
 * Array Methods
 * 
 * In this program, multiple operations with arrays are performed
 */
//import the scanner, name the class, main method and the scanner
import java.util.Scanner;
public class ArrayMethods {
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    //prompt the user to enter the length of the array and store it it
    System.out.println("Enter the size of the array: ");
    int arrayLength = input.nextInt();
    
    double[] userArray = new double[arrayLength];//assign the length entered by the user to the array
    
    fillArray(userArray);//call the fill array method (assigns random numbers to each slot of the array)
    
    printArray(userArray);//call the print array method (prints the value of each slot of the array with a separation between values)
    
    System.out.println("Largest is " + largest(userArray)); //print the largest method (returns the highest value of the array)
    
    System.out.println("Smallest is " + smallest(userArray));//print the smallest method (returns the lowest value of the array)
    
    System.out.println("Sum is " + sum(userArray));//print the sum method (sums all the values of the array)
    
    System.out.println("Average is " + average(userArray, arrayLength));//print the average array(returns the average of all the values of the array)
    
    System.out.println("Enter the integer to multiply with: ");//prompt the user to enter an integer to multiply it and record it
    int intMultiply = input.nextInt();
    multiplyArray(userArray, intMultiply);//call the method using the array and the integer entered by the user
  }
  //fill array method
  public static void fillArray(double[] array){
    //this loop creates random double values between 0 and 99 (as many as the determined array length) and only records the first two decimal values
    for(int i = 0; i < array.length; i++){
      array[i] = Math.floor(((Math.random()*(100))*100))/100;
    }
  }
  //print array method
  public static void printArray(double [] array) {
    //print the introductory line
    System.out.println("The array elements are: ");
    //this loop prints each of the array values
    for(int i = 0; i < array.length; i++) {
     System.out.print(array[i] +"   "); 
    }
    System.out.println("");
  }
  //multiply array method
  public static void multiplyArray(double [] array, int x){
    //create a new array and copy the main array to it
    double [] multiplicationArray;
    multiplicationArray = array;
    //this loop multiplies each value of the array times the integer entered by the user
    for(int i = 0; i < multiplicationArray.length; i++) {
     double result = (array[i] * x);
     //as before, we only record the first two decimals
     array[i] = Math.floor(result * 100) / 100;
    }
    //print the result
    printArray(multiplicationArray);
  }
  //largest method
  public static double largest(double [] array) {
    //create a max double and assign it to the first value of the array
    double max = array[0];
    //in this loop, if a value is greater than the first, this becomes the max value
    for(int i = 1; i < array.length; i++) {
      if(array[i] > max){
       max = array [i]; 
      }
    }
    //return the result(it is printed in the main method)
    return(max);
  }
  //smallest method
  public static double smallest(double [] array) {
    //create a min double and assign it to the first value of the array
   double min = array[0];
   //in this loop, if a value is smaller than the first, this becomes the min value
   for(int i = 1; i < array.length; i++) {
     if(array[i] < min) {
      min = array[i]; 
     }
   }
   //return the result(it is printed in the main method)
   return(min);
  }
  //sum method
  public static double sum(double [] array) {
    //create a new variable total, with value 0
    double total = 0;
    //add each value of the array and record it in total
    for(int i = 0; i < array.length; i++) {
     total += array[i]; 
    }
    //return the result(it is printed in the main method)(as before, we just record the first two decimals)
    return(Math.floor(total*100)/100);
  }
  //average method
  public static double average(double [] array, int x) {
    //get the sum of the array values from the sum method
    double sumation = sum(array);
    //divide the sum method by the amount of values in the array
    double result = Math.floor((sumation / x)*100)/100;
    //return the result(it is printed in the main method)
    return(result);
  }
}