
public class CD implements ToBeStored {
	private String artist;
	private String title;
	private int publishingYear;
	private final double weight = 0.1;
	
	public CD(String artist, String title, int publishingYear) {
		this.artist = artist;
		this.title = title;
		this.publishingYear = publishingYear;
	}

	@Override
	public double weight() {
		// TODO Auto-generated method stub
		return this.weight;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.artist + ": " + this.title + " (" + this.publishingYear + ")";
	}

}
