import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amoutofNumber = Integer.parseInt(scanner.nextLine());
        int currentNumber = 1;
        int max = Integer.MIN_VALUE;
        while (currentNumber <= amoutofNumber ){
            int inputNumber = Integer.parseInt(scanner.nextLine());
            if (inputNumber > max){
                max = inputNumber;
            }

            currentNumber++;

        }System.out.println(max);

    }
}
