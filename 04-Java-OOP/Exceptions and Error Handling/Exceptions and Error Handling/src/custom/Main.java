package custom;

import shano.InvalidPasswordInput;
import shano.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<User> users = new ArrayList<>();

        while (true){
            System.out.print("Username: ");
            System.out.println();
            String username = scanner.nextLine();
            System.out.print("Password: ");
            System.out.println();
            String password = scanner.nextLine();

            try {
                User user = new User(username, password);

                users.add(user);
            }catch (InvalidPasswordInput ex){
                System.out.println(ex.getMessage());
                continue;
            }
            System.out.println("User successfully registered");
        }

    }
}
