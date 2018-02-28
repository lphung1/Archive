import java.util.*;
public class ClockSolitaire{

  public static void main(String[] args){
    Deck d1 = new Deck();
    d1.shuffle();
    Pile [] p = new Pile[13];
    Scanner key = new Scanner(System.in);
    int wins = 0;
    int totalGames = 0;
    int finalScore = 13;

    System.out.println("What mode? \n1. Verbose\n2. Default\n3. Silent");
    int mode = key.nextInt();
    int numGames = 1;

    if (mode == 1 || mode == 3){
      System.out.println("How many games do you want to play?");
      numGames = key.nextInt();
    }

    do{

      d1.shuffle();//resets the deck

      for(int i = 0; i < 13; i++){ //(re)initializes piles
        p[i] = new Pile();
      }

      for(int i = 0; i < 13; i++){//re deals the cards
        for(int k = 0; k < 4; k++){
          p[i].addCardFaceDown(d1.dealCard());
        }
      }

      int turn = 1;
      Card temp = p[12].removeCard();//starts the game by taking card from middle
      do{//plays the game untill all of king pile is face up. Will edit other conditions later

        if(mode != 3){
          System.out.println("Turn: " + turn);
        }

        turn++;
        p[temp.getValue()-1].addCardFaceUp(temp);
        temp = p[temp.getValue()-1].removeCard();

        for(int i = 0; i < 13; i++){
          if(mode == 1){//verbose
            System.out.println("\nPile "+ (i+1));
            System.out.println(p[i]);
            System.out.println("Face Down: " + p[i].getNumFaceDown()+ "\n"+ "Face Up: " + p[i].getNumFaceUp());
          }
          else if(mode == 2){//default
            System.out.println(p[i]);
          }

        }

      }while(p[12].getNumFaceDown() != 0);

      for (int k = 0; k < 13; k++){
        if(p[k].getNumFaceUp() == 0){
          finalScore--;
        }
      }

      System.out.println("\n**********************************************\n"); //separates new game

      if(finalScore == 1){
        wins++;
      }
      System.out.println("Final Score: " + finalScore);
      numGames--;
      totalGames++;
      finalScore = 13;
    }while(0 < numGames);

    System.out.println("\n\nResults\nTotalWins: " + wins);
    System.out.println("Total Games: " + totalGames);
    System.out.println("Win/Lose %: " + (wins/totalGames) );

  }

}
