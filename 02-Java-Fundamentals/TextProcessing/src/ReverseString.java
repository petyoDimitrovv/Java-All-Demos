import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        while (!text.equals("end")){
            String reversed = reverse(text);

            System.out.println(text + " = " + reversed);

            text = scanner.nextLine();
        }

    }

    private static String reverse(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0 ; i--) {

            result += text.charAt(i);
        }
return result;
    }
}
