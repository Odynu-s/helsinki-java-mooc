package boxes;

import java.util.*;

public class OneThingBox extends Box {
	private int maximumAmountOfThings = 0;
	private List<Thing> things;
	
	public OneThingBox() {
		things = new ArrayList<Thing>();
		
	}

	@Override
	public void add(Thing thing) {
		if (maximumAmountOfThings == 0) {
			things.add(thing);
			this.maximumAmountOfThings++;
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
