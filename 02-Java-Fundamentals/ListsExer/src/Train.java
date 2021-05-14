import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                List<Integer> train = readList(scanner);
        int waggonCapacity = Integer.parseInt(scanner.nextLine());

        String command = "";
        while (true){
            command = scanner.nextLine();
            if (command.equals("end")){
                break;
            }
            String[] token = command.split(" ");
            if(token[0].equals("Add")){
                int people = Integer.parseInt(token[1]);
                train.add(people);
            } else{
                int people = Integer.parseInt(token[0]);
                for (int i = 0; i < train.size() ; i++) {
                    int currentWagoon = train.get(i);
                    int totalCnt = currentWagoon + people;
                    if (totalCnt <= waggonCapacity ){
                        train.set(i, totalCnt);
                        break;
                    }
                }
            }
        }
        printTrain(train);


        }


    private static void printTrain(List<Integer> train) {
        for (int wagoon : train) {
            System.out.print(wagoon + " ");
        }
    }

    private static List<Integer> readList(Scanner scanner) {
        List<Integer> number = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return number;
    }

}
