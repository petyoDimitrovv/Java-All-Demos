import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> number = new ArrayDeque<>();

        for (int element : input) {
            number.push(element);
        }

        for (Integer numb : number) {
            System.out.print(numb + " ");
        }



    }
}
