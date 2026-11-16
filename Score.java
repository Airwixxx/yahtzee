
public abstract class Score {
    private int[] values;
    public abstract int calculateScore(int[] values);

    private boolean isUsed = false;

    public Score() {
    }

    public Score(int[] values) {
        this.values = values;
    }

    public int[] getValues() {
        return values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }
}
