import java.util.Scanner;

public class SavesMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        int remainingMout = Integer.parseInt(scanner.nextLine());
        double bils = Double.parseDouble(scanner.nextLine());
         double moneyForBils = 0.3 * income;
         double savedMoney = income - (bils + moneyForBils);
         double moneyForAllPeriod = remainingMout * savedMoney;
         double percentMoney = (savedMoney/income)*100;
        System.out.printf("She can save %.2f%% %.2f",percentMoney,moneyForAllPeriod );


    }
}
