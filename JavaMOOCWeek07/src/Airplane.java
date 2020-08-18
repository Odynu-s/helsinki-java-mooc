
public class Airplane {
	
	private String id;
	private int capacity;
	
	public Airplane(String id, int capacity) {
		this.id = id;
		this.capacity = capacity;
	}
	
	public String getId() {
		return this.id;
	}

	public String toString() {
		return this.id +" (" + this.capacity + " ppl)";
	}
}