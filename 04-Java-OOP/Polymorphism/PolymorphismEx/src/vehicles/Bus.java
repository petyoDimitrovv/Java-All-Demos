package vehicles;

import java.text.DecimalFormat;

public class Bus extends Vehicle {
    private double fuelConsumption;
    private static final double ADDITIONAL_CONSUMPTION = 1.4;



    public Bus(double fuelQuantity, double fuelConsumPerKm, double tankCapacity) {
        super(fuelQuantity, fuelConsumPerKm, tankCapacity);
    }

    @Override
    public void drivenDistance(Double distance) {


        double fuelConsumption = super.getFuelConsumPerKm() + distance;
        if (fuelConsumption <= super.getFuelQuantity()) {
            super.setFuelQuantity(super.getFuelQuantity() - super.getFuelConsumPerKm());


            DecimalFormat decimalFormat = new DecimalFormat("###.##");

            System.out.printf("Bus travelled %s km%n",decimalFormat.format(distance));
        } else {
            System.out.println("Bus needs refueling");

        }

        }




    @Override
    public void refuel(double quantity) {
        if (!isFullOrNegative(quantity)) {
            super.setFuelQuantity((super.getFuelQuantity() + quantity));
        }



}
    @Override
    public String toString() {
        return "Bus: " + super.getFuelQuantity();
    }
}
