import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> furniture = new ArrayList<>();
        double finalPrice = 0.0;

        Pattern pattern = Pattern.compile(">>(?<name>[A-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[\\d]+)");


        String input = scanner.nextLine();
        while (!"Purchase".equals(input)){
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                String name = matcher.group("name");
                double price =Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                furniture.add(name);
                finalPrice += price * quantity;
            }

            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furniture
                .forEach(f -> System.out.println(f));
        System.out.println(String.format("Total money spend: %.2f",finalPrice));
    }
}
