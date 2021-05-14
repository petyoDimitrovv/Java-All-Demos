import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        double area;
        if (shape.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            area = side * side;
            System.out.printf("%f.3", area);
        } else if (shape.equals("rectangle")) {
            double side1 = Double.parseDouble(scanner.nextLine());
            double side2 = Double.parseDouble(scanner.nextLine());
            area = side1 * side2;
            System.out.printf("%f.3", area);
        } else if (shape.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            area = radius * radius * Math.PI;
            System.out.printf("%f.3", area);
        } else if (shape.equals("triangle")) {
            double lenght = Double.parseDouble(scanner.nextLine());
            double hight = Double.parseDouble(scanner.nextLine());
            area = lenght * hight;
            System.out.printf("%f.3", area);
        }
    }
}