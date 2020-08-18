import java.util.*;

public class Box {
	
	private double maximumWeight;
	ArrayList<ToBeStored> storables;
	
	public Box(double weight) {
		this.maximumWeight = weight;
		this.storables = new ArrayList<ToBeStored>();
	}
	
	public void add(ToBeStored storable) {
		if (this.weight() + storable.weight() <= this.maximumWeight) {
			storables.add(storable);
		}
	}
	
	public double weight() {
		double tempWeight = 0;
		for (ToBeStored storable: this.storables) {
			tempWeight += storable.weight();
		}
		return tempWeight;
	}
	
	public String toString() {
		return "Box: " + storables.size() + " things, total weight: " + this.weight() + " kg";  
	}
}
