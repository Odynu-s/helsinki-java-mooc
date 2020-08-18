package exercise27;

public class Bird {
	
	private String name;
	private String latinName;
	private int ringingYear;
	private int observationNumber;
	
	public Bird(String name, String latinName, int ringingYear) {
		this.name = name;
		this.latinName = latinName;
		this.ringingYear = ringingYear;
		this.observationNumber = 0;
	}
	
	public String getLatinName() {
		return this.latinName;
	}
	
	public int getRingingYear() {
		return this.ringingYear;
	}
	
	@Override
	public String toString() {
		return this.latinName + " (" + this.ringingYear + ")";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o != null && o instanceof Bird) {
			Bird temp = (Bird) o;
			if (temp != null && this.latinName.equals(temp.getLatinName()) && this.ringingYear == temp.getRingingYear()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		if (this.latinName == null) {
			return 7;
		}
		return this.latinName.hashCode() + this.ringingYear;
	}
	
	public void increaseObservationNumber() {
		this.observationNumber = this.observationNumber + 1;
	}
	
	public int getobsnumber() {
		return this.observationNumber;
	}

}
