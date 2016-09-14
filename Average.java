import java.util.*;

public class Average{

  public static void main(String[] args){
    //Get user input
   Scanner input = new Scanner(System.in);

    //prompt user for input
    System.out.println("Enter three numbers:");

    double num1 = input.nextDouble();
    double num2 = input.nextDouble();
    double num3 = input.nextDouble();

    double average = (num1 + num2 + num3) / 3;

    System.out.println("The average is: " + average);
 
  }
}