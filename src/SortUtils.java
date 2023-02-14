import java.util.ArrayList;

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
	public static Integer[] createRandomArray(int length) {
		Integer[] result = new Integer[length];
		for (int i = 0; i < length; i++)
			result[i] = (int)(Math.random() * length * 2);
		return result;
	}

	/** Creates a random ArrayList of Integers of a given length */
	public static ArrayList<Integer> createRandomList(int length) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < length; i++)
			result.add((int)(Math.random() * length * 2));
		return result;
	}

	/** Creates a random String of a given length */
	public static String createRandomStr(int length) {
		String result = "";
		for (int i = 0; i < length; i++)
			result += (char)(Math.random() * 26 + (int)('A'));
		return result;
	}

	/** Creates a random array of Strings of a given length */
	public static String[] createRandomArrayStr(int length) {
		String[] result = new String[length];
		for (int i = 0; i < length; i++)
			result[i] = createRandomStr((int)(Math.random() * length + 1));
		return result;
	}

	/** Creates a random ArrayList of Strings of a given length */
	public static ArrayList<String> createRandomListStr(int length) {
		ArrayList<String> result = new ArrayList<String>();
		for (int i = 0; i < length; i++)
			result.add(createRandomStr((int)(Math.random() * length + 1)));
		return result;
	}
}
