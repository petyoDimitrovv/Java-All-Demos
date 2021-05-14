import java.util.*;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split("\\|");

        List<String> chest = new ArrayList<>
                (Arrays.asList(split));

        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {
            String[] token = command.split(" ");
            String commandName = token[0];
            switch (commandName) {
                case "Loot":
                    for (int i = 1; i <token.length ; i++) {
                        if(!chest.contains(token[i])){
                            chest.add(0, token[i]);
                        }
                    }
                    break;
                case "Drop": {
                    int index = Integer.parseInt(token[1]);
                    if (index >= chest.size() || index < 0) {
                        break;
                    }
                    String element = chest.remove(index);
                    chest.add(element);
                }
                    break;
                case "Steal":
                    int index = Integer.parseInt(token[1]);

                    if(index >= chest.size()){
                        System.out.println(String.join(", ",chest));
                        chest.clear();
                        break;
                    }
                    List<String> stolen = new ArrayList<>();
                    for (int i = 0; i < index ; i++) {
                        int lastIndex = chest.size() -1;
                        stolen.add(chest.remove(lastIndex));
                    }
                    Collections.reverse(stolen);
                    System.out.println(String.join(", ",stolen));
                    break;
            }

            command = scanner.nextLine();
        }
        if(chest.size() > 0){
            double sum = 0;
            for (String s : chest) {
                sum += s.length();
                
            }

            System.out.printf("Average treasure gain: %.2f pirate credits.",(sum * 1.0) / chest.size());
        } else {
            System.out.println("Failed treasure hunt.");
        }

    }
}

