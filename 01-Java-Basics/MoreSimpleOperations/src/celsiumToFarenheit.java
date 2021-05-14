import java.util.Scanner;

public class celsiumToFarenheit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double celsium = Double.parseDouble(scanner.nextLine()) ;
        double farenhait = celsium * 1.8 + 32;
        System.out.printf("%.2f",farenhait);
    }
}
