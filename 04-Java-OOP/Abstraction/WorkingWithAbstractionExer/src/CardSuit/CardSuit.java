package CardSuit;

public enum CardSuit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    public int getPower() {
        return power;
    }

    public int power;

            CardSuit(int ordinalValues){
        this.power = ordinalValues;
    }
}
