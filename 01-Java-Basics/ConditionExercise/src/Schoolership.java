import java.util.Scanner;

public class Schoolership {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());
        ;
        double minSellary = Double.parseDouble(scanner.nextLine());
        double socScoolarship = minSellary * 0.35;
        double greatScoolarship = 25 * averageGrade;
        // izchilseniq
        //1.socialna ili stipendiq za uspeh

        if (averageGrade <= 4.50) {
            System.out.println("You cannot get a scholarship!");

        } else if (averageGrade > 4.5 && averageGrade < 5.5) {
            if (income < minSellary) {
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socScoolarship));
            } else {
                System.out.println("You cannot get a scholarship!");

            }
        } else if (averageGrade >= 5.50) {
            if (income < minSellary) {
                if (socScoolarship > greatScoolarship) {
                    System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socScoolarship));
                } else {
                    System.out.printf("You get a scholarship for excellent result %.0f BGN",Math.floor(greatScoolarship));
                                    }
            } else { System.out.printf("You get a scholarship for excellent result %.0f BGN",Math.floor(greatScoolarship));


            }

        }

    }
}
