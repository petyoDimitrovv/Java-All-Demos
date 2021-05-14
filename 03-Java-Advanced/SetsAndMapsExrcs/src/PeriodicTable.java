import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        Set<String> compounds = new TreeSet<>();

        while (n-- > 0){
       compounds.addAll(Arrays.asList(scanner.nextLine().split("\\s+")));

        }
        compounds.forEach(e -> System.out.print(e + " "));
    }
}
