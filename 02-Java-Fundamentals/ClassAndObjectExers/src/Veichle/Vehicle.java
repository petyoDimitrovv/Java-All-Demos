package Veichle;

public class Vehicle {

    private String typeOfVehicle;
    private String brandOfVehicle;
    private String colorOfVehicle;
    private int powerOfVehicle;
    //конструктор=>

    public Vehicle(String typeOfVehicle, String brandOfVehicle,
                   String colorOfVehicle, int powerOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
        this.brandOfVehicle = brandOfVehicle;
        this.colorOfVehicle = colorOfVehicle;
        this.powerOfVehicle = powerOfVehicle;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public String getColorOfVehicle() {
        return colorOfVehicle;
    }

    public int getPowerOfVehicle() {
        return powerOfVehicle;
    }

    public String getBrandOfVehicle() {
        return brandOfVehicle;
    }

    @Override
    public String toString(){
        return String.format("Type: %s\n" +
                "Model: %s\n" +
                "Color: %s\n" +
                "Horsepower: %d\n",this.typeOfVehicle, this.brandOfVehicle,
                this.colorOfVehicle, this.powerOfVehicle);
    }

}
