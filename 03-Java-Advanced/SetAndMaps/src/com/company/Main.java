package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> numbers = new TreeSet<>((f, s) -> Integer.compare(s, f));

        for (int i = 0 ; i < 10; i++) {
            numbers.add(i);

        }
        numbers.forEach(System.out::println);

    }


}




