import java.util.Scanner;

public class BonusPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = Integer.parseInt(scanner.nextLine());
        double bonusP = 0;
        if (numb <= 100) {
            bonusP = 5;
        } else if (numb <= 1000) {
            bonusP = 0.2 * numb;
        }  else {
            bonusP = 0.1 * numb ;
        } if (numb % 2 == 0) {
            bonusP = bonusP + 1;
        }
        if (numb % 10 == 5) {
            bonusP += 2;

        }
        System.out.println(bonusP);
        System.out.println(numb + bonusP);

    }
}
