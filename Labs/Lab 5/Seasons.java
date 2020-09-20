/*
 * Alberto Ramos
 * 9/26/2019
 * CS 121 Lab
 * Seasons
 * 
 * This program prompts the user to enter a moth and then prints out the season
 */
  //import the Scanner
  import java.util.Scanner;
  //name the class, main method and Scanner
  public class Seasons {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      //prompt the user to enter a month
      System.out.print("Please enter the Month in numbers");
      int month = input.nextInt();
      //enter in the switch statement all the possible inputs and relate them to a proper output. 
      switch(month) {
        case 12 : System.out.println("Season is Winter");
          break;
        case 1 :  System.out.println("Season is Winter");
          break;
        case 2 :  System.out.println("Season is Winter");
          break;
        case 3 : System.out.println("Season is Spring");
          break;
        case 4 : System.out.println("Season is Spring");
          break;
        case 5 : System.out.println("Season is Spring");
          break;
        case 6 : System.out.println("Season is Summer");
          break;
        case 7 : System.out.println("Season is Summer");
          break;
        case 8 : System.out.println("Season is Summer");
          break;
        case 9 : System.out.println("Season is Fall");
          break;
        case 10 : System.out.println("Season is Fall");
          break;
        case 11 : System.out.println("Season is Fall");
          break;
          //group all other possible inputs as invalid months
        default : System.out.println("Invalid Month");
          
      }
    }
  }