package boxes;

import java.util.*;

public class MaxWeightBox extends Box {
	private int maximumWeight;
	private List<Thing> things;
	
	public MaxWeightBox(int maxWeight) {
		this.maximumWeight = maxWeight;
		this.things = new ArrayList<Thing>();
	}

	@Override
	public void add(Thing thing) {
		int tempWeight = 0;
		for (Thing tempThing: things) {
			tempWeight += tempThing.getWeight();
		}
		if (thing.getWeight() + tempWeight <= maximumWeight) {
			things.add(thing);
		}
	}

	@Override
	public boolean isInTheBox(Thing thing) {
		if (things.contains(thing)) {
			return true;
		}
		return false;
	}

}