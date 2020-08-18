import java.util.*;

public class Randomizing{
	public static void main(String[] args) {
		Random randomizer = new Random();
		int x = 0;
		while(x < 10) {
			System.out.println(randomizer.nextInt(10));
			x++;
		}
		
	}
}