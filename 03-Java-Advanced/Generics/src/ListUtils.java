import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListUtils {
    public static  <T extends Comparable> T getMax(Collection<T> collection) {
       return collection.stream().max(T::compareTo).orElse(null);
    }

    public static  <T extends Comparable> T getMin(Collection<T> collection) {
        return collection.stream().min(T::compareTo).orElse(null);
    }
    public static <T extends  Comparable> void sort (List<T> collection){
       Collections.sort(collection);
    }



    public static void main(String[] args) {



    }
}
