package javaMOOCWeek6;
import java.util.*;

public class Birdwatcher{
	private final ArrayList<Bird> birdWatch;
	private Bird bird;
	
	public Birdwatcher() {
		this.birdWatch = new ArrayList<Bird>();
	}
	
	public void addBird(String name, String latin) {
		bird = new Bird(name, latin);
		this.birdWatch.add(bird);
	}
	
	public ArrayList<Bird> getBirds() {
		return this.birdWatch;
	}
	
	public void statistics() {
		for (Bird b: birdWatch) {
			System.out.println(b);
		}
	}
	
}