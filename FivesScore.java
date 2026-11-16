public class FivesScore extends Score {
	
	public FivesScore() {

	}
	
	public int calculateScore(int[] values) {
		checkUsed();
		int score = 0;
		for(int i = 0; i < values.length; i++) {
			if(values[i] == 5) {
				score += 5;
			}
		}
		setUsed(true);
		return score;
	}  
}
