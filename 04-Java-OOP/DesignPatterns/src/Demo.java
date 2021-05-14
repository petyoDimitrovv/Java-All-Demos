import java.util.Arrays;
import java.util.Scanner;

class Demo{

    abstract class Book {
        String title;

        abstract void setTitle(String s);

        String getTitle() {
            return title;
        }
    }

    class MyBook extends Book{


        @Override
        void setTitle(String s) {
            System.out.println("The title is: " + s);

        }
    }



    public static void main(String[] args) {

}
}




