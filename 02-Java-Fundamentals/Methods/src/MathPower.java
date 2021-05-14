import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Integer.parseInt(scanner.nextLine());
        double power = Integer.parseInt(scanner.nextLine());
        double result = GetResult(number, power);
        System.out.println(result);
    }

    private static double GetResult(double number, double power) {
        return (Math.pow(number,power));
    }

}
