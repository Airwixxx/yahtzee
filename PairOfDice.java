public class PairOfDice {

	private Die d1;
	private Die d2;
	private int diceValue;
	private int numSides;
	private boolean sameValue;

	public PairOfDice() {
		numSides = 6;
		d1 = new Die();
		d2 = new Die();
		updateDiceValues();
	}

	public PairOfDice(int sides) {
		numSides = sides;
		d1 = new Die(numSides);
		d2 = new Die(numSides);
		updateDiceValues();
	}

	public void roll() {
		d1.roll();
		d2.roll();
		updateDiceValues();
	}

	public void updateDiceValues() {
		diceValue = d1.getDieValue() + d2.getDieValue();
		sameValue = d1.getDieValue() == d2.getDieValue();

	}

	/**
	 * @return the diceValue
	 */
	public int getDiceValue() {
		return diceValue;
	}

	/**
	 * @return the numSides
	 */
	public int getNumSides() {
		return numSides;
	}

	/**
	 * @return the sameValue
	 */
	public boolean isSameValue() {
		return sameValue;
	}
	
	public Die[] getDice() {
		return new Die[] {d1, d2};
	}
	
	public int[] getDieValues() {
		return new int[] {d1.getDieValue(), d2.getDieValue()};
	}
	
	public String toString() {
		return d1.toString() +"   ,   " + d2.toString();
	}
}