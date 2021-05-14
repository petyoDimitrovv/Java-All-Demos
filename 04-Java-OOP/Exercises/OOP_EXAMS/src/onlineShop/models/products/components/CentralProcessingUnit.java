package onlineShop.models.products.components;

public class CentralProcessingUnit extends BaseComponent{
    public static final double MULTIPLAYER = 1.25;
    public CentralProcessingUnit(int id, String manufacturer, String model, double price, double overallPerformances, int generation) {
        super(id, manufacturer, model, price, MULTIPLAYER *  overallPerformances, generation);
    }
}
