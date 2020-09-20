/*
 * Alberto Ramos
 * 10/17/2019
 * CS 1221 Lab
 * Compare Costs
 * 
 * This program compares the cost per pound of the same product in different stores in order to find the most profitable one
 */

//import the Scanner
import java.util.Scanner;
//name class, main method and Scanner
public class CompareCosts{
  public static void main (String [] args){
    Scanner input = new Scanner (System.in);
    //prompt the user for weight and price of the product of the first shop
    System.out.print("Enter weight (lb) and price ($) for shop 1: ");
    float weight1 = input.nextFloat();
    float price1 = input.nextFloat();
    //prompt the user for weight and price of the product of the second shop
    System.out.print("Enter weight (lb) and price ($) for shop 2: ");
    float weight2 = input.nextFloat();
    float price2 = input.nextFloat();
    //prompt the user for weight and price of the product of the third shop
    System.out.print("Enter weight (lb) and price ($) for shop 3: ");
    float weight3 = input.nextFloat();
    float price3 = input.nextFloat();
    //calculate the relation between weight and price of the three shops
    float offer1 = (price1 / weight1);
    float offer2 = (price2 / weight2);
    float offer3 = (price3 / weight3);
    //print what will happen if either of the three shops has a higher price than the rest
    if((offer1 > offer2) && (offer1 > offer3)){
      System.out.println("Shop 1 has highest price");
    }
    if((offer2 > offer1) && (offer2 > offer3)){
       System.out.println("Shop 2 has highest price");
    }
     if((offer3 > offer1) && (offer3 > offer2)){
       System.out.println("Shop 3 has highest price");
    } 
     //print what will happen if tho shops both have a higher price that the other one
     if((offer1 == offer2) && (offer1 > offer3)){
        System.out.println("Shop 1 and shop 2 both have highest price");
     }
      if((offer1 == offer3) && (offer1 > offer2)){
        System.out.println("Shop 1 and shop 3 both have highest price");
      }
      if((offer2 == offer3) && (offer2 > offer1)){
        System.out.println("Shop 2 and shop 3 both have highest price");
      }
      //print what will happen if all the shops have the same prices  
      if((offer1 == offer2) && (offer2 == offer3)){
        System.out.println("All shops have the same price");   
      }
  }
}