package javaMOOCWeek6;

import java.util.*;


public class Main {
	public static void main(String[] args) {
		
		int[] array = { -3, 2, 3, 4, 7, 8, 12 };
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Value of the array: " + Arrays.toString(array));
		System.out.println("");
		
		System.out.println("Enter the searched number:");
		String searchedValue = reader.nextLine();
		System.out.println();
		
		boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));
		
		if (result) {
			System.out.println("Value " + searchedValue + " is in the array.");
		}else {
			System.out.println("Value " + searchedValue + " is not in the array.");
		}
		
	}
}
