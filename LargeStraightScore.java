public class LargeStraightScore extends Score {
	
	public LargeStraightScore() {

	}
	
	public int calculateScore(int[] values) {
		checkUsed();
		if (values.length != 5) {
			setUsed(true);
			return 0;
		}

		int[] counts = new int[7];
		for(int i = 0; i < values.length; i++) {
			counts[values[i]]++;
		}

		if ((counts[1] > 0 && counts[2] > 0 && counts[3] > 0 && counts[4] > 0 && counts[5] > 0)
				|| (counts[2] > 0 && counts[3] > 0 && counts[4] > 0 && counts[5] > 0 && counts[6] > 0)) {
			setUsed(true);
			return 40;
		}
		setUsed(true);
		return 0;
	}
}
