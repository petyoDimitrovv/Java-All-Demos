import java.util.Scanner;

public class MagicalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int magicalnumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isValid = false;

        for (int i = a; i <= b; i++) {

            for (int j = a; j <= b; j++) {
                counter++;
                if (i + j == magicalnumber) {

                    System.out.printf("Combination N:%d (%d + %d = %d)%n", counter, i, j, magicalnumber);
                    isValid = true;
                    break;
                }
            } if (isValid){
            break;}
        }
        if (!isValid) {
            System.out.printf("%d combinations - neither equals %d", counter, magicalnumber);
        }
    }
}
