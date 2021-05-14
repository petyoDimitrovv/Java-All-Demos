import java.util.Scanner;

public class Square {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double lenght = Math.abs(x1 - x2);
        double widht = Math.abs(y1 - y2);
        double plosht = lenght * widht ;
        double perimater = 2 * (lenght + widht);

        System.out.printf("%.2f\n", plosht);
        System.out.printf("%.2f", perimater);
    }
}
