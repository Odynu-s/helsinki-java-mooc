package containers;

public class ProductContainerRecorder extends ProductContainer {
	double initialVolume;
	ContainerHistory ch;

	public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
		super(productName, capacity);
		this.initialVolume = initialVolume;
		ch = new ContainerHistory();
		ch.add(initialVolume);
		super.addToTheContainer(initialVolume);
	}
	
	public String history() {
		return ch.toString();
	}
	
	public void addToTheContainer(double amount) {
		super.addToTheContainer(amount);
		ch.add(getVolume());
		}
	
	public double takeFromTheContainer(double amount) {
		super.takeFromTheContainer(amount);
		ch.add(getVolume());
		return amount;
	}
	
	public void printAnalysis() {
		System.out.println("Product: " + getName());
		System.out.println("History: " + history());
		System.out.println("Greatest product amount: " + ch.maxValue());
		System.out.println("Smallest product amount: " + ch.minValue());
		System.out.println("Average: " + ch.average());
		System.out.println("Greatest change: " + ch.greatestFluctuation());
		System.out.println("Variance: " + ch.variance());
	}

}
