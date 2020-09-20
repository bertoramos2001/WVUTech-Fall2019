/*
 * Alberto Ramos
 * 10/31/2019
 * CS 121 Lab
 * Population
 * 
 * This program prompts the user to enter the population of two towns and its rate of growth and calculates both the 
 * amount of years that will take to the population of A to be greater than the population of B and the populations of both towns at that time
 */
//import the scanner
import java.util.Scanner;
//name the class, main method and scanner
public class Population {
  public static void main(String [] args) {
   Scanner input = new Scanner(System.in);
   //prompt the user to enter the population and the rates of change of the 2 cities
   System.out.print("Enter the current population of town A: ");
   double popA = input.nextDouble();
   System.out.print("Enter the current population of town B: ");
   double popB = input.nextDouble();
   
   System.out.print("Enter the growth rate of town A: ");
   double growthA = input.nextDouble();
   System.out.print("Enter the growth rate of town B: ");
   double growthB = input.nextDouble();
   //set the initial years to 0 in order to let the loop work
   int years = 0;
   //initiate the loop while the population of the city A is less than the population of city B
   while(popA < popB){
     //do the calculation for the population of A after each year
    popA = ((popA) + (popA * (growthA/100)));
    //set the variable of population A into an integer, since the number of people must be an integer
    popA = (int)popA;
    //do the calculation for the population of B after each year
    popB = ((popB) + (popB * (growthB/100)));
    //set the variable of population B into an integer, since the number of people must be an integer
    popB = (int)popB;
    //count one more year after eachh iteration
    years++;
    }
   //print all the data calculated in the loop as asked in the heading
   System.out.println("After " + years + " years(s) the population of town A will be greater than or equal to the population of town B");
   System.out.println("After " + years + " years(s), population of town A is: " + (int)popA);
   System.out.println("After " + years + " years(s), population of town B is: " + (int)popB); 
   }
  
                
  }
