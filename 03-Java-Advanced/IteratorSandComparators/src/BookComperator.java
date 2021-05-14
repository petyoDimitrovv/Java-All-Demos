import java.util.Comparator;

public class BookComperator implements Comparator<Book> {

    @Override
    public int compare(Book first, Book second){

        return Comparator.comparing(Book :: getTitle)
                .thenComparing(Book::getYear)
                .compare(first, second);

        }
    }


