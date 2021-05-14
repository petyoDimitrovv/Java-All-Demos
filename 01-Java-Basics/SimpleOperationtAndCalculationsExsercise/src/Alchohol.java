import java.util.Scanner;
import java.util.function.DoublePredicate;

public class Alchohol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double whiskey = Double.parseDouble(scanner.nextLine());
        double beer = Double.parseDouble(scanner.nextLine());
        double wine = Double.parseDouble(scanner.nextLine());
        double raki = Double.parseDouble(scanner.nextLine());
        double whiskeyLiter = Double.parseDouble(scanner.nextLine());
        double priceRaki = whiskey * 0.5;
        double priceWinePerL = priceRaki - (0.4 * priceRaki);
        double priveBeerPerL = priceRaki - (0.8 * priceRaki);
        double sumRaki = raki * priceRaki;
        double sumWine = wine * priceWinePerL ;
        double sumBeer = beer * priveBeerPerL ;
        double sumWiskey = whiskeyLiter * whiskey ;
        double sumAll = sumRaki + sumWine + sumWiskey + sumBeer ;
        System.out.printf("%.2f", sumAll);
    }
}
