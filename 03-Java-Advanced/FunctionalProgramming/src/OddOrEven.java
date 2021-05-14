import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String comand = scanner.nextLine();
        Predicate <Integer> evenNumbs = numb -> numb % 2 == 0;
        Predicate <Integer> oddNumbs = numb -> numb % 2 == 1;

        for (int i = numbers[0]; i < numbers[1] + 1 ; i++) {
            if comand.equals("odd"){
                System.out.println();
            }
        }


    }
}
