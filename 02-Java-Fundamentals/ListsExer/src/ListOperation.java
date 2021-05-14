import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = readIntList(scanner);
        String input = "";
        while (true) {
            input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] token = input.split("\\s+");
            String command = token[0];
            switch (command) {
                case "Add":
                    int elementToAdd = Integer.parseInt(token[1]);
                    numbers.add(elementToAdd);

                    break;
                case "Insert":{
                    int numberToAdd = Integer.parseInt(token[1]);
                    int index = Integer.parseInt(token[2]);
                    if (isValidIndes(index,numbers)) {
                    numbers.add(index, numberToAdd);
                }else {
                    System.out.println("Invalid index");
                }
                }
                    break;
                case "Remove":
                    int index = Integer.parseInt(token[1]);
                    if(isValidIndes(index,numbers)) {
                        numbers.remove(index);
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    int rotationCnt = Integer.parseInt(token[2]);
                    if("left".equals(token[1])) {
                        int temporary = 0;
                        for (int i = 0; i < rotationCnt; i++) { // 1 2 3
                            temporary = numbers.get(0); // {1}
                            for (int j = 0; j <numbers.size()-1 ; j++) {
// преавим го с минус 1 защото след последния елемент няма друг с когото да го сравним
                        int nextElemet = numbers.get(j + 1); // {1} <-[2] 3
                        numbers.set(j, nextElemet); //2 3
                            }
                            numbers.set(numbers.size() - 1, temporary); // 2 3 1

                        }

                    }else{
                        for (int i = 0; i <rotationCnt ; i++) {
                            int temp = numbers.get(numbers.size()-1);
                            for (int j = numbers.size()- 1; j >0 ; j--) {
                               int nextElemt = numbers.get(j - 1);
                               numbers.set(j , nextElemt);
                            }
                            numbers.set(0,temp);
                            
                        }

                    }
                    break;

            }

        }
        for (Integer number : numbers) {
            System.out.print(number + " ");

        }

    }

    private static boolean isValidIndes(int indexToAdd, ArrayList<Integer> numbers) {
        if(indexToAdd >=0 && indexToAdd < numbers.size()){
            return true;
        } else{
            return false;
        }
    }

    private static ArrayList<Integer> readIntList(Scanner scanner) {
        ArrayList<Integer> output = new ArrayList<>();
        String[] input = scanner.nextLine().split("\\s+");
        for (String element : input) {
            output.add(Integer.parseInt(element));
        }
        return output;
    }
}
