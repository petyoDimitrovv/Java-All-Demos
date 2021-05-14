package farm;

import farm.animal.Food;
import farm.animal.Meat;
import farm.animal.Vegetable;
import farm.animal.Animal;
import farm.animal.Felime.Cat;
import farm.animal.Felime.Tiger;
import farm.animal.Mouse;
import farm.animal.Zebra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();

        String line;
        while (!(line = scanner.nextLine()).equals("End")) {
            String[] animalInfo = line.split("\\s+");

            Animal animal = createAnimal(animalInfo);

            String[] foodInfo = line.split("\\s+");
            Food food = null;
            switch (foodInfo[0]) {
                case "Meat":
                    food = new Meat(Integer.parseInt(foodInfo[1]));
                    break;
                case "Vegetable":
                    food = new Vegetable(Integer.parseInt(foodInfo[1]));
                    break;
            }
            animal.makeSound();
            animal.eat(food);
            animals.add(animal);

        }
        for (Animal animal : animals) {
            System.out.println(animal);

        }

    }

    private static Animal createAnimal(String[] animalInfo) {
        switch (animalInfo[0]) {
            case "Cat":
                return new Cat(animalInfo[1], animalInfo[0],
                        Double.parseDouble(animalInfo[2]), animalInfo[3], animalInfo[4]);
            case "Tiger":
                return new Tiger(animalInfo[1], animalInfo[0],
                        Double.parseDouble(animalInfo[2]), animalInfo[3]);

            case "Mouse":
                return new Mouse(animalInfo[1], animalInfo[0],
                        Double.parseDouble(animalInfo[2]), animalInfo[3]);

            case "Zebra":
                return new Zebra(animalInfo[1], animalInfo[0],
                        Double.parseDouble(animalInfo[2]), animalInfo[3]);

        }
        return null;
    }
}
