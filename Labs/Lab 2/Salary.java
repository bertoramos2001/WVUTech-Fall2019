public class Salary {
  public static void main (String [] args) {
    double rate, hoursWorked, wages;
    String name;
    rate = 12.5;
    hoursWorked = 45.5;
    name = "Jenkins";
    wages = rate * hoursWorked;
    System.out.println("Name: " + name);
    System.out.println("Pay Rate: $" + rate);
    System.out.println("Hours Worked: " + hoursWorked);
    System.out.println("Salary: $" + wages);
  }
}