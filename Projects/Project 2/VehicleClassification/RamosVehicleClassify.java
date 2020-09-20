/*
 * Alberto Ramos
 * 9/27/2019
 * CS 121 T01
 * 
 * This program classifies the kind of vehicle depending on the user's prompt
 */

//import the Scanner in order to be able to read user's input
import java.util.Scanner;
//name the class, the main method and the Scanner
public class RamosVehicleClassify {
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    //prompt the user to enter whether there is an engine in the vehicle or not
    System.out.print("Is there an engine in the vehicle?");
    //store user's answer as a character Y or y if the answer is yer or n or N if the answer is no
    char engine = input.next().charAt(0);
    //condition if the user's answer to the first question is yes
    if (engine == 'Y' || engine == 'y'){
      //prompt the user to enter the number of wheels of the vehicle
      System.out.print("What is the number of wheels of the vehicle?");
      //store user's answer
      int numberOfWheels = input.nextInt();
      //condition if the vehicle has two wheels
      if (numberOfWheels == 2){
        System.out.println("The vehicle is a motorcycle");
      }
      //condition if the vehicle has less than two wheels
      else if (numberOfWheels < 2){
        System.out.print("The information you entered does not match any vehicle");
      }
      //condition if the vehicle has more than two wheels
      else if (numberOfWheels > 2){
        //prompt the user to enter the number of passengers the vahicle can seat
        System.out.print("How many passengers can it seat?");
        //store user's answer
        int numberOfPassengers = input.nextInt();
        //condition if the number of passengers is less or equal to 5
        if (numberOfPassengers <= 5){
          System.out.print("The vehicle is a car");
        }
        //condition if the number of passengers is greater than 5 and it is less or equal to 9
        else if (numberOfPassengers > 5 && numberOfPassengers <= 9){
          System.out.print("The vehicle is a van");
        }
        //condition if the number of passengers is greater than 9
        else if (numberOfPassengers > 9){
          System.out.print("The vehicle is a bus");
        }
      }
    }
    //condition if the user's answer to the first question is no
    else if (engine == 'N' || engine == 'n'){
      //prompt the user to enter the number of wheels of the vehicle
      System.out.print("What is the number of wheels of the vehicle?");
      //store user's input
      int numberOfWheels1 = input.nextInt();
      //condition if the number of wheels is equal to 2
      if (numberOfWheels1 == 2){
        System.out.print("The vehicle is a bycicle");
      }
      //condition if the number of wheels is equal to 1
      else if (numberOfWheels1 == 1){
        System.out.print("The vehicle is a monocycle");
      }
      //condition if the user's input is not 1 or 2, so it is invalid
      else{
        System.out.println("The information you entered does not match any vehicle");
      }
    }
      
  }
}