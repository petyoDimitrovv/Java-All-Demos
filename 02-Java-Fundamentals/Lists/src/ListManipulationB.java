import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        List<Integer> number = Arrays.stream(scanner.nextLine().
                split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            String commands = scanner.nextLine();
            if (commands.equals("end")) {
                break;

            }
            String[] currentCommand = commands.split(" ");
            switch (currentCommand[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(currentCommand[1]);
                    number.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(currentCommand[1]);
                    int indextoInsert = Integer.parseInt(currentCommand[2]);
                    number.add(indextoInsert, numberToInsert);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(currentCommand[1]);
                    number.remove(numberToRemove);
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(currentCommand[1]);
                    number.remove(indexToRemove);
                    break;

            }

        }printList(number);
    }

    private static void printList(List<Integer> lines) {
        for (Integer item : lines) {
            System.out.print(item + " ");
        }
    }
}

