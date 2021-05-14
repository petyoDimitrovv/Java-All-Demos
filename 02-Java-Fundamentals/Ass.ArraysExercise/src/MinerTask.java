import java.util.LinkedHashMap;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap <String, Integer> resources = new LinkedHashMap<>();
        while(!"stop".equals(input)){
            int count = Integer.parseInt(scanner.nextLine());
            resources.putIfAbsent(input,0);
            int oldCount = resources.get(input);
            resources.put(input, oldCount + count);


            input = scanner.nextLine();
        }
        resources
                .forEach((k , v)-> System.out.println(String.format("%s -> %d"
                        ,k, v)));
    }
}
