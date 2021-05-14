import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());

        BigInteger factorialSum = new BigInteger("1");
        for (int i = 2; i <= n ; i++) {
            BigInteger multiplylier = new BigInteger("" + i);
            factorialSum =  factorialSum.multiply(multiplylier);

        }
        System.out.println(factorialSum);
    }

}
