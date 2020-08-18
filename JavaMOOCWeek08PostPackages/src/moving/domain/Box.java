package moving.domain;

import java.util.*;

public class Box implements Thing {
	
	private int maximumCapacity;
	private List<Thing> list;
	
	public Box(int maximumCapacity) {
		this.maximumCapacity = maximumCapacity;
		this.list = new ArrayList<Thing>();
	}
	
	public boolean addThing(Thing thing) {
		if (this.getVolume() + thing.getVolume() <= this.maximumCapacity) {
			list.add(thing);
			return true;
		}
		return false;
	}
	
	public int getVolume() {
		int tempNumber = 0;
		for (Thing tempThing: this.list) {
			tempNumber += tempThing.getVolume();
		}
		return tempNumber;
	}
}