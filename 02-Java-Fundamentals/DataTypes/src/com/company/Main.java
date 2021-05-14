package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int sum = 0;
 int number = Integer.parseInt(scanner.nextLine());
        while (number > 0) {
          int lastdigir = number % 10;
            lastdigir = number /10;
           sum += lastdigir;


        }
        System.out.println(sum);

    }
}
