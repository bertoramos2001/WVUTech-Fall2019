/*
 * Alberto Ramos
 * 11/10/2019
 * CS 121
 * ATM program
 * 
 * This program displays an ATM menu and different outputs depending on the user's decisions
 */
//import the scanner, name the class, important variables, scanner and main method
import java.util.Scanner;
public class RamosBaknkAccount {
  static double currentBalance = 0;
  static double depositAmount = 0;
  static double withdrawAmount = 0;
  static String currentPassword = "default";
  static Scanner input = new Scanner(System.in);
  public static void main (String [] args) {
    
    //print the first line of main menu
    System.out.println("Welcome to the bank of CS121");
    while(true){//this loop is executed forever until it is exited by a break statement (when the user selects exit)
      //print the rest of the main menu
      System.out.println("Enter one of the options (1-5):");
      System.out.println("  1.Show Balance");
      System.out.println("  2.Deposit");
      System.out.println("  3.Withdraw");
      System.out.println("  4.Update password");
      System.out.println("  5.Exit");
      int userOption = input.nextInt();//record the user selection(this value will initialize each method)
          
          if (userOption == 1){//if the user selected option 1, call the method that shows the balance of the account
            showBalance(currentBalance);
          }
          
          else if(userOption == 2) {//if the user selected option 2, execute some computation before calling the deposit method
            //prompt the user to enter a positive amount of money and record it
            System.out.println("Enter amount (>0) you want to deposit: $");
            depositAmount = input.nextDouble();
            //create a loop that runs every time that the value entered by the user is negative, prompting the user to enter a new positive value
            while(depositAmount < 0){
              System.out.println("Please enter a positive amount to deposit");
              System.out.println("Enter amount (>0) you want to deposit $");
                depositAmount = input.nextDouble();
            }
            //once we have a positive amount to deposit, call the deposit method and update the balance with its output
            currentBalance = deposit(depositAmount, currentBalance);
          }
          
          else if(userOption == 3) {//if the user selected option 3, execute some computation before calling the withdraw method
            //prompt the user to enter a positive amount of money to withdraw from their account
            System.out.println("Enter amount (>0) you want to withdraw:  $");
            withdrawAmount = input.nextDouble();
            //create a loop that runs every time that the value entered by the user is negative, prompting the user to enter a new positive value
            while(withdrawAmount < 0) {
              System.out.println("Please enter a positive amount to withdraw");
              System.out.println("Enter amount (>0) you want to withdraw: $");
              withdrawAmount = input.nextDouble();
              //create a nested loop that runs every time that the value entered by the user is greater than their current balance, prompting them to enter a new smaller value
              while(withdrawAmount > currentBalance) {
               System.out.println("Please enter a smaller amount than your current balance to withdraw");
               System.out.println("Enter amount (>0) you want to withdraw: $");
               withdrawAmount = input.nextDouble();
              }
            }
            //execute the previously discussed computations in alternate order to check again the input if it is entered in a different order
               while(withdrawAmount > currentBalance) {
               System.out.println("Please enter a smaller amount than your current balance to withdraw");
               System.out.println("Enter amount (>0) you want to withdraw: $");
               withdrawAmount = input.nextDouble();
              while(withdrawAmount < 0) {
               System.out.println("Please enter a positive amount to withdraw");
              System.out.println("Enter amount (>0) you want to withdraw: $");
              withdrawAmount = input.nextDouble();
            }
               }
               //once we have an adequate withdraw amount, call the withdraw method and update the balance with its output
           currentBalance = withdraw(currentBalance, withdrawAmount);
          }
          else if(userOption == 4) {//if the user selected option 4, execute some computation and call the update password method
            //prompt the user to enter the current password and read it
            System.out.println("Enter the current password: ");
            String enteredPassword = input.next();
            //check if the password entered by the reader corresponds to the current password of the account, if not, prompt the user to try again later
            if((enteredPassword.compareTo(currentPassword))!= 0){
              System.out.println("Invalid password, try again later.");
            }
            //check if the password entered by the reader corresponds to the current password of the account, if so, call the update password method and update the password with its output
            else if((enteredPassword.compareTo(currentPassword))== 0){
              String newPassword = "";
              currentPassword = updatePassword(newPassword);
            } 
          }
          else if(userOption == 5) {//if the user selected option 5, call the exit method and exit the while loop (get to the end of the program)
           exit(); 
           break;
          }
          else {//if the user does not enter a correct input first time, promt them to enter an integer from 1 to 5
           System.out.println("That is an invalid option, please enter an integer from 1 to 5"); 
          }
    }
      
  }
  public static void showBalance(double x){//this method shows the balance of the account
  System.out.printf("Your current balance is: %,.2f$\n ",x);
  }
  public static double deposit(double x, double y) {//initializing the deposit method
    
    double newBalance = x + y;//add the deposit amount to the cuurent balance
        System.out.printf("Your current balance is $%.2f\n",  newBalance);//print the new balance
        return newBalance;//return the value of new balance to store it as the current balance in the main method
  }
  public static double withdraw(double x, double y) {//initializing the withdraw method
    double newBalance = x - y;//substract the withdraw amount from the current balance
        System.out.printf("Your current balance is $%.2f\n",  newBalance);
        return newBalance;
  }
  public static String updatePassword(String x) {//initializing the update password method
  while(true){//creating a loop that only stops when the break statement is made
    System.out.println("Enter new password: ");//prompt the user to enter a new password and read it
    x = input.next();
    
    if((x.length()) < 8) {//if the length of the entered password is less than 8 characters, print a message that this password is invalid
      System.out.println("Password must be at least 8 characters long");
      continue;
    }
    else if((x.matches("[a-zA-Z0-9]*")) == false){//if the entered password does not have only letters and digits, print a message that this password is invalid
      System.out.println("Password must contain at least 2 digits and only contain digits and characters");
      continue;
    }
    else if((digitsInString(x)) < 2) {//call a method to calculate the number of digits in the password, if it is less than 2, print a message that this password is invalid
      System.out.println("Password must contain at least 2 digits and only contain digits and characters");
      continue;
    }
    else {//once we have proved that the password does not have any issues, print its new value and return it so it is stored as the surrent password
        System.out.println("Password changed to: " + x);
    return x;
    }
  }
}
  public static void exit() {//initializing the exit method and printing a good bye message
    System.out.println("Good Bye! Please come again!");
  }
  public static int digitsInString(String x){//initializing the method that counts the number of digits in the password
   int i = 0;//set int i to 0
   int digitCount = 0;//set the digit count to 0
   while(i < x.length()) {//this loop will run once for every character in the password
     char a = x.charAt(i);//each time, it will read one character until it gets to the end of the password
     if((Character.isDigit(a)) == true){//if the read character is a digit, update the digit count and add one to it
       digitCount++;
     }
     i++;//after each iteration add one number to i so it reads the next character
     }
     return digitCount;//once the loop is finished, return the number of digits in the password
   }
  }