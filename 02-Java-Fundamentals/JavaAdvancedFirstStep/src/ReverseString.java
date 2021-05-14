import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String ouput = "";
        for (int i =input.length()-1; i >=0 ; i--) {
            ouput = ouput +input.charAt(i);


        }
        System.out.print(ouput);
    }
}
