import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String password = "";
        boolean isValid = false;
        for (int i = name.length() - 1; i > 0; i--) {
            password = password + name.charAt(i);

        }
        for (int i = 1; i <= 4; i++) {
            String currentPass = scanner.nextLine();
            if (password.equals(currentPass)) {
                isValid = true;
                System.out.print(String.format("User %s logged in.", name));
                break;
            } else if (i < 4) {
                System.out.println("Incorrect password. Try again.");
            }

        }

        if (!isValid) {
            System.out.printf("User %s blocked!", name);
        }
    }


}
