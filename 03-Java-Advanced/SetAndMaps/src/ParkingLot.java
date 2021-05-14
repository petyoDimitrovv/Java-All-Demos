import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();

        Set<String> carNumbers = new LinkedHashSet<>();

    while (!input.equals("END")) {

        String command = input.substring(0,input.indexOf(","));
        String registration = input.substring(input.indexOf(",") + 2);

        if(command.equals("IN")) {
            carNumbers.add(registration);
        }else {
            carNumbers.remove(registration);
        }


        input = scanner.nextLine();
    }

    if(carNumbers.isEmpty()){
        System.out.println("Parking Lot Is Empty");

    }
        for (String carNumber : carNumbers) {
            System.out.println(carNumber);

        }

}
}
