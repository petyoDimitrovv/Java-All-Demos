package onlineShop.models.products.components;

public class PowerSupply extends BaseComponent  {
    public static final double MULTIPLAYER = 1.05;

    public PowerSupply(int id, String manufacturer, String model, double price, double overallPerformances, int generation) {
        super(id, manufacturer, model, price, MULTIPLAYER * overallPerformances, generation);
    }
}
