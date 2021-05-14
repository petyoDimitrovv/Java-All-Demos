import java.util.Scanner;

public class SumSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumPrimeNumb = 0;
        int nonPrimeNUmb = 0;


        while (true) {
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
            } else {
                boolean isPrime = true;
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;

                    }

                }
                if (isPrime) {
                    sumPrimeNumb += number;

                } else {
                    nonPrimeNUmb += number;
                }
            }
        }
        System.out.printf("Sum of all prime numbers is: %d%n",sumPrimeNumb);
        System.out.printf("Sum of all non prime numbers is: %d%n",nonPrimeNUmb);
    }
}
