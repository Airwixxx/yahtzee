public class TwosScore extends Score {
	
	public TwosScore() {

	}
	

	public int calculateScore(int[] values) {
		int score = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] == 2) {
				score += 2;
			}
		}
		return score;
	} 
}