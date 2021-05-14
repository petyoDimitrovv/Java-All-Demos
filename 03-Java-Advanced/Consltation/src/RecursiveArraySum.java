import java.util.Arrays;
import java.util.Scanner;

public class RecursiveArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] n = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

      int sum =  sumArr(n, 0);
        System.out.println(sum);
    }

    private static int sumArr(int[] numb, int index) {
        if (index == numb.length - 1) {

            return numb[index];
        }
        return numb[index] + sumArr(numb, index + 1);
    }
}
