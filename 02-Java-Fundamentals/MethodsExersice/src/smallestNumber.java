import java.util.Scanner;

public class smallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = readInt(scanner);
        int b = readInt(scanner);
        int c = readInt(scanner);
        int minNumber = findMinNumber(a, b, c);
        System.out.println(minNumber);

    }

    private static int findMinNumber(int first, int second, int third) {
        if(first < second && first < third){
            return first;
        } else if (second < first && second < third){
            return second;
        } else {
            return third;
        }
    }


    public static int readInt(Scanner scanner){
        int number = scanner.nextInt();
        return number;
    }
}
