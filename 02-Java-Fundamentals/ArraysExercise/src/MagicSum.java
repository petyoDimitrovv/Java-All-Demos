import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);

        }
        int target = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <numbers.length - 1 ; i++) {
            int firstNUmber = numbers[i];
            for (int j = i; j < numbers.length ; j++) {
                int seconfNumber = numbers[j];
                if(firstNUmber + seconfNumber == target){
                    System.out.println(firstNUmber +" " + seconfNumber );
                }
            }
        }
    }
}
