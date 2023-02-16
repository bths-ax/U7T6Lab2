import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Integer[] test1 = {4,5,6,3}; //isSorted returns false
		Integer[] test2 = {2,0,2,3,3};//isSorted returns false
		Integer[] test3 = {1,1,1,1};//isSorted returns true
		Integer[] test4 = {1,2,3,4,5,6,76,100};//isSorted returns true
		ArrayList<Integer> al1 = new ArrayList<Integer>(Arrays.asList(test1));
		ArrayList<Integer> al2 = new ArrayList<Integer>(Arrays.asList(test2));
		ArrayList<Integer> al3 = new ArrayList<Integer>(Arrays.asList(test3));
		ArrayList<Integer> al4 = new ArrayList<Integer>(Arrays.asList(test4));
		System.out.println("isSorted(al1) = "+SortUtils.isSorted(al1));
		System.out.println("isSorted(al2) = "+SortUtils.isSorted(al2));
		System.out.println("isSorted(al3) = "+SortUtils.isSorted(al3));
		System.out.println("isSorted(al4) = "+SortUtils.isSorted(al4));

		String[] strTest1 = {"banana","cat","dog","apple"}; //isSorted returns false
		String[] strTest2 = {"b","a","b","c","c"}; //isSorted returns false
		String[] strTest3 = {"tie","tie","tie","tie"};//isSorted returns true
		String[] strTest4 = {"aardvark","bland","cow","dog","egg",                "far","zebra","zowie"};//isSorted returns true
		ArrayList<String> sal1 = new ArrayList<String>(Arrays.asList(strTest1));
		ArrayList<String> sal2 = new ArrayList<String>(Arrays.asList(strTest2));
		ArrayList<String> sal3 = new ArrayList<String>(Arrays.asList(strTest3));
		ArrayList<String> sal4 = new ArrayList<String>(Arrays.asList(strTest4));
		System.out.println("isSortedStr(sal1) = "+SortUtils.isSortedStr(sal1));
		System.out.println("isSortedStr(sal2) = "+SortUtils.isSortedStr(sal2));
		System.out.println("isSortedStr(sal3) = "+SortUtils.isSortedStr(sal3));
		System.out.println("isSortedStr(sal4) = "+SortUtils.isSortedStr(sal4));

		System.out.println(SortUtils.randomIntAL(25));
		System.out.println(SortUtils.randomIntAL(25));
		System.out.println(SortUtils.randomStrAL(25));
		System.out.println(SortUtils.randomStrAL(25));

		System.out.println("Selection sort:");
		Integer[] arr = SortUtils.randomIntArr(25);
		for (int n : arr) System.out.print(n + " "); System.out.println();
		SortStats stats = SortUtils.selectionSort(arr);
		for (int n : arr) System.out.print(n + " "); System.out.println();
		System.out.println("Took " + stats.getMemAccesses() + " accesses");
		System.out.println("Took " + stats.getComparisons() + " comparisons");

		System.out.println("Insertion sort:");
		Integer[] arr2 = SortUtils.randomIntArr(25);
		for (int n : arr2) System.out.print(n + " "); System.out.println();
		SortStats stats2 = SortUtils.insertionSort(arr2);
		for (int n : arr2) System.out.print(n + " "); System.out.println();
		System.out.println("Took " + stats2.getMemAccesses() + " accesses");
		System.out.println("Took " + stats2.getComparisons() + " comparisons");
	}
}
