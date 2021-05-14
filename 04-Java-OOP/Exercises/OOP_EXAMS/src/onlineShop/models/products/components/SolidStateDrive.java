package onlineShop.models.products.components;

public class SolidStateDrive extends BaseComponent {

    public static final double MULTIPLAYER = 1.20;
    public SolidStateDrive(int id, String manufacturer, String model, double price, double overallPerformances,int generation) {
        super(id, manufacturer, model, price, MULTIPLAYER * overallPerformances, generation);
    }
}
