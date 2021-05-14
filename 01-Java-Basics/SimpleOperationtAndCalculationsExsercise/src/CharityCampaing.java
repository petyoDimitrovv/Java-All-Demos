import java.util.Scanner;

public class CharityCampaing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int confectioner = Integer.parseInt(scanner.nextLine());
        int cackes = Integer.parseInt(scanner.nextLine());
        int gofreti = Integer.parseInt(scanner.nextLine());
        int panckaces = Integer.parseInt(scanner.nextLine());
        double sumCackes = cackes * 45;
        double sumGofreti = gofreti * 5.80;
        double sumPanckaces = panckaces * 3.20;
        double sumAllOneDay = (sumCackes + sumGofreti + sumPanckaces) * confectioner;
        double sumAllCompaing = sumAllOneDay * days;
        double sumafterAll = sumAllCompaing - (0.125 * sumAllCompaing);
        System.out.printf("%.2f", sumafterAll);
    }
}
