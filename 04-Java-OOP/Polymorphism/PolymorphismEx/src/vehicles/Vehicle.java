package vehicles;

public abstract class Vehicle implements vehicleInterface {
    private double fuelQuantity;
    private double fuelConsumPerKm;
    private double tankCapacity;

    protected Vehicle(double fuelQuantity, double fuelConsumPerKm, double tankCapacity) {
        this.tankCapacity = tankCapacity;
        this.setFuelQuantity(fuelQuantity);
        this.fuelConsumPerKm = fuelConsumPerKm;
    }

    public double getTankCapacity() {

        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        if (getFuelQuantity() < 0) {
            throw new IllegalStateException("Fuel must be a positive number");
        }
        this.fuelQuantity = fuelQuantity;
    }


    public double getFuelConsumPerKm() {
        return fuelConsumPerKm;
    }

    public void setFuelConsumPerKm(double fuelConsumPerKm) {
        this.fuelConsumPerKm = fuelConsumPerKm;
    }


    public boolean isFullOrNegative(double quantity) {
        if (this.getTankCapacity() <= quantity) {
            System.out.println("Cannot fit fuel in tank");
            return true;
        } else if (quantity <= 0) {
            System.out.println("Fuel must be a positive number");
            return true;
        }
        return false;
    }
}




