package com.company;

import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(12);
        stack.push(73);
        stack.push(13);

        while (!stack.isEmpty()){
            System.out.println(stack.peek());
        }

    }
}
