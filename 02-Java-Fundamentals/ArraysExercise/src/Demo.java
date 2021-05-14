import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);


        }
        int given = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <numbers.length - 1 ; i++) {
            int firstNumb = numbers[i];

            for (int j = 0; j <numbers.length ; j++) {
                int secondNumb = numbers[j];
                if (firstNumb + secondNumb == given){
                    System.out.println(firstNumb + " "+ secondNumb);
                }
            }

        }

    }
}



