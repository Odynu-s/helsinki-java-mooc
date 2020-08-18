import java.util.*;

public class Container {
	
	int maximumWeight;
	int currentWeight = 0;
	ArrayList<Suitcase> list;
	
	public Container(int maximumWeight) {
		this.maximumWeight = maximumWeight;
		this.list = new ArrayList<Suitcase>();	
	}
	
	public void addSuitcase(Suitcase suitcase) {
		if (currentWeight + suitcase.totalWeight() < maximumWeight) {
			list.add(suitcase);
			currentWeight += suitcase.totalWeight();
		}		
	}
	
	
	public String toString() {
		return list.size() + " suitcases (" + currentWeight + " kg)";
	}
	
	public void printThings() {
		for (Suitcase suitcase: list) {
			suitcase.printThings();
		}
	}
}