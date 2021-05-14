import java.util.ArrayDeque;
import java.util.Scanner;

public class DeciamlConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int number = Integer.parseInt(scanner.nextLine());

        while (number !=0){
            stack.push(number % 2);
            number /= 2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
