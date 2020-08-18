package javaMOOCWeek6;
import java.util.*;


public class NightSky {
	
	//variables
	private final int width;
	private final int height;
	private final double density;
	private int starsInLastPrint = 0;;
	
	//constructors
	public NightSky(double density) {
		this(density, 20, 10);
		
	}
	
	public NightSky(int width, int height) {
		this(0.1, width, height);
	}
	
	public NightSky(double density, int width, int height) {
		this.density = density;
		this.width = width;
		this.height = height;
	}
	
	
	public void printLine() {
		for (int i = 0; i <= width; i++) {
			Random rand = new Random();
			if (rand.nextDouble() < density) {
				System.out.print("*");
				this.starsInLastPrint++;
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
		
	}
	
	public void print() {
		for (int i = 0; i <= height; i++) {
			printLine();
		}
	}

	public int starsInLastPrint() {
		return  starsInLastPrint;
	}
}
