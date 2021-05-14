import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> numbs = new ArrayDeque<>();

        int numberToPush = scanner.nextInt();
        int numberToPop = scanner.nextInt();
        int numberToLookUp = scanner.nextInt();

        scanner.nextLine();




        for (int i = 0; i < numberToPush ; i++) {
            numbs.push(scanner.nextInt());
        }
        for (int i = 0; i < numberToPop ; i++) {
            numbs.pop();
        }
        if (numbs.contains(numberToLookUp)) {
            System.out.println("true");
        } else {
            if (!numbs.isEmpty()) {
                System.out.println(Collections.min(numbs));
            }
        }
    }
}
