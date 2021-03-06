import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomComperator {

    public static BiPredicate<Integer, Integer> predicate = (f, s) -> f % s == 0 ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

            chekNumbers(1 , numbers, n);
    }

    private static void chekNumbers(int num, Set<Integer> numbers, int n) {
        if(num > n ){
            return;
        }
        boolean isValid = true;
        for (Integer number : numbers) {
            if (!predicate.test(num, number)){
                isValid = false;
                break;
            }
        }
        if(isValid){
            System.out.print(num + " ");
        }
        chekNumbers(num +1, numbers, n);
    }
}
