import java.sql.Array;
import java.util.*;

public class MainBook {

        public static void main(String[] args) {
           Book bookOne =new Book("Animal Farm", 2003, "George Orwell");
            Book bookTwo= new Book("The Documents in the Case", 2002);
            Book bookThree =new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

           books.sort(new BookComperator());
            for (Book book : books) {
                System.out.println(book);

            }

                }

            }




