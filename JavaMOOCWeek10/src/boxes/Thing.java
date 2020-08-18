package boxes;

public class Thing {
	private String name;
	private int weight;
	
	
	public Thing(String name, int weight) {
		if (weight < 0) {
			throw new IllegalArgumentException("Weight cannot be negative");
		}
		this.name = name;
		this.weight = weight;
	}

	public Thing(String name) {
	this(name, 0);	
	}
	
	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}

	@Override
	public boolean equals(Object obj){
		if (obj == null) {
			return false;
		}
		if (obj.getClass() != getClass()) {
			return false;
		}
		
		final Thing thing = (Thing) obj;
		
		if (this.name == null || thing.name == null || !thing.name.equals(name)) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + weight;
		return result;
	}

	
}
