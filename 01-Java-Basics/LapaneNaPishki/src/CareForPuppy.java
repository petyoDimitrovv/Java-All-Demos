import java.util.Scanner;

public class CareForPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogsFoodInKg = Integer.parseInt(scanner.nextLine()) * 1000;
        int consumeFood = 0;
        String command = scanner.nextLine();

        while (!command.equals("Adopted")) {

            consumeFood = consumeFood + Integer.parseInt(command);
            command = scanner.nextLine();

            }if (consumeFood > dogsFoodInKg) {
            int needFood = consumeFood - dogsFoodInKg;
            System.out.printf("Food is not enough. You need %d grams more.", needFood);

        } else {
            int moreFood = dogsFoodInKg - consumeFood;
            System.out.printf("Food is enough! Leftovers: %d grams.", moreFood);

        }


    }
}

