import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombaBomba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = readListInt(scanner);
        String[] tokens = scanner.nextLine().split(" ");
        int number = Integer.parseInt(tokens[0]);
        int power = Integer.parseInt(tokens[1]);

        while (numbers.contains(number)){
            int bombIndes = numbers.indexOf(number);

            int leftBound = Math.max(bombIndes - power, 0);
            int rightBound = Math.min(bombIndes + power, numbers.size()-1);
            for (int i = rightBound; i >= leftBound ; i--) {
                numbers.remove(i);

            }
        }
        int sum = 0;
        for (Integer sumchi : numbers) {
            sum +=sumchi;

        }
        System.out.println(sum);
    }

    private static List<Integer> readListInt(Scanner scanner) {
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
return numbers;
    }
}
