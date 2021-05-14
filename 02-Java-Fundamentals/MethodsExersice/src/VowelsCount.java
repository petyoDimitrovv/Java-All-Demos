import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int cout = countOfVowels(input);
        System.out.println(cout);
    }

    private static int countOfVowels(String text) {
        int counetr = 0;
        for (int i = 0; i < text.length() ; i++) {
            int letter = text.toLowerCase().charAt(i);
            switch (letter){
                case'a':
                case 'u':
                case 'o':
                case 'e':
                case 'i':
                    counetr++;
                    break;

            }

        }
        return counetr;

    }
}
