public class ChanceScore extends Score {
	
	public ChanceScore() {

	}
	
	public int calculateScore(int[] values) {
		checkUsed();
		int score = 0;
		for(int i = 0; i < values.length; i++) {
			score += values[i];
		}
		setUsed(true);
		return score;
	} 
}
