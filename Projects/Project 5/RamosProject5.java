//import the java library; name the class, the main method and the scanner
import java.util.*;
public class RamosProject5 {
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    int elementsArray = 0;//set the variable of numbers in the array to 0 in order to let the while loop work
    //this loop runs infinitely until the user enters an integer greater than 0
    while(elementsArray <= 0){
      System.out.println("How many elements do you want to enter: ");
      elementsArray = input.nextInt();
    }
    int [] mainArray = new int[elementsArray];//declare and initialize a new array of type int
    System.out.println("Enter " + elementsArray + " elements, separated by a space");//prompt the user to enter integers to fill the elements of the main array
    readNumbers(mainArray);//call the method to read the numbers that the user is entering
    printNumbers(mainArray);//call the method to print the numbers that the user has entered
    System.out.println("The number of elements greater than the average in the given array is " + analyzeNumbers(mainArray) + ".");//call the method to calculate the amount of values over the average
    System.out.println("Checking if the elements are greater than half of the maximum value or not: ");
    compareMax(mainArray);//call the method to compare and print whether if each value is greater than the half of the greatest value or not
    System.out.println("Moving element to right: ");
    moveValuesRight(mainArray);//call method that shifts every element to the right and prints the resulting array(the last element is moved to the first place)
    System.out.println("The array with distinct elements is ");
    selectDistinct(mainArray);//call the method that selects each element and prints the value only once
  }
  
    public static void readNumbers(int[] arr){
      Scanner input = new Scanner(System.in);//create a scanner
      int i;//initialize i
      for(i=0; i < arr.length; i++){//this loop runs as many times as elements the user wants to input. It reads every value that the user enters
       arr[i] =  input.nextInt();
      }
    }
    
    public static void printNumbers(int [] arr){
      System.out.println("The given array is: ");
      System.out.print("{");//print the opening bracket indicating the beginning of the array
      for(int i = 0;i < arr.length; i++){//this loop runs as many times as the length of the main array
        if(i != (arr.length - 1)){
        System.out.print(arr[i] + ", ");//print each value and a comma afterwards if the value is not the lat element to print
        }
        else{
          System.out.print(arr[i]);//print only the value if it is the last element to print
        }
      }
      System.out.println("}");//print the closing bracket indicating the end of the array
    }
    
    public static int analyzeNumbers(int[] arr){
     int i;//initialize i
     int temp = 0; //initialize temp and set it to 0
     for(i = 0; i< arr.length; i++) {//this loop runs as many times as the length of the main array
       temp = arr[i] + temp;//add each element of the array and assign its value to temp
     }
     int average = (temp / arr.length);//calculate the average value of all the elements in the array by dividing the sum by the amount of elements
     int count = 0;
     int j;
     for(j=0; j<arr.length;j++){//this loop runs as many times as the length of the main array
       if(arr[j] > average){//for each number greater than the average, add one to the count
        count = count + 1; 
       }
     }
     return count;//return the count(amount of elements greater than the average)
    }
    public static boolean[] compareMax(int[] arr) {
     boolean[] retArr = new boolean[arr.length]; //create a boolean array to store the true/false values
     int max = arr[0];//set the max to the index 0 of the array
     for(int i=1;i<arr.length;i++){//this loop runs as many times as the length of the main array
       if(arr[i]>max) max = arr[i];//compare each index with the max and if it is greater, swap them
     }
     int halfMax = (max/2);//divide the maximum element by 2 and get the half of it
     System.out.print("{");//print the opening bracket indicating the beginning of the array
     for(int j=0;j<arr.length;j++){//this loop runs as many times as the length of the main array
       if(arr[j] > halfMax){//compare each value with the half of the max; if it is greater, set the value of that element to true
         retArr[j] = true;
         if(j!=(arr.length-1)){
       System.out.print("true, ");//print a comma after the value if it is not the last value to print
         }
         else{
          System.out.print("true");//print only the value if it is the last element to print
         }
                            }
       else{
        retArr[j] = false; //compare each value with the half of the max; if it is not greater, set the value of that element to false
        if(j!=(arr.length-1)){
        System.out.print("false, ");//print a comma after the value if it is not the last value to print
        }
        else{
         System.out.print("false"); //print only the value if it is the last element to print
        }
       }
     }
     System.out.println("}");//print the closing bracket indicating the end of the array
     return retArr;//return the boolean array
    }
    
    public static void moveValuesRight(int [] arr){
      int temp = arr[arr.length-1];//initialize a temp integer as the last element in the array
      for(int i=arr.length-1;i>0;i--) {//this loop runs as many times as the length of the main array but backwards
       arr[i] = arr[i-1]; //assign to each value element the value of the one in their right
      }
      arr[0]=temp;//assign the temp value to the slot at index 0
      System.out.print("{");//print the opening bracket indicating the beginning of the array
      for(int i=0;i<arr.length;i++){//this loop runs as many times as the length of the main array
        if(i!=(arr.length-1)){
       System.out.print(arr[i] + ", "); //print a comma after the value if it is not the last value to print
        }
        else{
          System.out.println(arr[i] + "}");//print the value and a closing curly bracket if it is the last element to print
        }
      }
    }
    
    public static int[] selectDistinct(int [] arr){
      int [] distinctArr = new int[arr.length];//create a new int array
      System.out.print("{");//print the opening bracket indicating the beginning of the array
      for(int i=0;i<arr.length;i++){//this loop runs as many times as the length of the main array
        int j;
        for(j=0;j<arr.length;j++)//this loop runs as many times as the length of the main array
          if(arr[i] == arr[j])//if the element at i and the element at j are the same, exit the loop
            break;
        if(i==j){//if i and j are the same number
          if(i!=(arr.length-1)){
            System.out.print(arr[i] + ", ");//print a comma after the value if it is not the last value to print
          }
             else{
               System.out.println(arr[i] + "}");//print the value and a closing curly bracket if it is the last element to print
             }
        }
        }
      return distinctArr;//return the int array
      }
}
