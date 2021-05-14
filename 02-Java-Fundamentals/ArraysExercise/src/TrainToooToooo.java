import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TrainToooToooo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] train = new int[n];
        for (int i = 0; i <train.length ; i++) {
            train[i]=Integer.parseInt(scanner.nextLine());

        }
        int sum = 0;
        for (int i = 0; i < train.length; i++) {
            int wagon = train[i];
            sum += wagon;
            System.out.print(wagon + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
