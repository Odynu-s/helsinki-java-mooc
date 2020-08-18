package javaMOOCWeek6;

public class BinarySearch {
	
	public static boolean search(int[] array, int searchedNumber) {
		int beginning = 0;
		int end = array.length - 1;
		
		while (beginning <= end) {
			int middle = (beginning + end)/2;
			if (array[middle] == searchedNumber) {
				return true;
			}
			if (array[middle] < searchedNumber) {
				beginning = middle + 1;
			}
			if (array[middle] > searchedNumber) {
				end = middle - 1;
			}
			
		}
		
		return false;
	}

}
