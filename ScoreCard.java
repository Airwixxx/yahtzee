public abstract class ScoreCard {
    private int[] values;
    public abstract int calculateScore(int[] values);

    public ScoreCard() {
    }

    public ScoreCard(int[] values) {
        this.values = values;
    }
}
