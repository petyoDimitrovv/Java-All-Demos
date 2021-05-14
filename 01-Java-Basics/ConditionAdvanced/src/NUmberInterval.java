import java.util.Scanner;

public class NUmberInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number =Integer.parseInt(scanner.nextLine());

        //ot -100;100
        // i da e razlichno ot nula
        if (number >= -100 && number <=100 && number != 0  ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
