import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqeUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashSet<String> users = new LinkedHashSet<>();

        while(n-- > 0){
            String username = scanner.nextLine();
            users.add(username);

        }
        users.forEach(System.out::println);

    }
}
