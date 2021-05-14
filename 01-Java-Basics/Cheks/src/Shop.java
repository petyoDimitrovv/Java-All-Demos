import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double trip = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());
        double puzzlePrice = 2.60;
        int dollPrice = 3;
        double bearsPrice = 4.10;
        double minionsPrice = 8.20;
        int truckPrice = 2;

        double sum = puzzle * puzzlePrice + doll * dollPrice + bears * bearsPrice + minions * minionsPrice + truck * truckPrice;

        int numberOfToys = puzzle + doll + bears + minions + truck;

        if (numberOfToys >= 50) {
            double discount = sum * 0.25;
            sum = sum - discount;
        }

        double rent = sum * 0.1;
        double income = sum - rent;

        if (income >= trip) {
            double spare = income - trip;
            System.out.printf("Yes! %.2f lv left.", spare);
        } else {
            double notEnough = trip - income;
            System.out.printf("Not enough money! %.2f lv needed.", notEnough);
        }
    }

}
