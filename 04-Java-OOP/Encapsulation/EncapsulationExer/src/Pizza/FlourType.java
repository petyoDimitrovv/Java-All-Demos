package Pizza;

public enum FlourType {
    WHITE(1.5),

    WHOLEGRAIN (1.0);

    FlourType(double modifier) {
        this.modifier = modifier;
    }

    public double getModifier() {
        return modifier;
    }

    private double modifier;

}
 