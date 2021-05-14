import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();


        while (!destination.equals("End"))
        {
            double budget = Double.parseDouble(scanner.nextLine());

            while (budget > 0) {
                double deposit = Double.parseDouble(scanner.nextLine());
                budget -= deposit;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}