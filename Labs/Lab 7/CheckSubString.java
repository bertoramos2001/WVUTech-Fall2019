/*
 * Alberto Ramos
 * 10/24/2019
 * CS 121 Lab
 * Check substring
 * 
 * This program prompts the user to enter two strings, and reports whether one of the string is the substring of another
 */
//import the Scanner
  import java.util.Scanner;
  //name the class, main method and Scanner
  public class CheckSubString{
    public static void main (String [] args){
      Scanner input = new Scanner (System.in);
        //prompt the user to input two strings and accept the inputs
        System.out.print("Enter string 1: ");
        String string1 = input.nextLine();
        System.out.print("Enter string 2: ");
        String string2 = input.nextLine();
        //turn the user strings to lower case
        String s2 = string2.toLowerCase();
        String s1 = string1.toLowerCase();
        //compare the strings and find substrings, indicate if there is no substring
        if (s2.contains(s1)){
         System.out.println(string1 + " is a substring of " + string2);
        }
        else if (s1.contains(s2)){
          System.out.println(string2 + " is a substring of " + string1);
        }
         else {
           System.out.println("There is no substring of each other");        
                 }    
    }
  }