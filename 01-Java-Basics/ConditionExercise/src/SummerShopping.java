import java.util.Scanner;

public class SummerShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input neshta za Ani koito shte pazaruva
        //budjeta na ani ,cena havliq , otstypka
        int budget = Integer.parseInt(scanner.nextLine());
        double priceHavliq = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        //cena na chadur 2/3 ot cena na havliq
        //cena djapanki e 75% ot chadur
        //cena plajnachanta = 1/3 ot djapanki + havliq
        // obshta suma - otsupka
        double priceUmbrella = Math.abs(2.0 / 3.0) *(priceHavliq);
        double priceFlipFlop = 0.75 * priceUmbrella;
        double priceBag = Math.abs(1.0 / 3.0) *(priceFlipFlop + priceHavliq);
        double sumAll = priceHavliq + priceBag + priceFlipFlop + priceUmbrella;
        double sumAfterDiscount = sumAll - (sumAll * 0.05);
         if (budget >= sumAfterDiscount) {
             System.out.printf("Annie's sum is %.2f.", sumAfterDiscount);
             double haveMoney = budget - sumAfterDiscount;
             System.out.printf("She has %.2f lv. left.", haveMoney);
         } else if (budget < sumAfterDiscount) {
             System.out.printf("Annie's sum is %.2f.", sumAfterDiscount);
             double needMOney = sumAfterDiscount - budget;
             System.out.printf("She needs %.2f lv. more.", needMOney);
         }
         }
}
