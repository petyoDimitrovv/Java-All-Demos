package CarShop;

public class Seat extends CarImpl implements Sellable{
    private double price;


    public Seat(String model, String color, int horsePower,
                String countryProducer, double price) {
        super(model, color, horsePower, countryProducer);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("%n%s sells for %f",
                        this.getModel(),this.price);
    }
}
