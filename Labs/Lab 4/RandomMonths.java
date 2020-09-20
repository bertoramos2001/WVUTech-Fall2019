/*
 * Alberto Ramos
 * 9/19/2019
 * CS 121 Lab
 * Random Months
 * 
 * This program displays the name of a month, depending on which random integer is generated
 */

public class RandomMonths {
  public static void main (String[] args) {
    int range = (12 - 1) + 1;// calculate the range of our operation, in this case from 1 to 12
    int randomInteger = (int)(Math.random()* range) + 1;//calculate a random integer in this range
    //assign a value of month for each integer that the program can give
    if (randomInteger == 12)
      System.out.print("The month is December");
    else if (randomInteger == 11)
      System.out.print("The month is November");
    else if (randomInteger == 10)
      System.out.print("The month is October");
    else if (randomInteger == 9)
      System.out.print("The month is September");
    else if (randomInteger == 8)
      System.out.print("The month is August");
    else if (randomInteger == 7)
      System.out.print("The month is July");
    else if (randomInteger == 6)
      System.out.print("The month is June");
    else if (randomInteger == 5)
      System.out.print("The month is May");
    else if (randomInteger == 4)
      System.out.print("The month is April");
    else if (randomInteger == 3)
      System.out.print("The month is March");
    else if (randomInteger == 2)
      System.out.print("The month is February");
    else if (randomInteger == 1)
      System.out.print("The month is January");
      
  }
}
  
  