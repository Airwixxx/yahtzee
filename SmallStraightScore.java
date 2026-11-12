public class SmallStraightScore extends Score {
	
	public SmallStraightScore() {

	}
	
	public int calculateScore(int[] values) {
		int[] counts = new int[7];
		for (int i = 0; i < values.length; i++) {
			counts[values[i]]++;
		}

		boolean hasSmallStraight = false;
		for (int start = 1; start <= 3; start++) {
			if (counts[start] > 0
					&& counts[start + 1] > 0
					&& counts[start + 2] > 0
					&& counts[start + 3] > 0) {
				hasSmallStraight = true;
			}
		}

		if (hasSmallStraight = true) {
			return 30;
		}
		return 0;
	}
}
