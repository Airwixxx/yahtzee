public abstract class Score {
    private int[] values;
    public abstract int calculateScore(int[] values);

    public Score() {
    }

    public Score(int[] values) {
        this.values = values;
    }
}
