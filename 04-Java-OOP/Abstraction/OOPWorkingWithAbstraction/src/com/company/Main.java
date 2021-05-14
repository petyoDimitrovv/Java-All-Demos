package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String hui = createRowOfRhombus(n, true) + createRowOfRhombus(n, false);
        System.out.println(hui);

    }


    public static String createRowOfRhombus(int n, boolean topOrBottom) {
        StringBuilder out = new StringBuilder();
        for (int row = 1; row <= n; row++) {
            int spaceCount = topOrBottom ? n - row : row;
            out.append(repeatSequence(' ', spaceCount));
            int starsCount = topOrBottom ? row : n - row;
            out.append(repeatSequence("* ", starsCount));
            out.append(System.lineSeparator());
        }
        return out.toString();
    }

    private static String repeatSequence(String str, int count) {
        return str.repeat(count);

    }

    public static String repeatSequence(char symbol, int count) {
        return repeatSequence(String.valueOf(symbol), count);
    }
}
