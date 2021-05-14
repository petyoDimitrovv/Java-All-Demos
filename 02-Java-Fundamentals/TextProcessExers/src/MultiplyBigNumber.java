import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberAsString = scanner.nextLine();

        int mulpiplayer = Integer.parseInt(scanner.nextLine());
       if (mulpiplayer == 0){
           System.out.println(0);
           return;
       }
        StringBuilder result = new StringBuilder();
        int reminder = 0;

        for (int i = numberAsString.length(); i >= 0 ; i--) {
            int digit =Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
            int product = digit * mulpiplayer;

            result.append(product % 10 );
            reminder = product / 10;
            }
        result.append(reminder);
        System.out.println(result.reverse());
        }
    }

