import java.util.Scanner;

public class Trapec {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine()) ;
        int b = Integer.parseInt(scanner.nextLine()) ;
        double area = a * b /2.0 ;
        System.out.printf("%.2f",area);

    }
}