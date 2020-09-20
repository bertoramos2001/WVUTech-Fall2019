/*
 * Alberto Ramos
 * 11/7/2019
 * CS 121 Lab
 * Vowel counting
 * 
 * This program prompts the user to input a String and outputs the number of vowels. 
 */
//import the scanner
import java.util.Scanner;
//name the class and main method
public class Vowel {
  public static void main (String [] args) {
    //create a variable for the user input and a scanner
    String inputLine;
    Scanner console = new Scanner(System.in);
    //set the vowel count to 0
    int count = 0;
    //prompt the user to enter a string and read it
    System.out.print("Enter a String: "); 
    inputLine = console.nextLine();
    System.out.println();
    //create a loop that reads one character each time from the first to the last one
    for (int i = 0; i < inputLine.length(); i++) {
      //invoke the method to find the vowels and, for each vowel found, increment the vowel count by 1
      if (isVowel(inputLine.charAt(i)))
        count++;
    }
    System.out.println();
    //print the number of total vowels depending on our previous count
    System.out.println("There are " + count + " vowel in the input line");
  
  }
  //check if each chart is a vowel (lower case or upper case)
  public static boolean isVowel(char a) {
    
    switch(a){
      case 'a':
      case 'A':
      case 'e':
      case 'E':
      case 'i':
      case 'I':
      case 'o':
      case 'O':
      case 'U':
      case 'u': return true;
    
    }
    //if the character is not a vowel, we return true
    return false;
  }
}