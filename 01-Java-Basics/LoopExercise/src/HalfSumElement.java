import java.security.spec.RSAPrivateKeySpec;
import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int number = 0; number <= n; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            sum += value;
            if(value > max){
                max = value ;
            }

        } int sumOthers = sum - max;
        if (max
    }
}
