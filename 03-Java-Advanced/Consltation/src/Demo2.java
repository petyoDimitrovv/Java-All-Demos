import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        long result = fact(n);

        System.out.println(result);

    }

    private static long fact(int numb) {
        if(numb == 1){
            return 1;
        }
        return numb * fact(numb - 1);

    }

}
