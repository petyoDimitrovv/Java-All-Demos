import java.util.Scanner;

public class passValid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        boolean isPasswordCorrect = isValidPassword(password);
        if (isPasswordCorrect){
            System.out.println("Password is valid");
        }
    }

    private static boolean isValidPassword(String password) {
        boolean isEnough = isLenghBetweenSixAndTenSymb(password);
        boolean containtOnlyDigAndLett = containsDigitAndLetters(password);
        boolean isContaintMoreOfTwoDig = containAtLeastTwoDigits(password);
        boolean isValid = isEnough && containtOnlyDigAndLett && isContaintMoreOfTwoDig;
        return isValid;


    }
    private static boolean containAtLeastTwoDigits(String password){
        int counter = 0;
        for (int i = 0; i < password.length() ; i++) {
            char symbol = password.charAt(i);
            if(Character.isDigit(symbol)) {
                counter ++;
                if(counter == 2){
                    break;
                }
            }
            }

        if (counter == 2) {
            return true;
        } else {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
    }

    private static boolean containsDigitAndLetters(String password) {
        for (int i = 0; i < password.length() ; i++) {
            char symbol = password.charAt(i);
            if (!Character.isLetterOrDigit(symbol)){
                System.out.println("Password must consist only of letters and digits");
                return false;

            }

        }
        return true;

    }

    private static boolean isLenghBetweenSixAndTenSymb(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
    }
}
