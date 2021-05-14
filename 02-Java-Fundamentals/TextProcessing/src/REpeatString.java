import java.util.Scanner;

public class REpeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        
        String result = "";
        for (int i = 0; i <words.length ; i++) {
            result += repeatWord(words[i]);  
        }
        System.out.println(result);
        

        }

    private static String repeatWord(String word) {
        int times = word.length();

        String result = "";
        for (int i = 0; i < times ; i++) {
            result += word;

        }
        return result;
    }

}

