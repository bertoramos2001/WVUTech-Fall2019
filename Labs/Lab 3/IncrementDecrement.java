/*
 * Alberto Ramos
 * 9/12/2019
 * CS 121 Lab
 * Vehicle Mileage
 * This program computes the number of miles an automobile can be driven without refueling it
 */

public class IncrementDecrement {
  public static void main(String [] args) {
    int i = 5;
    
    int j = i++;
    int k = ++i;
    int l = i--;
    int m = --i;
    int n = ++i * i--;
    int o = i++ + --i;
    
    System.out.print("j=" +j+ " k=" +k+ " l=" +l+ " m=" +m+ " n=" +n+ " o=" +o);
    
  }
}