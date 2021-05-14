package ferrari;

public class Ferrari implements Car {

    private static final String MODELl_CAR = "488-Spider" ;
    private String driverName;
    private String model;

    public Ferrari(String driverName) {
        this.driverName = driverName;
        this.model = MODELl_CAR;
    }

    @Override
    public String brakes() {
        return "Breaks!";
    }

    @Override
    public String gas() {
        return "Zadu6avam sa";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s"
                ,this.model, this.brakes(), this.gas(), this.driverName);
    }
}
