import java.util.Scanner;

public class PointsBetweenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        char symbol = scanner.nextLine().charAt(0);
        //„+“, „-“, „*“, „/“, „%“
        switch (symbol) {
            case ('+'):
                int sybirane = number1 + number2;
                if (sybirane % 2 == 0) {
                    System.out.printf("%d %c %d = %d - even ", number1, symbol, number2, sybirane);
                } else {
                    System.out.printf("%d %c %d = %d - odd ", number1, symbol, number2, sybirane);
                }
                break;
            case ('-'):
                int izvajdane = number1 - number2;
                if (izvajdane % 2 == 0) {
                    System.out.printf("%d %c %d = %d - even ", number1, symbol, number2, izvajdane);
                } else {
                    System.out.printf("%d %c %d = %d - odd ", number1, symbol, number2, izvajdane);
                }
                break;
            case ('*'):
                int umnojenie = number1 * number2;
                if (umnojenie % 2 == 0) {
                    System.out.printf("%d %c %d = %d - even ", number1, symbol, number2, umnojenie);
                } else {
                    System.out.printf("%d %c %d = %d - odd ", number1, symbol, number2, umnojenie);
                }
                break;
            case ('/'):
                double delenie = number1 * 1.0 / number2;
                if (number2 == 0) {
                    System.out.printf("Cannot divide %d by zero", number1);
                } else {
                    System.out.printf("%d %c %d = %.2f ", number1, symbol, number2, delenie);
                }
                break;
            case ('%'):
                if (number2 == 0) {
                    System.out.printf("Cannot divide %d by zero", number1);
                } else {
                    int delenieOstatyk = number1 % number2;
                    System.out.printf("%d %c %d = %d ", number1, symbol, number2, delenieOstatyk);
                }
                break;


        }

    }
}
