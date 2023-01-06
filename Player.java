package week06Assignment;

//import java.util.ArrayList;

//import java.util.ArrayList;

public class Player{

	String namePlayerOne; 
	String namePlayerTwo;
static int p1Score = 0;
static int p2Score = 0; 

static Card playerOneTopCard = Deck.cardsDeckOne.get(0);
static Card playerTwoTopCard = Deck.cardsDeckTwo.get(0);
//flip(Card playerOneTopCard, playerTwoTopCard); 
	//static Card playerOneTopCard = flip(); 
  
	

	

	
	static String determineWinner(Card playerOneTopCard, Card playerTwoTopCard, int comparable) {
		if(comparable == -1) {
			p2Score++; 
			return "The Winner is: playerTwo";
		}if(comparable == 1) {
			p1Score++; 
			return "The Winner is: playerOne";
		}else {
			return "DRAW";
		}
	}



	





	private static void flip(Card[] deck1, Card[] deck2) {
		Card[] deck = new Card[52]; 
		Card playerOneTopCard = deck1[0];
		Card playerTwoTopCard = deck2[0];
		
		removeTop(deck1); 
		removeTop(deck2); 
		
	}

	private static void removeTop(Card[] deck) {
		for(int i = 0; i < deck.length; i++) {
			deck[i] = deck[i + 1]; 
		}
	}







	public static String score(int p1, int p2) {
	if (p1 > p2) {
		return "The WINNER is playerOne with " + p1Score + " points! " + "\nplayerTwo is LOSER! With " + p2Score + " points!"; 
		
	} if(p1 < p2) {
		return "The WINNER is playerTwo with " + p2Score + " points! " + "\nplayerOne is LOSER! With " + p1Score + " points!";
	}else {
		return "draw....thats so boring..."; 
		}
	}



	
}
