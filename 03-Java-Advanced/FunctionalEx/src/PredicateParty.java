import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        Map<String, Predicate<String>> predicateMap = new HashMap<>();

        while (!input.equals("Print")){
            String[] tokens = input.split(";");

            if(tokens[0].contains("Add")){
            predicateMap.put( tokens[1] + tokens[2], producePredicate(tokens[1],tokens[2]));

            }else {
                predicateMap.remove(tokens[1] + tokens[2]);

            }



            input = scanner.nextLine();
        }
            names.stream().filter(n -> {
                boolean isValid = true;
                for (Predicate<String> values : predicateMap.values()){
                if(values.test(n)){
                    isValid = false;
                    break;
                }

                }
                return isValid;
            }).forEach(e -> System.out.print(e + " "));

    }
    public static Predicate<String> producePredicate(String command, String param){
        Predicate<String> check;

        if(command.equals("Starts with")){
            check = str -> str.startsWith(param);
        }else if (command.equals("Ends with")){
            check = str -> str.endsWith(param);
        }else if (command.equals("Contains")) {
            check = str -> str.contains(param);
        }else{
            check = str -> str.length() == Integer.parseInt(param);
        }
        return check;


    }


}
