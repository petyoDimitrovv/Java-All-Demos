package Veichle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        String input = scanner.nextLine();
        while (!"End".equals(input)){
           String[] token = input.split("\\s+");
           String type = token[0];
           String model = token[1];
           String color = token[2];
           int horsePower = Integer.parseInt(token[3]);
           Vehicle vehicle;
           if ("car".equals(type)){
               vehicle = new Vehicle("Car", model, color, horsePower);
           }else {
               vehicle = new Vehicle("Truck", model, color, horsePower);
           }
           vehicles.add(vehicle);


            input=scanner.nextLine();
        }
        String model = scanner.nextLine();
        while (!"Close the Catalogue".equals(model)){
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getBrandOfVehicle().equals(model)){
                    System.out.println(vehicle);
                    break;

                }
                
            }
            model = scanner.nextLine();
        }
        double carHP = printHorsePower(vehicles, "Car");
        System.out.println(String.format("Cars have average horsepower of: %.2f.",carHP));
        double truckHP = printHorsePower(vehicles, "Truck");
        System.out.println(String.format("Truck have average horsepower of: %.2f.",truckHP));

    }

    private static double printHorsePower(ArrayList<Vehicle> vehicles, String type) {
    double sum = 0.0;
    int counter = 0;
        for (Vehicle vehicle : vehicles) {
            if(vehicle.getTypeOfVehicle().equals(type)){
                sum += vehicle.getPowerOfVehicle();
                counter++ ;
            }

        }
        if (counter == 0) {
            return 0;
        }
        return sum / counter;
    }
}
