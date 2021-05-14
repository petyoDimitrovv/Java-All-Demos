import java.util.Scanner;

public class NewHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int pieces = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price =0;
        if ("Roses.".equals(flowers)) {
            if (pieces > 80) {
                price = pieces * 5 * 0.1;

            } else {
                price = pieces * 5;
            }
        } else if ("Dahlias".equals(flowers)) {
            if (pieces > 90) {
                price = pieces * 3.8 * 0.15;

            } else {
                price = pieces * 3.8;
            }
        } else if ("Tulips".equals(flowers)) {
            if (pieces > 80) {
                price = pieces * 2.8 * 0.15;

            } else {
                price = pieces * 2.8;
            }
        } else if ("Narcissus".equals(flowers)) {
            if (pieces > 120) {
                price = pieces * 3 * 0.15;

            } else {
                price = pieces * 3;
            }
        } else if ("Gladiolus".equals(flowers)) {
            if (pieces > 80) {
                price = pieces * 2.5 * 0.2;

            } else {
                price = pieces * 2.5;
            }
        }
        if (price > budget) {
            double needMOney = price - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", needMOney);

        } else {
            double moreMoney = budget - price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", pieces, flowers, moreMoney);

        }


    }
}
