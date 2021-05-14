import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length() ; i++) {
            char letter = (char) ((char) message.charAt(i) + 3);
            result.append(letter);

        }
        System.out.println(result);

    }
}
