package Pizza;

public class Topping {

    private ToppingType toppingType;
    private double weight;

    private ToppingType getToppingType() {
        return toppingType;
    }

    public Topping(String toppingType, double weight){
        this.setToppingType(toppingType);
        this.setWeight(weight);

    }
    private void setToppingType(String toppingType) {
        try {
        ToppingType topping = ToppingType.valueOf(toppingType.toUpperCase());
        } catch (Exception ex) {
            throw
                    new IllegalArgumentException("Cannot place " + toppingType+ " on top of your pizza.");
        }

    }

    public double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        if(weight < 1 || weight > 50){
            throw new IllegalArgumentException(this.toppingType.name() + " weight should be in the range [1..50]");
        }
        this.weight = weight;
    }
    public double calculateCalories(){
        return 2 * this.getWeight() * toppingType.getModifier();

    }

}
