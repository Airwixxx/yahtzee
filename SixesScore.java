public class SixesScore extends Score {
	
	public SixesScore(){
		
	}
	
	public int calculateScore(int[] values) {
		checkUsed();
		int score = 0; 
		for ( int i = 0; i < values.length; i++) {
			if (values[i] == 6) {
				score +=6;
			}
		}
		setUsed(true);
		return score;
	} 
}
