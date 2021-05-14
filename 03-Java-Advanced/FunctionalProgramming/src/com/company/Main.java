package com.company;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {


    public static Supplier<List<Person>>  generateRandPeople = () -> {
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            people.add(new Person(Character.toString(i),
                    new Random().nextInt(100)));
        }

        return people;
    };

    public static class Person{
        private String ID;
        private int age;

        public Person(String ID, int age ){
            this.ID = ID;
            this.age = age;
        }
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Person> people = generateRandPeople.get();
        List<Person> collect = getByPredicated(people, p -> p.age <= 18);

        for (Person person : collect) {
            System.out.println(person.age);

        }


    }
    public static List<Person> getByPredicated(Collection<Person> collection,
                                               Predicate<Person> predicator){
       return collection.stream()
                .filter(predicator)
                .collect(Collectors.toList());
    }


}
