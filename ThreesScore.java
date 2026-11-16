public class ThreesScore extends Score {
	
	public ThreesScore() {

	}
	

	public int calculateScore(int[] values) {
		checkUsed();
		int score = 0;
		for(int i = 0; i < values.length; i++) {
			if(values[i] == 3) {
				score += 3;
			}
		}
		setUsed(true);
		return score;
	} 
}