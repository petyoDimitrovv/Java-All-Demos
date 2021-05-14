import java.util.*;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> first = readList(scanner);
        List<Integer> second = readList(scanner);

        List<Integer> result = new ArrayList<>();

        // Може и с for (int i = 0; i < first.size() && i < second.size() ; i++) {


        int i = 0;
        while (i < first.size() && i < second.size()) {
            result.add(first.get(i));
            result.add((second.get(i)));
            i++;
        }
        // Сега трябва да направим така че след като в единия масив останат още цифри
        // да се заредят в листа result като това са следващите цифри от индекс i ->
        if (i < first.size()) {
            result.addAll(getLeftovers(first , i));// addAll добавя всички елементи които
            //присъстват в друг списък

        } else if (i < second.size()) {
            result.addAll(getLeftovers(second,i));

        }

        for (Integer number : result) {
            System.out.print(number + " ");
        }


    }
    private static List<Integer> getLeftovers(List<Integer> first, int afterIndex) {
        List<Integer> result = new ArrayList<>();
        for (int j = afterIndex; j < first.size(); j++) {
            result.add(first.get(j));
        }
        return result;
    }





    private static List<Integer> readList(Scanner scanner) {
        String[] split = scanner.nextLine().split(" ");
        List<Integer> result =
                Arrays.stream(split)
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        return result;
    }
}
