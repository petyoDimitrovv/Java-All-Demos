import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern compile = Pattern.compile("\\b(?<day>\\d\\d)([.\\-\\/])(?<month>[A-Z][a-z]{2})(\\2)(?<year>\\d{4})");
        Matcher matcher = compile.matcher(input);

        while (matcher.find()) {
            String day = matcher.group("day");
            String month = matcher.group("month");
            String year = matcher.group("year");

            System.out.printf("Day: %s, Month: %s , Year: %s%n",day, month, year);
        }

    }
}
