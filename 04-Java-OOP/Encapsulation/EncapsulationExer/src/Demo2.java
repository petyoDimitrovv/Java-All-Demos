import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.*;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] peopleInput = (scanner.nextLine().split(";"));

        Map<String, Person> people = new HashMap<>();
        for (String in : peopleInput) {
            String[] tokens = in.split("=");
            people.putIfAbsent(tokens[0], new Person(tokens[0], Double.parseDouble(tokens[1])));

        }
        String[] productInput = (scanner.nextLine().split(";"));
        Map<String, Product> product = new HashMap<>();
        for (String in : productInput) {
            String[] tokens = in.split("=");
            product.putIfAbsent(tokens[0], new Product(tokens[0], Double.parseDouble(tokens[1])));

        }
        String line = scanner.nextLine();
        while (!line.equals("END")) {
            String[] tokens = line.split("\\s+");
            String personName = tokens[0];
            String productName = tokens[1];
            if (people.containsKey(personName) && product.containsKey(productName)) {
                Person person = people.get(personName);
                Product products = product.get(productName);

                person.buyProduct(products);

                line = scanner.nextLine();

            }
        }
        for (Person value : people.values()) {
            System.out.println(value);

        }
    }

}
