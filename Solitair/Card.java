public class Card{

  private int suit;
  private int value;
  private boolean faceDown;

  /*
  *Default Constructor "empty card"
  */
  public Card(){
    suit = 0;
    value = 0;
    faceDown = true;
  }

  /*
  *Constructor, creates an a card instance.
  @param int s - suit, takes values 1-4
  @param int v - Value, takes values 1-13
  @return Card 
  other values will return a null card
  */
  public Card(int s, int v){
    suit = s;
    value = v;
    faceDown = true;
  }

  //returns the suit as a string
  public String getSuit(){
    if(suit == 1){
      return "S"; //for spades
    }
    else if(suit == 2){
      return "C"; //for clubs
    }
    else if(suit == 3){
      return "D"; //for diamonds
    }
    else if(suit == 4){
      return "H"; //for hearts
    }
    else return ("Null");
  }
  //returns value as a string
  public String printValue(){
    if(value == 1){
      return "A"; //for aces
    }
    else if(value == 2){
      return "2"; //for 2
    }
    else if(value == 3){
      return "3"; //for 3
    }
    else if(value == 4){
      return "4"; //for 4
    }
    else if(value == 5){
      return "5"; //for 5
    }
    else if(value == 6){
      return "6"; //for 6
    }
    else if(value == 7){
      return "7"; //for 7
    }
    else if(value == 8){
      return "8"; //for 8
    }
    else if(value == 9){
      return "9"; //for 9
    }
    else if(value == 10){
      return "10"; //for 10
    }
    else if(value == 11){
      return "J"; //for jacks
    }
    else if(value == 12){
      return "Q"; //for queen
    }
    else if(value == 13){
      return "K"; //for king
    }
    else
    return "Null";
  }
  //sets this card facedown
  public void setFaceDown(){
    faceDown = true;
  }
  //sets this card faceup
  public void setFaceUp(){
    faceDown = false;
  }
  //returns string weather faceup or down
  public String getFace(){
    if (faceDown == true){
      return ("Down");
    }
    else
    return ("Up");
  }
  //returns the int value for the card
  public int getValue(){
    return this.value;
  }

  //returns the values of this card as a string
  public String toString() {
    return(this.getSuit() + this.printValue());
  }

}
