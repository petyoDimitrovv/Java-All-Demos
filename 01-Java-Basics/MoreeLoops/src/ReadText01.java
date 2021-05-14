import java.util.Scanner;

public class ReadText01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
         while ( !text.equals("Stop")) {
             text = scanner.nextLine();
         }



    }
}
