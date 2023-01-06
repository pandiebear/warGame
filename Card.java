package week06Assignment;

public class Card { 
	
	private Suit suit;
	private Value value;
	private int rank; 
	
	
	
	
	public Card(Suit suit, Value value, int rank) {
		this.suit = suit;
		this.setValue(value);
		this.setRank(rank); 
	}
	
	
	///////getters and setters////////
	public Suit getSuit() {
		return suit; 
	}
	public void setSuit(Suit suit) {
		this.suit = suit; 
	}
	public Value getValue() {
		return value;
	}
	public void setValue(Value value) {
		this.value = value;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	///////////////////////////////////
	
	public int compareTo(Card opponentCrdRnk) {
		if(this.rank > opponentCrdRnk.rank) {
			return -1; 
		}if(this.rank < opponentCrdRnk.rank) {
			return 1;
		}else {
			return 0; 
		}
	}
	////////////////////////////////////
	@Override 
	public String toString() {
		return this.value + " of " + this.suit + "[" + this.rank + "]"; 
	}
	
}
	

