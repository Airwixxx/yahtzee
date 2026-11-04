
public class PairOfDice {
	
	private Die die1;
	
	private Die die2;
	
	private int numSides;
	private int diceValue;
	private boolean sameValue;
	
	public PairOfDice() {
		die1 = new Die();
		die2 = new Die();
		updateDiceValue();
	}
	
	public PairOfDice( int sides) {
		die1 = new Die(sides);
		die2 = new Die(sides);
		updateDiceValue()
;	}

	public void roll() {
		die1.roll();
		die2.roll();
		updateDiceValue();
	}
	
	public void updateDiceValue() {
		diceValue = die1.getDieValue() + die2.getDieValue();
		sameValue = die1.getDieValue () == die2.getDieValue();
	}

	public int getNumSides() {
		return numSides;
	}

	public int getDiceValue() {
		return diceValue;
	}

	public boolean isSameValue() {
		return sameValue;
	}
	
	public Die[] getDice() {
		return new Die[] {die1, die2};
	}
	
	public int[] getDieValues() {
		return new int[] {die1.getDieValue(), die2.getDieValue()};
	}
	
	public String toString() {
		return die1.toString() + "   ,   " + die2.toString();
	}
}








