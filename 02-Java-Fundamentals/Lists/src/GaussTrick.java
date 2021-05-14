import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.String.join;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputNumbers = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < inputNumbers.length; i++) {
            int current = Integer.parseInt(inputNumbers[i]); // за по добър код
            numbers.add(current);

        }
        // Горния израз може да заменим с
        // List<Integer> numbers = Arrays.stream(inputNumbers)
        //                .map(Integer::parseInt)
        //                .collect(Collectors.toList());
        int iterationCount = numbers.size() / 2;
        for (int i = 0; i < iterationCount; i++) {
            int lastIndex = numbers.size() - 1;
            int currentSum = numbers.get(i) + numbers.get(lastIndex ); // вземаме последния
            //индекс защото примерно size е 5 и ми трябва индекс 4 !!!
             numbers.remove(lastIndex);
             numbers.set(i , currentSum);
            
        }
        for (Integer number : numbers){
            System.out.print(number + " ");
        }
    }
}
