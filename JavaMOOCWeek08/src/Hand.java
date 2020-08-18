import java.util.*;

public class Hand implements Comparable<Hand> {
	private List<Card> hand;
	
	public Hand() {
		this.hand = new ArrayList<Card>();
	}
	
	public void add(Card card) {
		this.hand.add(card);
	}
	
	public void print() {
		for (Card card: this.hand) {
			System.out.println(card);
		}
	}
	
	public void sort() {
		Collections.sort(hand);
	}
	
	public int handTotal() {
		int tempNumber = 0;
		for (Card card: this.hand) {
			tempNumber += card.getValue();
		}
		return tempNumber;
	}
	
	public int compareTo(Hand hand) {
		return this.handTotal() - hand.handTotal();
	}
	
	public void sortAgainstSuit() {
		Collections.sort(this.hand, new SortAgainstSuitAndValue());
	}
}
