/* Alberto Ramos
 * 12/5/2019
 * CS 121 Lab
 * Simple sort
 * 
 * This program sorts the given numbers in the array in ascending order
 */
//import all the util.java library; name the class and the method
import java.util.*;
public class SimpleSort{
  public static void main(String []args){
    int []myArr = randArray(5);//create array of given elements
    System.out.println(Arrays.toString(myArr));//print the arrays
    sortArrays(myArr);//sort the arrays
    System.out.println(Arrays.toString(myArr));//print the sorted arrays
  }


public static void sortArrays(int []arr){//sort method is executed when called
  //create temp and i variables
  int temp = 0;
  int i;
  for(i=1;i<arr.length;i++){//this for loop moves each item in the array to the right
    if(arr[i] < arr[i-1]){
      //swap the item with the next one if necessary
     temp = arr[i];
     arr[i] = arr[i-1];
     arr[i-1] = temp;
     
     for(i=i;i>0;i-=1){//once the item has been moved to the right, this loop compares the sorted item with all the previous ones, moving it to the left as much as needed
     if(arr[i] < arr[i-1]){
       //swap the item with the previous if necessary
     temp = arr[i];
     arr[i] = arr[i-1];
     arr[i-1] = temp;
     }
     }
  }
}
}
//method to return random integer arrays between 0 and 100 (exclusive)
public static int[] randArray(int size) {
 int [] arr = new int[ size];
 for(int i=0;i<size;i++)
  arr[i]=(int) (Math.random()*100);
 return arr;
}


}