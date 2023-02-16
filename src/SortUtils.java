import java.util.ArrayList;
import java.util.Arrays;

/** Static methods for aiding in the creation of sorting algorithms */
public class SortUtils {
	/** Checks if an array of integers is non-descending order */
	public static boolean isSorted(ArrayList<Integer> intArr) {
		for (int i = 1; i < intArr.size(); i++)
			if (intArr.get(i - 1) > intArr.get(i))
				return false;
		return true;
	}

	/** Checks if an array of strings is non-descending order */
	public static boolean isSortedStr(ArrayList<String> strArr) {
		for (int i = 1; i < strArr.size(); i++)
			if (strArr.get(i - 1).compareTo(strArr.get(i)) > 0)
				return false;
		return true;
	}

	/** Creates a random array of Integers of a given length */
	public static Integer[] randomIntArr(int length) {
		Integer[] result = new Integer[length];
		for (int i = 0; i < length; i++)
			result[i] = (int)(Math.random() * length * 2);
		return result;
	}

	/** Creates a random ArrayList of Integers of a given length */
	public static ArrayList<Integer> randomIntAL(int length) {
		return new ArrayList<Integer>(Arrays.asList(randomIntArr(length)));
	}

	/** Creates a random String of a given length */
	public static String randomStr(int length) {
		String result = "";
		for (int i = 0; i < length; i++)
			result += (char)(Math.random() * 26 + (int)('A'));
		return result;
	}

	/** Creates a random array of Strings of a given length */
	public static String[] randomStrArr(int length) {
		String[] result = new String[length];
		for (int i = 0; i < length; i++)
			result[i] = randomStr((int)(Math.random() * length + 1));
		return result;
	}

	/** Creates a random ArrayList of Strings of a given length */
	public static ArrayList<String> randomStrAL(int length) {
		return new ArrayList<String>(Arrays.asList(randomStrArr(length)));
	}

	/** Sorts an array of integers using selection sort and returns the sorting statistics */
	public static SortStats selectionSort(Integer[] arr) {
		int memAccesses = 0;
		int comparisons = 0;
		for (int i = 0; i < arr.length; i++) {
			// Find index of minimum element in the unsorted subarray
			int k = i;
			for (int j = i + 1; j < arr.length; j++) {
				comparisons++;
				if (arr[j] < arr[k]) {
					k = j;
				}
			}
			// Swap the minimum element with the current element to
			// place it at the back of the sorted subarray
			memAccesses++;
			int tmp = arr[i];
			arr[i] = arr[k];
			arr[k] = tmp;
		}
		return new SortStats(memAccesses, comparisons);
	}

	/** Sorts an array of integers using insertion sort and returns the sorting statistics */
	public static SortStats insertionSort(Integer[] arr) {
		int memAccesses = 0;
		int comparisons = 0;
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			int n = arr[i];
			// Shift elements to the right until the element
			// originally at index `i` can be placed into
			// the sorted portion of the array
			while (j > 0 && arr[j - 1] > n) {
				comparisons++;
				memAccesses++;
				arr[j] = arr[j - 1];
				j--;
			}
			memAccesses++;
			arr[j] = n;
		}
		return new SortStats(memAccesses, comparisons);
	}
}
