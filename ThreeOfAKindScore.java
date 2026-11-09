public class ThreeOfAKindScore extends Score {
	
	public ThreeOfAKindScore() {

	}
	
	public int calculateScore(int[] values) {
		int score = 0;
		int[] counts = new int[7]; 
		for(int i = 0; i < values.length; i++) {
			counts[values[i]]++;
		}
		for(int i = 1; i < counts.length; i++) {
			if(counts[i] >= 3) {
				for(int j = 0; j < values.length; j++) {
					score += values[j];
				}
				return score;
			}
		}
		return 0;
	} 
}
