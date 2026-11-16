public class YahtzeeScore extends Score {
	
	public YahtzeeScore() {
		
	}
	
	
	public int calculateScore(int[] values) {
		for (int i = 0; i < values.length; i++) {
			if (values[i] != values[0]) {
				return 0;
			}
		}
		return 50;
	} 
}
