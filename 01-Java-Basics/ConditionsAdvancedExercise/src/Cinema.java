import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int colums = Integer.parseInt(scanner.nextLine());
        double income = 0;
        if ("Premiere".equals(type)) {
            income = row * colums * 12;
        } else if ("Normal".equals(type)) {
            income = row * colums * 7.5;
        }else if ("Discount".equals(type)){
            income = row * colums * 5;
        }
        System.out.printf("%.2f leva",income);
    }
}
