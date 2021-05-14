import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> numbs = new ArrayDeque<>();

        int numberToOffer= scanner.nextInt();
        int numberToPoll = scanner.nextInt();
        int numberToLookUp = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < numberToOffer ; i++) {
            numbs.offer(scanner.nextInt());

        }
        for (int i = 0; i <numberToPoll; i++) {
            numbs.poll();
        }
        if(numbs.contains(numberToLookUp)){
            System.out.println("true");
        }else{
            numbs.stream()
                    .min(Integer::compareTo)
                    .orElse(0);
        }

    }
}
