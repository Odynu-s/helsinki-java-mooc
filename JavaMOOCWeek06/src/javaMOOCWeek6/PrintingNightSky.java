package javaMOOCWeek6;

public class PrintingNightSky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NightSky NightSky = new NightSky(8, 4);
		NightSky.print();
		System.out.println("Number of stars: " + NightSky.starsInLastPrint());
		System.out.println("");

		NightSky.print();
		System.out.println("Number of stars: " + NightSky.starsInLastPrint());

	}

}
