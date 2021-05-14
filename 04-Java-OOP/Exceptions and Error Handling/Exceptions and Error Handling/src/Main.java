import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    try {
        new Person("Gosho", "Milkov", 145 );
    }catch (IllegalArgumentException ex){
        System.out.println(ex.getMessage());
    }finally {
        System.out.println("Good day");
    }

    }
}
