import java.util.*;

public class Suitcase {
	
	int maximumWeightLimit;
	ArrayList<Thing> list;
	
	public Suitcase(int weightLimit) {
		this.maximumWeightLimit = weightLimit;
		this.list = new ArrayList<Thing>();
	}
	
	public void addThing(Thing thing) {
		if (totalWeight() < maximumWeightLimit) {
			list.add(thing);
		}
	}
	
	public String toString() {
		if (this.list.size() == 0) {
			return "empty" + " (" + totalWeight() + " kg)";
		}else if (this.list.size() == 1) {
			return list.size() + " thing" + " (" + totalWeight() + " kg)";
		}
		return list.size() + " things" + " (" + totalWeight() + " kg)";
	}
	
	public void printThings() {
		for (Thing thing: list) {
			System.out.println(thing);
		}
	}
	
	public int totalWeight() {
		int temp = 0;
		for (Thing thing: list) {
			temp += thing.getWeight();
		}
		return temp;
	}
	
	public Thing heaviestThing() {
		int max = Integer.MIN_VALUE;
		Thing tempThing = null;
		for (Thing thing: list) {
			if (thing.getWeight() > max) {
				max = thing.getWeight();
				tempThing = thing;
			}
		} 
		return tempThing;
	}

}