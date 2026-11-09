public class Die {
	
	private int numSides;
	private int dieValue;

	public Die() {
		numSides = 6;
		roll();
	}
	
	public Die(int sides) {
		numSides = sides;
		roll();
	}
	
	public Die(int sides, int value) {
		numSides = sides;
		dieValue = value;
	}
	

	public void roll() {
		dieValue = (int) (Math.random() * numSides) + 1;
	}

	/**
	 * @return the numSides
	 */
	public int getNumSides() {
		return numSides;
	}

	/**
	 * @return the dieValue
	 */
	public int getDieValue() {
		return dieValue;
	}
	
	public String toString() {
		return "# Sides: "+numSides+"   Die Value = " +dieValue;
	}

}