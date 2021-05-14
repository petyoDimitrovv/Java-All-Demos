import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DemoTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String values = scanner.nextLine();
        List<String> input = Arrays.stream(values.split(" "))
                .collect(Collectors.toList());
        List<Integer> numbs = new ArrayList<>();
        for (int i = 0; i < input.size() ; i++) {
            numbs.add(Integer.parseInt(input.get(i)));
            

        }

        }
    }
