import javax.print.attribute.standard.Finishings;
import java.util.Scanner;

public class PlodoveZelenchuci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double priceKgVeg = Double.parseDouble(scanner.nextLine());
        double priveKgFru = Double.parseDouble(scanner.nextLine());
        int allVeg = Integer.parseInt(scanner.nextLine()) ;
        int allFru = Integer.parseInt(scanner.nextLine()) ;
        double sumVeg = priceKgVeg * allVeg;
        double sumFruit = priveKgFru * allFru;
        double sumAllEU = (sumFruit + sumVeg) /1.94;
        System.out.printf("%.2f",sumAllEU);
    }
}
