import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CharacterOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<Character, Integer> charWithOrder = new TreeMap<>
                ((f,s)-> f.compareTo(s));

        for (char symbol : input.toCharArray()) {
            charWithOrder.putIfAbsent(symbol, 0);
            charWithOrder.put(symbol, charWithOrder.get(symbol) + 1);
        }
        System.out.println(charWithOrder.entrySet()
                .stream()
                .map(e -> String.format("%c: %d time/s", e.getKey(), e.getValue()))
                .collect(Collectors.joining(System.lineSeparator())));

    }
}
