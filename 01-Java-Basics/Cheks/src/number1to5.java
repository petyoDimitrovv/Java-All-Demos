import java.util.Scanner;

public class number1to5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = Integer.parseInt(scanner.nextLine());
        if (numb == 1) {
            System.out.println("one");
        } else if (numb == 2) {
            System.out.println("two");
        } else if (numb == 3) {
            System.out.println("three");
        } else if (numb == 4) {
            System.out.println("four");
        } else if (numb == 5) {
            System.out.println("five");

        } else if (numb >= 5) {
            System.out.println("number too big");
        }
    }
}