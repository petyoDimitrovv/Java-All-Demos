import java.util.Scanner;

public class TheatrPromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        switch (dayType) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    System.out.println("12$");
                } else if (age > 64 && age <= 122) {
                    System.out.println("12$");
                } else System.out.println("18$");
                break;
            case "Weekend":
                break;
            case "Holiday":
                break;


        }
    }
}

