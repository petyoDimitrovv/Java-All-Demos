import java.util.Scanner;

public class Suitcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double sumCargo = 0;
        int counter = 0;
        boolean isFull = false;


        while (!input.equals("End")) {
            double cargo = Double.parseDouble(input);
            counter++;
            if (counter % 3 == 0) {
                cargo = cargo * 1.1;
                sumCargo = sumCargo + cargo;

            } else {
                sumCargo = sumCargo + cargo;
            }


            if (sumCargo > capacity) {
                isFull = true;
                break;
            }


            input = scanner.nextLine();
        }
        if (isFull) {
            System.out.println(String.format("No more space!%nStatistic: %d suitcases loaded.", counter - 1));

        } else {
            System.out.printf("Congratulations! All suitcases are loaded!%nStatistic: %d suitcases loaded.", counter);
        }

    }
}
