package CarShop;

public abstract class CarImpl implements Car {
    private String model;
    private String color;
    private int horsePower;
    private String countryProducer;

    protected CarImpl(String model, String color, int horsePower, String countryProducer) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProducer = countryProducer;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String countryProducer() {
        return this.countryProducer;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",
                this.getModel(),
                this.countryProducer(),
                TIRES);

    }
}
