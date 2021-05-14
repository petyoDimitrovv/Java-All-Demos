import java.util.Scanner;

public class Holiday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double needMoney = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int days = 0;
        int daysSpend=0;

        while (money < needMoney) {
            String action = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());
            if (action.equals("save")) {
                money += price;
                days++;
                daysSpend = 0;

            } else if (action.equals("spend")) {
                daysSpend ++;
                money -= price;
                if (money <= 0){
                    money = 0;
                    days++;
                }

            } if (daysSpend == 5){
                System.out.println("You can't save the money.");
                System.out.print(days);
                break;

            }
        } if (money>= needMoney){
            System.out.printf("You saved the money for %d days.",days);
        }
    }
}
