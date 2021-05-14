import java.util.Scanner;

public class backFromFuture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritance = Double.parseDouble(scanner.nextLine());;
        int yearsInPast = Integer.parseInt(scanner.nextLine());


        int ageIvan = 18;
        //
        for (int year = 1800; year <= yearsInPast; year++) {
            if (year % 2 == 0) {
                inheritance = inheritance - 12000;
            } else {
                inheritance = inheritance - (1200 + (ageIvan * 50));
                ageIvan++;
            }
        } if (inheritance >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",inheritance);

        } else {

            System.out.printf("He will need $.2f dollars to survive.", Math.abs(inheritance));

        }
    }

}
