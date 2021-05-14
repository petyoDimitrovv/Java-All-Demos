package com.example.springdataadvancequeying.controllers;

import com.example.springdataadvancequeying.entities.Size;
import com.example.springdataadvancequeying.repositories.ShampooRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.Scanner;

@Component
public class AppController implements CommandLineRunner {
    Scanner scanner = new Scanner(System.in);
    private final ShampooRepository shampooRepository;

    public AppController(ShampooRepository shampooRepository) {
        this.shampooRepository = shampooRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Pleas choose from 1 to ...");
        String comand = scanner.nextLine();
        while (true) {
            switch (comand) {
                case "1":
                    System.out.println("Choose size of shampoo of SMALL, MEDIUM, LARGE;");
                    findAllShampoosBySize();
                    break;
                case "2":
                System.out.println("Choose shampoos by size or label");
                SelectShampoosBySizeOrLabel();
                    break;
            }
            return;
        }


    }

    private void SelectShampoosBySizeOrLabel() {

    }

    private void findAllShampoosBySize() {

        String shampooSize = scanner.nextLine().toUpperCase();
        Size size = Size.valueOf(shampooSize);
        shampooRepository.findAllBySizeOrderById(size).forEach(shampoo -> {
                    System.out.println(String.format("%s %s %.2flv",
                            shampoo.getBrand(),
                            shampoo.getSize(),
                            shampoo.getPrice()));
                }
        );
    }



}
