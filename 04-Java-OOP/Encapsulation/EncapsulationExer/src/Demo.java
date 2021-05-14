import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       int[] numbs = Arrays.stream(scanner.nextLine().split(", "))
               .mapToInt(Integer::parseInt)
               .toArray();
       int sum = 0;
        for (int i = 0; i < numbs.length - 1 ; i = i + 2) {
            for (int j = i; j < i + 1 ; j++) {
                sum = i * j;
            System.out.println();
            }

        }
    }
}
