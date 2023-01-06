package week06Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

static Random random = new Random(); 
	
public static ArrayList<Card> cardsDeckOne = new ArrayList<>();
public static ArrayList<Card> cardsDeckTwo = new ArrayList<>(); 


/////////////////////////////////////////
static ArrayList<Card> createStackOne() {
	for(int i = 1; i < 15; i ++) {
		switch(i) {
		case 1: 
			for(Value value: Value.values()) {
				cardsDeckOne.add(new Card(Suit.hearts, value, i++));
			}i = 1; 
		}
	}
	for(int i = 1; i < 15; i ++) {
		switch(i) {
		case 1: 
			for(Value value: Value.values()) {
				cardsDeckOne.add(new Card(Suit.diamonds, value, i++));
			}i = 1; 
		}
	}
	for(int i = 1; i < 15; i ++) {
		switch(i) {
		case 1: 
			for(Value value: Value.values()) {
				cardsDeckOne.add(new Card(Suit.spades, value, i++));
			}i = 1; 
		}
	}
	for(int i = 1; i < 15; i ++) {
		switch(i) {
		case 1: 
			for(Value value: Value.values()) {
				cardsDeckOne.add(new Card(Suit.clubs, value, i++));
			}i = 1; 
		}
	}
	for(int i = 0; i < cardsDeckOne.size(); i++) {
		Collections.swap(cardsDeckOne, randomizer(), i); 
	}
	return cardsDeckOne; 
}
///////////////////////////////////////

///////////////////////////////////////
static ArrayList<Card> createStackTwo() {
	for(int i = 1; i < 15; i ++) {
		switch(i) {
		case 1: 
			for(Value value: Value.values()) {
				cardsDeckTwo.add(new Card(Suit.hearts, value, i++));
			}i = 1; 
		}
	}
	for(int i = 1; i < 15; i ++) {
		switch(i) {
		case 1: 
			for(Value value: Value.values()) {
				cardsDeckTwo.add(new Card(Suit.diamonds, value, i++));
			}i = 1; 
		}
	}
	for(int i = 1; i < 15; i ++) {
		switch(i) {
		case 1: 
			for(Value value: Value.values()) {
				cardsDeckTwo.add(new Card(Suit.spades, value, i++));
			}i = 1; 
		}
	}
	for(int i = 1; i < 15; i ++) {
		switch(i) {
		case 1: 
			for(Value value: Value.values()) {
				cardsDeckTwo.add(new Card(Suit.clubs, value, i++));
			}i = 1; 
		}
	}for(int i = 0; i < cardsDeckTwo.size(); i++) {
		Collections.swap(cardsDeckTwo, randomizer(), i); 
	}
	
	return cardsDeckTwo; 
}
////////////////////////////////////////////////////////////////////////////

	static int randomizer() {
		return random.nextInt(52); 
	}


	}
	
	
	


