import java.util.Scanner;

public class LilisBirthdays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingM = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        int lylyMoney = 0;
        int lylyToys = 0;
        int m = 0;
        int n = 0;
        for (int i = 1; i <= age; i++) {
            int currentYears = i;
            if (currentYears % 2 == 0) {
                m += 10;
                lylyMoney = lylyMoney + m;
                n++;
                //

            } else if (currentYears % 2 != 0) {

                lylyToys++;

            }


        }
        double totalMoney = (lylyToys * priceToy) + (lylyMoney - n);
        if (totalMoney > priceWashingM) {
            double haveMoney = Math.abs(totalMoney - priceWashingM);
            System.out.printf("Yes! %.2f", haveMoney);
        } else {
            double needMoney = Math.abs(priceWashingM - totalMoney);
            System.out.printf("No! %.2f", needMoney);
        }
    }
}
