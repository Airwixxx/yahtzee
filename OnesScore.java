public class OnesScore extends Score {
	
	public OnesScore() {
		
	}
	
	public int calculateScore(int[] values) {
		checkUsed();
		
		int score = 0;
		for(int i = 0; i < values.length; i++) {
			if(values[i] == 1) {
				score += 1;
			}
		}
		setUsed(true);
		return score;
	} 
}
