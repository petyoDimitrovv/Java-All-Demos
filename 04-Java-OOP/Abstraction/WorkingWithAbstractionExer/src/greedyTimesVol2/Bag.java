package greedyTimesVol2;

public class Bag {
    private CashContainer cashContainer;
    private GemContainer gemContainer;
    private Gold gold;

    public Bag(CashContainer cash, GemContainer gem, Gold gold) {
        this.cashContainer = new CashContainer();
        this.gemContainer = new GemContainer();
        this.gold = new Gold();
    }
}