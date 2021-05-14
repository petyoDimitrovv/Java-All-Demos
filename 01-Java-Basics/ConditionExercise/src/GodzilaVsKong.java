import java.util.Scanner;

public class GodzilaVsKong {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         double budget = Double.parseDouble(scanner.nextLine());
         int coutStatists = Integer.parseInt(scanner.nextLine());
         double pricePerStatis = Double.parseDouble(scanner.nextLine());
         // 1. smqtame dekora = 10 % ot budgeta
        //2. smqtame oblekoto = statistite * cena na kostum za statist
        //3. ako ima poveche ot 150 statista pravim 10% otstupka
        //4.smqtame obshtiq razhod za filma
        //5. smqtame kolko pari ostavat i izpisvame
        double priseDekor = budget * 0.1;
        double priceDress = coutStatists * pricePerStatis;

        if (coutStatists > 150) {
            priceDress = priceDress - 0.1 * priceDress ;
        }
        double moviePrice = priseDekor + priceDress;
                //ako parite sa dostauchno izpisvame
         if (moviePrice > budget) {
             System.out.println("Not enough money!");
             double needMoney = moviePrice - budget ;
             System.out.printf("Wingard needs %.2f leva more.",needMoney);
         } else {
            System.out.println("Action!");
            double leftMOney = budget - moviePrice;
             System.out.printf("Wingard starts filming with %.2f leva left.",leftMOney);
         }
    }
}
