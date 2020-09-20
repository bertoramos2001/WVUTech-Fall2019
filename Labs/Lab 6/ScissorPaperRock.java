/*
 * Alberto Ramos
 * 10/17/2019
 * CS 1221 Lab
 * Scissor, paper, rock
 * 
 * This program randomly generates a number 0, 1 or 2 representing scissor, rock and paper and prompts the user to do the same in order to play the game
 */

//import the Scanner
import java.util.Scanner;
//name the class, main method and Scanner
public class ScissorPaperRock{
  public static void main (String [] args){
    Scanner input = new Scanner (System.in);
    //prompt the user to choose rock, paper or scissor, using integers
    System.out.print("Enter your choice: scissor (0), rock (1), paper (2): ");
    int playerChoice = input.nextInt();
    //print invalid choice if the user introduces a not valid integer
    if((playerChoice) < 0 || (playerChoice > 2)){
      System.out.println("Invalid choice");
    }
    else{
      //compute a random integer between 0 and 2
    int computerChoice = (int)(Math.random()* 3);
    //compute the results of each case if the user chooses scissor
    if((playerChoice == 0) && (computerChoice == 0))
      System.out.println("The computer is scissor. You are scissor too. It is a draw");
    if((playerChoice == 0) && (computerChoice == 1))
      System.out.println("The computer is rock. You are scissor. You lost");
    if((playerChoice == 0) && (computerChoice == 2))
      System.out.println("The computer is paper. You are scissor. You won");
    //compute the results of each case if the user chooses rock
     if((playerChoice == 1) && (computerChoice == 0))
      System.out.println("The computer is scissor. You are rock. You won");
     if((playerChoice == 1) && (computerChoice == 1))
      System.out.println("The computer is rock. You are rock too. It is a draw");
     if((playerChoice == 1) && (computerChoice == 2))
      System.out.println("The computer is paper. You are rock. You lost");
     //compute the results of each case if the user chooses paper
     if((playerChoice == 2) && (computerChoice == 0))
      System.out.println("The computer is scissor. You are paper. You lost");
     if((playerChoice == 2) && (computerChoice == 1))
      System.out.println("The computer is rock. You are paper. You won");
     if((playerChoice == 2) && (computerChoice == 2))
      System.out.println("The computer is paper. You are paper too. It is a draw");
      
      
    }
  }
}