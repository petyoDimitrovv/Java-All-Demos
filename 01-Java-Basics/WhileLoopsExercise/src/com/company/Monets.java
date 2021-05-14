package com.company;

import java.util.Scanner;

public class Monets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double exchangeLv = Double.parseDouble(scanner.nextLine());
        int count = 0;
        double exchange = Math.floor(exchangeLv * 100);
        while (exchange > 0) {
            if (exchange >= 200) {
                exchange -= 200;
                count++;
            } else if (exchange >= 100) {
                exchange -= 100;
                count++;
            }else if (exchange >= 50) {
                exchange -= 50;
                count++;
            }else if (exchange >= 20) {
                exchange -= 20;
                count++;
            }else if (exchange >= 10) {
                exchange -= 10;
                count++;
            }else if (exchange >= 5) {
                exchange -= 5;
                count++;
            }else if (exchange >= 2) {
                exchange -= 2;
                count++;
            }else if (exchange >= 1) {
                exchange -= 1;
                count++;
            }

        }System.out.println(count);

    }
}
