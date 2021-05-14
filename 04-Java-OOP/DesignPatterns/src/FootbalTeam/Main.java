package FootbalTeam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] teamInput = scanner.nextLine().split(";");

        Team team = new Team(teamInput[1]);

        String line = scanner.nextLine();
        try {
            while (!line.equals("END")) {
                String[] commands = line.split(";");
                switch (commands[0]) {
                    case "Add":
                        Player player = new Player(commands[2], Integer.parseInt(commands[3]), Integer.parseInt(commands[4]), Integer.parseInt(commands[5])
                                , Integer.parseInt(commands[6]), Integer.parseInt(commands[7]));
                        team.addPlayer(player);
                        break;

                    case "Remove":
                        team.removePlayer(commands[2]);
                        System.out.println(commands[2] + " Is not in " + team.getName() + " team");
                        break;

                    case "Rating":
                        System.out.println(team.GetRating());
                        break;
                }


                line = scanner.nextLine();
            }
        }catch (IllegalArgumentException ex){
            ex.getMessage();
        }

    }
}
