package vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicle {


    public Truck(double fuelQuantity, double fuelConsumPerKm, double tankCapacity) {
        super(fuelQuantity, fuelConsumPerKm, tankCapacity);
    }

    @Override
    public void drivenDistance(Double distance) {
        double fuelConsumption = super.getFuelConsumPerKm() + 1.6 * distance;

        if (fuelConsumption <= super.getFuelQuantity()) {
        super.setFuelQuantity(super.getFuelQuantity() - super.getFuelConsumPerKm());


        DecimalFormat decimalFormat = new DecimalFormat("###.##");

        System.out.printf("Truck travelled %s km%n",decimalFormat.format(distance));
    } else {
        System.out.println("Truck needs refueling");

    }

    }

    @Override
    public void refuel(double quantity) {
        if(!isFullOrNegative(quantity)){
            super.setFuelQuantity((super.getFuelQuantity() + quantity) * 0.95);
        }
    }

    @Override
    public String toString() {
        return "Truck: " + super.getFuelQuantity();
    }
}
