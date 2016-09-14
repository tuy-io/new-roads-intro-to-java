import java.util.Scanner;

public class TestStudent{

  public static void main(String[] args){
  
      //set up for user input
      Scanner input = new Scanner(System.in);
      
      //prompt the user for input
      System.out.println("Enter your name: ");
    
      //get user input
      String name = input.next();
    
      System.out.println("Your name is " + name);
    
      //prompt user for graduation year
      System.out.println("What year do you graduate?");
      
      //get user input of year
      int graduationYear = input.nextInt();
      
      System.out.println("Year of graduation: " + graduationYear);
    
      String classes = "";
    
      if(graduationYear == 17)
      {
        classes = "Senior";
      }
      else if(graduationYear == 18)
      {
        classes = "Junior"; 
      } 
      else if(graduationYear == 19)
      {
        classes = "Sophomore";
      }
      else
      {
        classes = "Freshmen";
      }
    
      System.out.println("You are a " + classes);
  
  }//end of main
  
} //end of class