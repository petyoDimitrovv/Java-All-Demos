import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOoWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pirateShip = scanner.nextLine().split(">");
        List<Integer> piratesSection = Arrays.stream(pirateShip)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] warShip = scanner.nextLine().split(">");
        List<Integer> warShipSection = Arrays.stream(warShip)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxHealth = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("Retire")) {
            String[] commandPart = command.split(" ");
            String commandName = commandPart[0];

            switch (commandName) {
                case "Fire": {
                    int sectionIndex = Integer.parseInt(commandPart[1]);
                    int damage = Integer.parseInt(commandPart[2]);

                    if (sectionIndex < 0 || sectionIndex >= warShipSection.size()) {
                        break;
                    }

                    Integer sectionHealth = warShipSection.get(sectionIndex);
                    sectionHealth -= damage;

                    if (sectionHealth == 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        return;
                    }
                    warShipSection.set(sectionIndex, sectionHealth);

                    break;
                }
                case "Defend": {
                    int startIndex = Integer.parseInt(commandPart[1]);
                    int endIndex = Integer.parseInt(commandPart[2]);
                    int damageDealt = Integer.parseInt(commandPart[3]);

                    if (startIndex < 0 || startIndex >= piratesSection.size()
                            || endIndex < 0 || endIndex >= piratesSection.size()) {
                        break;
                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        int sectionHealth = piratesSection.get(i);
                        sectionHealth -= damageDealt;
                        if (sectionHealth <= 0) {
                            System.out.println("You lost! The pirate ship has sunken");
                            return;
                        }
                        piratesSection.set(i, sectionHealth);
                    }

                    break;
                }
                case "Repair":
                    int sectionIndex = Integer.parseInt(commandPart[1]);
                    int repeirHealth = Integer.parseInt(commandPart[2]);

                    if (sectionIndex < 0 || sectionIndex >= piratesSection.size()) {
                        break;
                    }

                    Integer sectionHealth = warShipSection.get(sectionIndex);
                    sectionHealth -= repeirHealth;

                    if (sectionHealth > maxHealth) {
                        sectionHealth = maxHealth;
                    }
                    piratesSection.set(sectionIndex, repeirHealth);
                    break;
                case "Status":
                    int count = 0;
                    double mustRepeir = maxHealth * 0.2;
                    for (Integer pirateSection : piratesSection) {
                        if (pirateSection < mustRepeir) {
                            count++;
                        }
                    }
                    System.out.println(count + " sections need repair");
                    break;
            }

            command = scanner.nextLine();
        }
        int pirateSum = 0 ;

        for (Integer pirateSection : piratesSection) {
            pirateSum += pirateSection;
        }
        int warshipSum = warShipSection.stream().reduce(Integer::sum).get() ;
        System.out.printf("Pirate ship status: %d\"\n" +
                "\"Warship status: %d\n",pirateSum, warshipSum);
    }
}
