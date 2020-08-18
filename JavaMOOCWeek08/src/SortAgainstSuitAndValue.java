import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card> {

	public int compare(Card card1, Card card2) {
		int tempNum = card1.getSuit() - card2.getSuit();
		if (tempNum == 0) {
			return card1.getValue() - card2.getValue();
		}
		return tempNum;
	}
}
