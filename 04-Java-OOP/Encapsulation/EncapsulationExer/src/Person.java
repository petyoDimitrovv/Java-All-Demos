import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if(name == null && this.name.trim().isEmpty()){
            throw new IllegalStateException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if(this.money < 0){
            throw new IllegalStateException("Money cannot be negative");
        }
        this.money = money;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    public void buyProduct (Product product){
        if(this.money >= product.getCost() ){
            this.setMoney(this.money - product.getCost());
            this.getProducts().add(product);
            System.out.println(this.name + " bought " + product.getName());
        }else {
            System.out.println( this.name + " can't afford " + product.getName());
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s - ",this.getName()))
                .append(this.getProducts().stream()
                .map(Product::getName)
                .collect(Collectors.joining(", ")));
        return sb.toString();
    }
}
