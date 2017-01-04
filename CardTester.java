//this class is to test the Card object
public class CardTester{
  
  //main method for testing
  public static void main(String[] args){
    
    //reating a Card object
    Card c = new Card();
    
    c.setColor("black");
    //set suit
    //set rank
    
    //this first card in hand
    System.out.println(c.toString());
    
    //second card in hand
    Card c2 = new Card();
    
    c.setColor("red");
    //set suit
    //set rank
   
    System.out.println(c2.toString());
    
  }
  
}//end of class