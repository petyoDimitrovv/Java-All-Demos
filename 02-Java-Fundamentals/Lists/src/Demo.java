

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numb = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while(true){
            String input = scanner.nextLine();

            if (input.equals("end")){
                break;
            }
            String[] command = input.split(" ");
            switch (command[0]){
                case "Contains":
                    int target = [1];
                    if(numb.size())
                    break;
                case "Print even":
                    break;
                case"Print odd":
                    break;
                case "Filter":
                    break;
            }
        }
    }
}
