import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (int i = 0; i < secondArr.length; i++) {
            String secEl = secondArr[i];
            for (String firstEl : firstArr) {
                if (secEl.equals(firstEl)) {
                    System.out.print(firstEl + " ");
                }

            }
        }
    }
}
