import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = readIntList(scanner);

        String input = "";

        while (true) {
            input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] token = input.split(" ");
            if (token[0].equals("Contains")) {
                int numberToContai = Integer.parseInt(token[1]);

                if (list.contains(numberToContai)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (token[0].equals("Print")) {
                if (token[1].equals("even")) {
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) % 2 == 0) {
                            System.out.print(list.get(i) + " ");
                        }
                    }

                } else if (token[1].equals("odd")) {
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) % 2 != 0) {
                            System.out.print(list.get(i) + " ");
                        }
                    }
                }
            }
            System.out.println();

                if(token[0].equals("Get")){
                    int sum = 0;
                    for (int i = 0; i <list.size() ; i++) {
                        int crntNum = list.get(i);
                        sum += crntNum;

                    }
                    System.out.println(sum);

                }


        }
    }

    private static List<Integer> readIntList(Scanner scanner) {
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return numbers;
    }
}





