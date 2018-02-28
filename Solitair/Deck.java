import java.util.*;

public class Deck{

  private Card[] deck; //generates array of Card objects
  private int cardNum; //used for card placement

  /*
  *Constructor
  */
  public Deck() {
    deck = new Card[52];
    int cardNum = 0; //placement to generate cards
    for (int i = 1; i < 5; i++){ //initializes deck and Card array with all the cards.
      for (int k = 1; k < 14; k++){
        deck[cardNum] = new Card(i,k);
        cardNum++;
      }
    }
    cardNum = 0; //resets the placement to 0
  }
  //shuffles the deck
  public void shuffle() {
    Random rand = new Random();
    for (int i = 0; i < 52; i++ ) {
      int r = rand.nextInt(51);
      Card temp = deck[i];
      deck[i] = deck[r]; //takes current card position and replaces it with random place.
      deck[r] = temp; //swap the positions of the two positions
    }
    cardNum = 0;//resets deck
  }
  //deals a card, once you've dealt all the cards dont try to deal again, you'll get null pointer
  public Card dealCard(){
    int temp = cardNum;
    cardNum++;
    return deck[temp];
  }
  //returns how many cards have been dealt
  public int cardsDealt(){
    return (cardNum);
  }
  //returns how many cards are left and havent been dealt
  public int cardsLeft(){
    return (cardNum - 52);
  }

  //tostring to print the whole deck
  public String toString(){

    for(int i = 0; i < 52; i++){
      System.out.println(deck[i]);
    }
    return "";
  }


}//end of class
