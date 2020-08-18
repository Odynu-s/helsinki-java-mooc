package javaMOOCWeek6;
import java.util.*;

public class GradeDistribution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int input;
		int accepted = 0;
		int totalGrades = 0;
		int zeroes = 0;
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		
		
		System.out.println("Type exam scores, -1 completes");
		while (true) {
			input = Integer.parseInt(scanner.nextLine());
			if (input == -1) {
				break;
			}else {
				list.add(input);
				totalGrades++;
			}
		}
		
		for (int grade: list) {
			if (grade >= 0 && grade <= 29) {
				zeroes++;
			}else if (grade >= 30 && grade <= 34) {
				ones++;
				accepted++;
			}else if (grade >= 35 && grade <= 39) {
				twos++;
				accepted++;
			}else if (grade >= 40 && grade <= 44) {
				threes++;
				accepted++;
			}else if (grade >= 45 && grade <= 49) {
				fours++;
				accepted++;
			}else if (grade >= 50 && grade <= 60) {
				fives++;
				accepted++;
			}
		}
		double acceptedPercent = 100*accepted/totalGrades;
		System.out.println("Grade distribution:");
		System.out.println("5: " + printStars(fives));
		System.out.println("4: " + printStars(fours));
		System.out.println("3: " + printStars(threes));
		System.out.println("2: " + printStars(twos));
		System.out.println("1: " + printStars(ones));
		System.out.println("0: " + printStars(zeroes));
		System.out.println("Acceptance percentage: " + acceptedPercent);
	}
	//prints stars without line breaking, for inputed number
	public static String printStars(int numberOfStars) {
		String starString = "";
		for (int i = 0; i < numberOfStars; i++) {
			starString = starString + "*";
		}
		return starString;
	}
}