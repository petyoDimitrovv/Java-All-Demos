import java.util.*;
import java.util.stream.Collectors;

public class RemoveAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");

        List<Integer> numbers = Arrays.stream(parts)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size() ; i++) {
            if(numbers.get(i) < 0){
                numbers.remove(i);
                i--;
            }

        }
        Collections.reverse(numbers);

        printList(numbers);


    }
    private static void printList(List<Integer> lines){
        for (Integer item : lines){
            System.out.print(item + " ");
        }

    }
}
