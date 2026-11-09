public class SmallStraightScore extends Score {
	
	public SmallStraightScore() {

	}
	
	
	public int calculateScore(int[] values) {
		int score = 0;
		int[] counts = new int[7];
		for(int i = 0; i < values.length; i++) {
			counts[values[i]]++;
		}
		if((counts[1] >= 1 && counts[2] >= 1 && counts[3] >= 1
				&& counts[4] >= 1) || (counts[2] >= 1 && counts[3] >= 1
				&& counts[4] >= 1 && counts[5] >= 1) || (counts[3] >= 1
				&& counts[4] >= 1 && counts[5] >= 1 && counts[6] >= 1)) {
			score = 30;
		}
		return 0;
	} 
}
