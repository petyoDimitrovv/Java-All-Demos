import java.util.Scanner;

public class EqualsSumOddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstn = Integer.parseInt(scanner.nextLine());
        int secondn = Integer.parseInt(scanner.nextLine());
        boolean isEven = true;

        for (int i = firstn; i <= secondn; i++) {
            int evenDigitSum = 0;
            int oddDigitSum = 0;
            int currennNumber = i;
            while (currennNumber>0){}
            int lastDigit = currennNumber % 10;
           if ( isEven) {
               evenDigitSum += lastDigit;
           }
            currennNumber /= 10;

        }
    }
}
