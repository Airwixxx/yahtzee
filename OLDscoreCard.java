public abstract class OLDscoreCard {
    private int[] values;
    public abstract int calculateScore(int[] values);

    public OLDscoreCard() {
    }

    public OLDscoreCard(int[] values) {
        this.values = values;
    }
}
