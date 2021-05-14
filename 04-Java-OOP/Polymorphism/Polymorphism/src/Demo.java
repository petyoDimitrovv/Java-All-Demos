

import animals.Animals;
import animals.Cat;
import animals.Dog;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

            Animals cat = new Cat("Oscar", "Whiskas");
            Animals dog = new Dog("Rocky", "Meat");
            System.out.println(cat.explainSelf());
            System.out.println(dog.explainSelf());
        }
    }