import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("");
        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        ArrayList<String> racers = new ArrayList<>(Arrays.asList(data));


        Pattern letterPattern = Pattern.compile("[a-z]|[A-Z]");
        Pattern digitPattern = Pattern.compile("[0-9]");

        String input = scanner.nextLine();

        while (!"end of race".equals(input)) {
            Matcher nameMatcher = letterPattern.matcher(input);
            StringBuilder name = new StringBuilder();
            while (nameMatcher.find()) {
                name.append(nameMatcher.group());
            }
            if (racers.contains(name.toString())) {
                int oldData = result.get(name.toString());
                int newData = 0;
                Matcher digitMatcher = digitPattern.matcher(input);
                while (digitMatcher.find()) {
                    newData += Integer.parseInt(digitMatcher.group());

                }
                result.put(name.toString(), oldData + newData);
            }


            input = scanner.nextLine();
        }
        int[] number = {1};

        result
                .entrySet()
                .stream()
                .sorted((r1, r2) -> (
                        r2.getValue().compareTo(r1.getValue())
                )).limit(3)
                .forEach(r -> {
                    switch (number[0]) {
                        case 1:
                            System.out.println(String.format("1st place: %s",r.getKey()));
                            break;
                        case 2:
                            System.out.println(String.format("2nd place: %s",r.getKey()));
                            break;
                        case 3:
                            System.out.println(String.format("3rd place: %s",r.getKey()));
                            break;
                    }
                    number[0]++;

                });
    }
}
