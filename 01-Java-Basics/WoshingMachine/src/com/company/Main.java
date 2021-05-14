package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBottles = Integer.parseInt(scanner.nextLine());
        int botlleMl = 750;
        int container = 0;
        int counter = 0;
        int numberOfDishedWashed = 0;
        int numberOfPotsWashed = 0;
        String commadn = scanner.nextLine();
        while (!commadn.equals("End")) {
            counter++;
            if (counter % 3 == 0) {
                container = Integer.parseInt(commadn);
                numberOfPotsWashed += container;
                botlleMl -= container * 15;

            }
            // write your code here
        }
    }
}
