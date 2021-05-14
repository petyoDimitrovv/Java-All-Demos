package com.company;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class Main {
    public static class Course implements Serializable  {
        private String name;
        private int student;

        public Course(String name, int student) {
            this.name = name;
            this.student = student;
        }

        public static void main(String[] args) throws IOException, ClassNotFoundException {

            Course course = new Course("Java", 10000000);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream
                    (new FileOutputStream("demo.ser"));

            objectOutputStream.writeObject(course);


            ObjectInputStream inputStream = new ObjectInputStream
                    (new FileInputStream("demo.ser"));

            Course numbersTwo = (Course) inputStream.readObject();
            System.out.println(numbersTwo.name);
            System.out.println(numbersTwo.student);


            }
        }
    }

