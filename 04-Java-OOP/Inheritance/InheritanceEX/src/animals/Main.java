package animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            List<Animal> animalList = new ArrayList<>();
        String animalInput = scanner.nextLine();
        while(!animalInput.equals("Beast!")) {

            String[] animalData = scanner.nextLine().split("\\s+");
            String name = animalData[0];
            int age = Integer.parseInt(animalData[1]);
            String gender = animalData[2];
            try {
            Animal animal = Animal.createAnimal(animalInput,name,age,gender);
                animalList.add(animal);

            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }


            animalInput = scanner.nextLine();
        }
        for (Animal animal : animalList) {
            System.out.println(animal);

        }
    }
}
