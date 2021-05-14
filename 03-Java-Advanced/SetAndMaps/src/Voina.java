import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int rounds = 50;

        while (rounds-- >  0){
            Iterator<Integer> firstIter = firstPlayer.iterator();
            int firstCard = firstIter.next();
            firstIter.remove();
            Iterator<Integer> secondIter = secondPlayer.iterator();
            int secondCard = secondIter.next();
            secondIter.remove();

            if (firstCard > secondCard){
                firstPlayer.addAll(Arrays.asList (firstCard, secondCard));
            }else if ( firstCard < secondCard) {
                secondPlayer.addAll(Arrays.asList (firstCard, secondCard));
            }

            if(firstPlayer.isEmpty() || secondPlayer.isEmpty()){
                break;
            }

        }
        String output = "Draw!";
        if(firstPlayer.size() > secondPlayer.size()){
            output = "First Player Win!";
        }else  if (firstPlayer.size() < secondPlayer.size()){
            output = "Second Player Win!";

        }
        System.out.println(output);
    }
}
