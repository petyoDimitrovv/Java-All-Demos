package jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readPositions(scanner.nextLine(), " ");
        Movement jediMovement = new JediMovement();
        Movement sithMovement = new SithMovement();
        Galaxy galaxy = new Galaxy(new Field(dimensions[0],dimensions[1]),jediMovement, sithMovement);

        String positions = scanner.nextLine();

        long starPower = 0;

        while (!positions.equals("Let the Force be with you")) {


            int[] jediPositions = readPositions(positions, "\\s+");

            int[] sithPositions = readPositions(scanner.nextLine(), "\\s+");

            int rowJedi = jediPositions[0];
            int colJedi = jediPositions[1];

            int rowSith = sithPositions[0];
            int colSith = sithPositions[1];
            galaxy.moveSith(rowSith, colSith);

            starPower += galaxy.moveJedi(rowJedi,colJedi);

            positions = scanner.nextLine();
        }

        System.out.println(starPower);


    }


    private static int[] readPositions(String positions, String s) {
        return Arrays
                .stream(positions.split(s))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
