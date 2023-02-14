public class SortStats {
	private int memAccesses;
	private int comparisons;

	public SortStats(int memAccesses, int comparisons) {
		this.memAccesses = memAccesses;
		this.comparisons = comparisons;
	}

	public int getMemAccesses() { return memAccesses; }
	public int getComparisons() { return comparisons; }
}
