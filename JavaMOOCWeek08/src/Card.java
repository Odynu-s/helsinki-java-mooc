
public class Card implements Comparable<Card>{
	public static final int SPADES = 0;
	public static final int DIAMONDS = 1;
	public static final int HEARTS = 2;
	public static final int CLUBS = 3;
	private String[] suits = {"Spades", "Diamonds", "Hearts", "Clubs"};
	private String[] values = {"-", "-", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	private final int value;
	private final int suit;
	
	public Card(int value, int suit) {
		this.value = value;
		this.suit = suit;
	}
	
	public String toString() {
		return this.values[this.value] + " of " + this.suits[this.suit];
	}
	
	public int compareTo(Card card) {
		int tempNum = this.value - card.value;
		if (tempNum == 0) {
			return  this.suit - card.suit;
		}
		return tempNum;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public int getSuit() {
		return this.suit;
	}
}
