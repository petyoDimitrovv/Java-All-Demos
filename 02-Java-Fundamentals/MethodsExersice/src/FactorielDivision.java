import java.util.Scanner;

public class FactorielDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scanner.nextLine()); 
        double secondNumber = Double.parseDouble(scanner.nextLine());
        double result = division(firstNumber, secondNumber);
        System.out.println(String.format("%.2f",result));
    }

    private static double division(double num1, double num2) {
        double firstFactorial = findFactorial(num1);
        double secondFactorila = findFactorial(num2);
        double result = firstFactorial / secondFactorila;
        return result;
    }

    private static double findFactorial(double number) {
        double result = 1;
        for (int i = 1; i <=number ; i++) {
            result *= i;


        }
        return result;
    }
}
