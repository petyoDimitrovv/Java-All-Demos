import java.util.Scanner;
import java.util.function.DoubleFunction;

public class TailoringWorkshop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tables = Integer.parseInt(scanner.nextLine());
        double lenghtTables = Double.parseDouble(scanner.nextLine());
        double widthTables = Double.parseDouble(scanner.nextLine());
        double lenghtPlates = tables * (lenghtTables + 2 * 0.30) * (widthTables + 0.30 * 2);
        double leghtKare = tables * (lenghtTables / 2) * (lenghtTables / 2);
        double USD = lenghtPlates * 7 + leghtKare * 9;
        double BGN = USD * 1.85 ;
        System.out.printf("%.2f USD %n",USD);
        System.out.printf("%.2f BGN",BGN);
    }
}
