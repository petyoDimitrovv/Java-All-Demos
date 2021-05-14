import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Lootbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] lineOfNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        //this is QUEUE
        ArrayDeque<Integer> queuqFirstBox = new ArrayDeque<>();

        for (int num : lineOfNumbers) {
            queuqFirstBox.offer(num);

        }
        lineOfNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        //This is the Stack

        ArrayDeque<Integer> stackSecondBox = new ArrayDeque<>();

        for (Integer num : lineOfNumbers) {
            stackSecondBox.push(num);

        }

        int collectedItems = 0;


        while (!queuqFirstBox.isEmpty() && !stackSecondBox.isEmpty()) {
            int item = queuqFirstBox.peek() + stackSecondBox.peek();

            if (item % 2 == 0) {
                collectedItems += item;
                queuqFirstBox.poll();
                stackSecondBox.pop();

            } else {
                int numberToRemove;
               numberToRemove = stackSecondBox.peek();
               stackSecondBox.pop();
               queuqFirstBox.offer(numberToRemove);


            }

        }
        if(queuqFirstBox.isEmpty()){
            System.out.println("First lootbox is empty");
        }else {
            System.out.println("Second lootbox is empty");
        }
        if (collectedItems >= 100){
            System.out.println("Your loot was epic! Value: " + collectedItems);
        }else {
            System.out.println("Your loot was poor... Value: " + collectedItems);
        }
    }
}