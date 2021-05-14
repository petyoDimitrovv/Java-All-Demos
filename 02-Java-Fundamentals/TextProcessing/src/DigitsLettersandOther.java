import java.util.Scanner;

public class DigitsLettersandOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (int i = 0; i < text.length() ; i++) {
            char current = text.charAt(i);

            if(Character.isDigit(current)){
                digits.append(current);
            }else if (Character.isLetter(current)){
                letters.append(current);

            }else{
                symbols.append(current);
            }

        }
        System.out.println(digits.toString());
        System.out.println(letters.toString());
        System.out.println(symbols.toString());

    }
}
