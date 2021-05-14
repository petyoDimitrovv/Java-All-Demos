import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class divisibleByN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt )
                .collect(Collectors.toList());
        Collections.reverse(numbers);



        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(numbers.stream()
                .filter(e -> e % n != 0)
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }


}
