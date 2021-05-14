import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, List<String>> forceSides = new HashMap<>();
        List<String> existigUsers = new ArrayList<>();
        while (!command.equals("Lumpawaroo")){
            if (command.contains("|")) {

                String[] parts = command.split(" \\| ".trim());
                String forceSide = parts[0];
                String user = parts[1];
                if(existigUsers.contains(user)){ continue; }
                existigUsers.add(user);

                forceSides.get(forceSide);
                List<Sof>

                }


            }else {

            }



            command = scanner.nextLine();
        }

    }
}
