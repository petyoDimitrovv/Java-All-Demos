package com.company;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        Consumer<String> printer =  str -> System.out.println("Sir " + str );

// Arrays.stream((scanner.nextLine().split("\\s+")))
//                .forEach(e -> {
//                    if (e.equals("StanleyRoyce")){
//                        System.out.println(e + "Bashtata na grubiq Seks");
//                    } else {
//                        vl -> printer.accept(vl);
//                    }
//                })




    }
    public static <T , C extends Collection<T>>
        void printStuff(Consumer<T> printer, C collection){
        collection.forEach(printer);
    }
}
