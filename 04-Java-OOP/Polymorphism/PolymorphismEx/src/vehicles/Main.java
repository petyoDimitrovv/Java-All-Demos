package vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] carInfo = scanner.nextLine().split("\\s+");
        String[] truckInfo = scanner.nextLine().split("\\s+");
        String[] busInfo = scanner.nextLine().split("\\s+");

        Vehicle car = new Car(Double.parseDouble(carInfo[1]),
                Double.parseDouble(carInfo[2]), Double.parseDouble(carInfo[3]));
        Vehicle truck = new Truck(Double.parseDouble(truckInfo[1]),
                Double.parseDouble(truckInfo[2]), Double.parseDouble(truckInfo[3]));
        Vehicle bus = new Bus(Double.parseDouble(busInfo[1]),
                Double.parseDouble(busInfo[2]), Double.parseDouble(busInfo[3]));


        int n = Integer.parseInt(scanner.nextLine());


        while (n-- > 0) {
            String[] command = scanner.nextLine().split("\\s+");

            if ("Drive".equals(command[0])) {
                if (command[1].equals("Car")) {
                    car.drivenDistance(Double.parseDouble(command[2]));

                } else {
                    truck.drivenDistance(Double.parseDouble(command[2]));
                }
            } else if ("Refuel".equals(command[0])) {
                if (command[1].equals("Car")) {
                    car.refuel(Double.parseDouble(command[2]));
                } else if (command[1].equals("Truck")) {
                    truck.refuel(Double.parseDouble(command[2]));
                } else {
                    bus.refuel(Double.parseDouble(command[2]));
                }
            } else if ("DriveEmpty".equals(command[0])) {

                bus.drivenDistance(Double.parseDouble(command[2]));
            }
//            } else{
//                bus.drivenDistance(Double.parseDouble(command[2]));
//
//            }
//
//        }
//        System.out.println(car);
//        System.out.println(truck);
//        System.out.println(bus);

        }
    }
}

