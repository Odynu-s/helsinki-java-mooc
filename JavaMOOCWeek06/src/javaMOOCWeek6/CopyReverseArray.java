package javaMOOCWeek6;
import java.util.*;

public class CopyReverseArray {

	public static void main(String[] args) {
	    int[] original = {1, 2, 3, 4};
	    int[] copied = reverseCopy(original);

	    // change the copied

	    // print both
	    System.out.println( "original: " + Arrays.toString(original));
	    System.out.println( "copied: " + Arrays.toString(copied));
	}
	
	public static int[] copy(int[] array) {
		int[] copiedArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			copiedArray[i] = array[i];
		}
		return copiedArray;
	}
	
	public static int[] reverseCopy(int[] array) {
		int[] test = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            test[i] = array[array.length - i - 1];
        }
        return test;
	}

}
