import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mouths = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double priceApartment = 0;
        double priceStudio = 0;

        if (mouths.equals("May") || mouths.equals("Oktober")) {
            if (nights <= 14) {
                priceApartment = nights * 65;
            } else {
                priceApartment = (nights * 65) * 0.9;
            }
            if (nights <= 7) {
                priceStudio = nights * 50;
            } else if (nights > 7 && nights <= 14) {
                priceStudio = (nights * 50) * 0.95;
            } else if (nights > 14) {
                priceStudio = (nights * 50) * 0.7;
            }

        }
        if (mouths.equals("June") || mouths.equals("September")) {
            if (nights <= 14) {
                priceApartment = nights * 68.7;
            } else {
                priceApartment = (nights * 68.7) * 0.9;
            }
            if (nights <= 14) {
                priceStudio = nights * 75.2;
            } else if (nights > 14) {
                priceStudio = (nights * 75.2) * 0.8;
            }
        }
        if (mouths.equals("July") || mouths.equals("August")) {
            priceStudio = nights * 76;

            if (nights <= 14) {
                priceApartment = nights * 77;
            } else {
                priceApartment = (nights * 77) * 0.9;
            }
        }
            System.out.printf("Apartment: %.2f lv.%n", priceApartment);
            System.out.printf("Studio: %.2f lv.",priceStudio);
    }
}
