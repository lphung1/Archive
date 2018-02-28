public class Pile{

  private Card[] pile;
  private int pilePlace; //used to track placment of pile

  /*
  *constructor
  */
  public Pile(){
    //initializes the Card array
    pile = new Card[6];
    for(int i = 0; i < 6; i++){
      pile[i] = new Card(0,0); //loads empty cards.
    }

    pilePlace = 0;

  }
  //adds card to bottom
  public void addCardFaceDown(Card c){
    c.setFaceDown();
    pile[pilePlace] = c;
    pilePlace++;
  }
  //adds card to the bottom.
  public void addCardFaceUp(Card c){
    c.setFaceUp();
    pile[pilePlace] = c;
    pilePlace++;
  }

  /*
  *gets number of facedown cards
  */
  public int getNumFaceDown(){
    int faceDown = 0;
    for(int i = 0; i < pilePlace; i++){
      if(pile[i].getFace() == "Down"){
        faceDown++;
      }
    }
    return faceDown;
  }

  /*
  *gets number of faceup cards
  */
  public int getNumFaceUp(){
    int faceUp = 0;
    for(int i = 0; i < pilePlace; i++){
      if(pile[i].getFace() == "Up"){
        faceUp++;
      }
    }
    return faceUp;
  }

  //removes a card and shifts the array
  public Card removeCard(){
    Card temp = pile[0]; //removes top card. putting placement card to avoid null pointer
    for(int i = 0; i < pilePlace; i++){ //shifts cards
      pile[i] = pile[i+1];
    }
    pilePlace--;
    return temp;

  }
  //returns this pile
  public String toString(){

    for(int i = 0; i < pilePlace; i++){
      if(pile[i].getSuit() != "Null"){
        System.out.print(pile[i] + " ");
      }
    }
    return"" ;
  }



}//end of class
