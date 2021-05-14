import java.util.Scanner;

public class RepeatStrign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRepeat = scanner.nextLine();
        int times = Integer.parseInt(scanner.nextLine());
        String endResult = repeat(toRepeat, times);

        
        System.out.println(endResult);
    }

    private static String repeat(String toRepeat, int times) {
        String result = "";
        for (int i = 0; i < times ; i++) {
            result += toRepeat;

        }
        return result;
    }
}
