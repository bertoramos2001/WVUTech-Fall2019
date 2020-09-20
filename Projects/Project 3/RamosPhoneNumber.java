/*
 * Alberto Ramos
 * 10/30/2019
 * CS 121 T01
 * Ramos Phone
 * 
 * This program prompts the user to enter a phone number expressed in letters and outputs the corresponding phone number in digits
 */
//import the scanner
import java.util.Scanner;
//name the class, main method and scanner
public class RamosPhoneNumber {
  public static void main (String [] args) {
   Scanner input = new Scanner(System.in);
   //prompt the user to answer whether he wants to enter a number or not
   System.out.print("Do you want to enter a number (Y/N): ");
   String answerWord = input.nextLine();
   char answerDigit = answerWord.charAt(0);
   //set integers a and b to 0 in order to make the while loops work
   int a = 0;
   int b = 0;
   //if the answer to the first question is not yes, set b to 1 so that the program does not enter any of the loops
   if(answerDigit != 'Y'){
     if(answerDigit != 'y'){
        b=1;
      }
     //if the answer to the first question is yes, enter the first loop
   while(b == 0){
   //enter the second loop
      while(a == 0){
        //check if the first answer was a 'yes'
   if((answerDigit == 'Y') || (answerDigit == 'y')){
     //prompt the user to enter a number expressed in letters
      System.out.print("Enter a number expressed in letters: ");
      String phoneLetters = input.nextLine();
      //if the length of the number in letters is not 7, exit the first loop
      if(phoneLetters.length() != 7){
        System.out.print("Invalid length.");
        break;
      }
      //print the phrase before printing the phone number
      System.out.print("Phone number is ");
      //set i to 0 in order to make the nested loop work
      int i = 0;
      //make this loop work until it gets to the 7th character
      while( i < 7){
        //print a '-' after the third number
        if(i == 3)
          System.out.print("-");
        //set each character to a value of i; starting from 0 and ending in 6
       char letter = phoneLetters.charAt(i);
       i++;
       //compute the value of each letter
       if((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')){
         switch(letter){
           case 'A':
           case 'a':
           case 'B':
           case 'b':
           case 'C':
           case 'c':System.out.print("2");break;
           case 'D':
           case 'd':
           case 'E':
           case 'e':
           case 'F':
           case 'f':System.out.print("3");break;
           case 'G':
           case 'g':
           case 'H':
           case 'h':
           case 'I':
           case 'i': System.out.print("4");break;
           case 'J':
           case 'j':
           case 'K':
           case 'k':
           case 'L':
           case 'l':System.out.print("5");break;
           case 'M':
           case 'm':
           case 'N':
           case 'n':
           case 'O':
           case 'o': System.out.print("6");break;
           case 'P':
           case 'p':
           case 'Q':
           case 'q':
           case 'R':
           case 'r':
           case 'S':
           case 's':System.out.print("7");break;
           case 'T':
           case 't':
           case 'U':
           case 'u':
           case 'V':
           case 'v': System.out.print("8");break;
           case 'W':
           case 'w':
           case 'X':
           case 'x':
           case 'Y':
           case 'y':
           case 'Z':
           case 'z':System.out.print("9");break; 
         }
       }
       //if the character does not match with any of the previous letters, print it anyways
       else if(true != ((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')))
        System.out.print(letter);
       }
      }
   //after exiting the first nested loop, ask the user if he wants to enter another number
         System.out.println("  ");
          System.out.print("Do you want to enter a number (Y/N): ");
        String answerWord2 = input.nextLine();
        char answerDigit2 = answerWord2.charAt(0);
        //if user's response is yes, set a to 0 so the first nested loop can run again, if it is not yes; set it to 1 so it exits the first nested loop
        if((answerDigit2 == 'Y') || (answerDigit2 == 'y'))
          a = 0;
        else
          a = 1;
   }
      //if the string's length is not adequate, prompt the user again to enter another number
      if(a == 0){
       
       System.out.println("  ");
          System.out.print("Do you want to enter a number (Y/N): ");
        String answerWord2 = input.nextLine();
        char answerDigit2 = answerWord2.charAt(0);
        if((answerDigit2 == 'Y') || (answerDigit2 == 'y'))
          //if the user says yes, all the loops will be run
          b = 0;
        //if the user says no, all the loops will be exited
        else
          b = 1;
      }
     
   }
   //terminate the method
   return;
  }
   //terminate the method
    return;
}
}