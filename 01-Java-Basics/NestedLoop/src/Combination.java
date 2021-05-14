import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            int j = 0;
            while (j <= n) {
                for (int k = 0; k <= n; k++) {
                    if (i + j + k == n) {
                        sum++;
                    }
                }
                j++;
            }
        }
        System.out.println(sum);
    }
}
