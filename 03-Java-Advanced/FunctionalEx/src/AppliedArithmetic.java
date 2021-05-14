import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    private static List<Integer> numbers;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        Map<String, Function<List<Integer>, List<Integer>>> functionMap = new HashMap<>();

        functionMap.put("add", e -> {
            return e.stream()
                    .map(val -> val + 1)
                    .collect(Collectors.toList());
        });
        functionMap.put("multiply", e -> {
            return e.stream()
                    .map(val -> val * 2)
                    .collect(Collectors.toList());
        });
        functionMap.put("subtract", e -> {
            return e.stream()
                    .map(val -> val - 1)
                    .collect(Collectors.toList());
        });
        functionMap.put("print", e -> {
            return e.stream()
                    .peek(val -> System.out.print(val + " "))
                    .collect(Collectors.toList());
        });
        handleInput(functionMap, scanner, input);


    }

    private static void handleInput(Map<String, Function<List<Integer>, List<Integer>>> functionMap, Scanner scanner, String input) {
        if (input.equals("end")) {
            return;
        }
        numbers = functionMap.get(input).apply(numbers);
        if (input.equals("print")) {
            System.out.println();
        }
        input = scanner.nextLine();

        handleInput(functionMap, scanner, input);
    }
}
