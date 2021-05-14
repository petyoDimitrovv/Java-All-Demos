import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = readIntList(scanner);
        String input = "";
        while (true) {
            input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] tokens = input.split(" ");
            if (tokens[0].equals("Delete")) {
                int numberToDelete = Integer.parseInt(tokens[1]);
                for (int i = 0; i < list.size(); i++) {


                    if (list.get(i) == numberToDelete) {
                        list.remove(Integer.valueOf(numberToDelete));
                    }
                }


            } else if (tokens[0].equals("Insert")) {
                int numberToInsert = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                if (index < list.size()) {
                    list.add(index, numberToInsert);
                }
            }
        }
        for (Integer number : list) {
            System.out.print(number + " ");

        }
    }

    private static List<Integer> readIntList(Scanner scanner) {
        List<Integer> numers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).
                        collect(Collectors.toList());
        return numers;
    }
}

