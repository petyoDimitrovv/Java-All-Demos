import java.util.Scanner;

public class multiplication11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int timesMultiplication = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = timesMultiplication; i <= 10; i++) {
            sum = number * i;
            System.out.printf("%d X %d = %d%n", number, i, sum);


        }
        if (timesMultiplication > 10) {
            sum = number * timesMultiplication;
            System.out.printf("%d X %d = %d%n", number, timesMultiplication, sum);
        }
    }
}
