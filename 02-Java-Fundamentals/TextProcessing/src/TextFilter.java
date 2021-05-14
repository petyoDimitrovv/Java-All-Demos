import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] toRemove = scanner.nextLine().split(", ");
        String text = scanner.nextLine();


        for (int i = 0; i <toRemove.length ; i++) {
            String replacement = generateReplacment(toRemove[i].length());
            text = text.replace(toRemove[i],replacement);
        }
        System.out.println(text);




    }

    private static String generateReplacment(int wordLength) {
        String[] parts = new String[wordLength];

        for (int i = 0; i <wordLength ; i++) {
            parts[i] = "*";

        }
        return String.join("",parts);
    }
}
