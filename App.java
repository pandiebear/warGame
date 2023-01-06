package week06Assignment;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Scanner;

public class App {
	
	static Scanner sc = new Scanner(System.in); 
	static ArrayList <Card> playerOneDeck = new ArrayList<>(); 
	static ArrayList <Card> playerTwoDeck = new ArrayList<>(); 

	public static void main(String[] args) {
		System.out.println("Hey, let's play some war\nplayerOne, type your name: ");
	String namePlayerOne = sc.nextLine();
	playerOneDeck = Deck.createStackOne(); 
	
System.out.println(playerOneDeck);
		System.out.println("playerTwo, your name: ");
		String namePlayerTwo = sc.nextLine(); 
	playerTwoDeck = Deck.createStackTwo(); 
System.out.println(playerTwoDeck);
		
	System.out.println("Let's Play");
	System.out.println(namePlayerOne + " VS " + namePlayerTwo + "\n" );
	
	
	for(int i = 0; i < playerOneDeck.size() && i < playerTwoDeck.size(); i++ ) {
		//Player.flip(Deck.cardsDeckOne, Player.playerTwoTopCard); 
		
	System.out.println("playerOne's top card is: " + Player.playerOneTopCard);	
	System.out.println("VS");
	System.out.println("playerTwo's top card is: " + Player.playerTwoTopCard);
	
	int comparable = Player.playerOneTopCard.compareTo(Player.playerTwoTopCard); 
	System.out.println(Player.determineWinner(Player.playerOneTopCard, Player.playerTwoTopCard, comparable));
	}
	
	System.out.println(Player.score(Player.p1Score, Player.p2Score));
	
	}
		
		
	}
	


