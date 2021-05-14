import java.util.Scanner;

public class ValidUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] userNames = scanner.next().split(", ");

        for (String userName : userNames) {
            if(isValid(userName)){
                System.out.println(userName);

            }

        }
    }
    public static boolean isValid (String userName ){
        if (userName.length() < 3 || userName.length() > 16) {
            return false;

        }
        for (int i = 0; i < userName.length(); i++) {
            char letter = userName.charAt(i);
            if (!Character.isLetterOrDigit(letter) &&
                    letter != '_' && letter != '-' ){
                return false;
            }
        }
        return true;
    }
}
