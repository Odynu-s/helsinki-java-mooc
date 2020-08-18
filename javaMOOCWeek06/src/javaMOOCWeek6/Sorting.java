package javaMOOCWeek6;
import java.util.*;

public class Sorting {

	public static void main(String[] args) {
		int[] values = {8, 3, 7, 9, 1, 2, 4};
		sort(values);
	}
	
	//returns smallest value in array
	public static int smallest(int[] array) {
		int smallest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (smallest >= array[i]) {
				smallest = array[i];
			}
		}
		return smallest;
	}
	
	//returns index of smallest value in array
	public static int indexOfTheSmallest(int[] array) {
		int index = 0;
		int smallest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (smallest >= array[i]) {
				smallest = array[i];
				index = i;
			}
		}
		return index;
		
	}
	//returns index of smallest value in array, from passed value index to end of array
	public static int smallestIndexStartingFrom(int[] array, int index) {
		int smallest = array[index];
		for (int i = index; i < array.length; i++) {
			if (smallest >= array[i]) {
				smallest = array[i];
				index = i;
			}
		}
		return index;
	}
	//swaps the 2 values inside of the given array
	public static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array));
			swap(array, i, smallestIndexStartingFrom(array, i));	
		}
	}

}
