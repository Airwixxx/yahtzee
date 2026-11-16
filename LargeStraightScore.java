public class LargeStraightScore extends Score {
	
	public LargeStraightScore() {

	}
	
	public int calculateScore(int[] values) {
		int[] counts = new int[7];
		for (int i = 0; i < values.length; i++) {
			counts[values[i]]++;
		}

		boolean hasLargeStraight = true;
		for (int face = 1; face <= 5; face++) {
			if (counts[face] == 0) {
				hasLargeStraight = false;
				break;
			}
		}
		if (hasLargeStraight) {
			return 40;
		}

		hasLargeStraight = true;
		for (int face = 2; face <= 6; face++) {
			if (counts[face] == 0) {
				hasLargeStraight = false;
				break;
			}
		}
		if (hasLargeStraight) {
			return 40;
		}

		return 0;
	} 
}
