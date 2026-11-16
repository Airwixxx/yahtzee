public class FoursScore extends Score {
	
	public FoursScore() {

	}
	
	public int calculateScore(int[] values) {
		checkUsed();
		int score = 0;
		for(int i = 0; i < values.length; i++) {
			if(values[i] == 4) {
				score += 4;
			}
		}
		setUsed(true);
		return score;
	} 
}
