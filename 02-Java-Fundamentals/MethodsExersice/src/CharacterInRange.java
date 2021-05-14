import java.util.Scanner;

public class CharacterInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first= scanner.nextLine().charAt(0);
        char last = scanner.nextLine().charAt(0);
        if (first > last) {
            printSymbol(last, first);
        }else {
            printSymbol(first, last);
        }
    }

    private static void printSymbol(char start, char end) {
        for (int i = start+1; i <end ; i++) {
            System.out.print(String.format("%c",i));

        }
    }
}
