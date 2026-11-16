public class FourOfAKindScore extends Score {

	public FourOfAKindScore() {

	}
	
	public int calculateScore(int[] values) {
		checkUsed();
		int[] counts = new int[7];
		for(int i = 0; i < values.length; i++) {
			counts[values[i]]++;
		}
		for (int face = 1; face < counts.length; face++) {
			if (counts[face] >= 4) {
				int sum = 0;
				for (int i = 0; i < values.length; i++) {
					sum += values[i];
				}
				setUsed(true);
				return sum;
			}
		}
		setUsed(true);
		return 0;
	} 
}
