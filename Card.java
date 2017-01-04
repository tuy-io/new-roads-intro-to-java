public class Card{
  
  //declare the properties
  private String color;
  private String suit;
  private char rank;
  
  //constructor - method to make this object
  public Card(){
    color = "red";
    suit = "diamond";
    rank = 'A';
  }
  
  //the following are mutators
  public String getColor(){
    return color;
  }
  
  public void setColor(String newColor){
    color = newColor;
  }
  
  //this prints out the object
  public String toString(){
    return color + " " + suit + " " + rank;
  }
  
}//end of the class