import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Dragon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, int[]>> dragons = new LinkedHashMap();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String type = tokens[0];
            String name = tokens[1];
            int[] data = new int[3];
            data[0] = tokens[2].equals("null") ? 45 : Integer.parseInt(tokens[2]);
            data[1] = tokens[3].equals("null") ? 250 : Integer.parseInt(tokens[3]);
            data[2] = tokens[4].equals("null") ? 10 : Integer.parseInt(tokens[4]);

            if (!dragons.containsKey(type)) {
                dragons.put(type, new TreeMap<>());
            }
            dragons.get(type).putIfAbsent(name, data);
            dragons.get(type).put(name, data);

        }

//        Red::(160.00/2350.00/30.00)
//                -Bazgargal -> damage: 100, health: 2500, armor: 25
//                -Obsidion -> damage: 220, health: 2200, armor: 35

        dragons.forEach((key, value) -> {

            double[] avg = new double[3];

            value.forEach((k, v) -> {
                avg[0] += v[0];
                avg[1] += v[1];
                avg[2] += v[2];

            });
            avg[0] /= value.size();
            avg[1] /= value.size();
            avg[2] /= value.size();


                            System.out.println(String.format("%s::(%.2f/%.2f/%.2f)", key));

            value.forEach((k, v) -> {
                System.out.println(String.format("-%s -> damage: :d, health: %d, armor: %d",
                        k,
                        v[0],
                        v[1],
                        v[2]
                ));
            });
        });

    }
}
