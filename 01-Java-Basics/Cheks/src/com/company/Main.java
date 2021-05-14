package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //input 2 numb
        //if
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        if (a > b) {
            System.out.print(a);

        } else {
            System.out.print(b);
        }

    }
}
