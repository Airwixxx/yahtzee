public class FullHouseScore extends Score {

	public FullHouseScore() {
		
	}
	
	public int calculateScore(int[] values) {
		
		
		int[] counts = new int[7];
		for(int i = 0; i < values.length; i++) {
			counts[values[i]]++;
		}
		boolean hasThree = false;
		boolean hasTwo = false;
		for(int i = 1; i < counts.length; i++) {
			if(counts[i] == 3) {
				hasThree = true;
			} else if(counts[i] == 2) {
				hasTwo = true;
			}
		}
		if(hasThree && hasTwo) {
			return 25;
		}
		return 0;
	}
}
