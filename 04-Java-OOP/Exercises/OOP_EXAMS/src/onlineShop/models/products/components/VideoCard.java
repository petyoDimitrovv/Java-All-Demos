package onlineShop.models.products.components;

public class VideoCard extends BaseComponent {
    public static final double MULTIPLAYER = 1.15;

    public VideoCard(int id, String manufacturer, String model, double price, double overallPerformances,int generation) {
        super(id, manufacturer, model, price, MULTIPLAYER * overallPerformances, generation);
    }
}
