public class FourOfAKindScore extends Score {

	public FourOfAKindScore() {

	}
	
	public int calculateScore(int[] values) {
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
				return sum;
			}
		}
		return 0;
	} 
}
