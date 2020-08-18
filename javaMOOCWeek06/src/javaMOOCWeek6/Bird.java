package javaMOOCWeek6;

public class Bird {
	
	private final String birdName;
	private final String latinName;
	private int count = 0;
	
	public Bird(String name, String latin) {
		this.birdName = name;
		this.latinName = latin;
	}
	
	public String getName() {
		return this.birdName;
	}
	
	public String getlatinName() {
		return this.latinName;
	}
	
	public void increaseCount() {
		this.count++;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.birdName + " (" + this.latinName + "): " + count + " observations";
	}
}