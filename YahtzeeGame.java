import java.util.Scanner;

public class YahtzeeGame {

    private Scanner scanner = new Scanner(System.in);
    private YahtzeeDice gameDice;
    private int score;
    private ScoreCard board[];
    private boolean[] keepDice;

    public YahtzeeGame() {
        this.board = new ScoreCard[13]; // Assuming 13 different scoring categories
    }

    public void printWelcomeMessage() {
        System.out.println("Welcome to Yahtzee!");
        System.out.println("You will be rolling 5 dice and trying to get the best combinations.");
        System.out.println("You have 3 rolls per turn, and you can choose to keep the rolled dice or re-roll them.");
    }

    public void playRound() {
        YahtzeeDice yahtzeeDice = new YahtzeeDice();
        keepDice = new boolean[5];

        for (int rollNumber = 1; rollNumber <= 3; rollNumber++) {
            int rollTotal = yahtzeeDice.roll(keepDice);
            System.out.println("You rolled: " + java.util.Arrays.toString(yahtzeeDice.getDiceValues()) + " Total: " + rollTotal);
            if (rollNumber == 3 || !reroll()) {
                break;
            }
            keepDice = getKeptDice(yahtzeeDice);
        }

        System.out.println("Final roll: " + java.util.Arrays.toString(yahtzeeDice.getDiceValues()));
    }

    public boolean reroll() {
        System.out.println("Do you want to re-roll? (y/n)");
        String response = scanner.nextLine();
        if (!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("n")) {
            System.out.println("Invalid input. Please enter 'y' or 'n'.");
            return reroll();
        }
        return response.equalsIgnoreCase("y");
    }

    public boolean[] getKeptDice(YahtzeeDice yahtzeeDice) {
        System.out.println("Which dice do you want to keep? (Enter 1 for yes, 0 for no)");
        String keepDice = scanner.nextLine();
        if (keepDice.length() != 5) {
            System.out.println("Invalid input. Please enter 5 characters (1 or 0).");
            return getKeptDice(yahtzeeDice);
        }
        for (int i = 0; i < 5; i++) {
            if (keepDice.charAt(i) != '1' && keepDice.charAt(i) != '0') {
                System.out.println("Invalid input. Please enter only 1s and 0s.");
                return getKeptDice(yahtzeeDice);
            }
        }
        for (int i = 0; i < 5; i++) {
            if (String.valueOf(keepDice.charAt(i)).equals("1")) {
                this.keepDice[i] = true;
            } else {
                this.keepDice[i] = false;
            }
        }
        return this.keepDice;
    }

	public YahtzeeDice getGameDice() {
		return gameDice;
	}

	public void setGameDice(YahtzeeDice gameDice) {
		this.gameDice = gameDice;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// public ScoreCard getBoard() {
	// 	return board;
	// }

	// public void setBoard(ScoreCard board) {
	// 	this.board = board;
	// }

}