import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in) ;
        double yards = Double.parseDouble(scanner.nextLine());
        double price = yards * 7.61 ;
        double discount = price * 0.18 ;
        double sum = price - discount ;
        System.out.printf("The final price is: %.2f lv.\n",sum);
        System.out.printf("The discount is: %.2f lv.",discount);

    }
}
