import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = Integer.parseInt(scanner.nextLine());
        if (numb % 2==0) {
            System.out.println("even");

        }
        else {
            System.out.println("odd");
        }

    }
}
