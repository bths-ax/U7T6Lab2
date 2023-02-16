public class SortStats {
	private int memAccesses;
	private int comparisons;

	public SortStats() {
		this.memAccesses = 0;
		this.comparisons = 0;
	}

	public SortStats(int memAccesses, int comparisons) {
		this.memAccesses = memAccesses;
		this.comparisons = comparisons;
	}

	public int getMemAccesses() { return memAccesses; }
	public int getComparisons() { return comparisons; }

	public void setMemAccesses(int newMemAccesses) { memAccesses = newMemAccesses; }
	public void setComparisons(int newComparisons) { comparisons = newComparisons; }

	public void incrementMemAccesses() { memAccesses++; }
	public void incrementComparisons() { comparisons++; }
}
