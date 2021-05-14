import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListLyIterator implements Iterable<String>{

    private List<String> list;
    private int currentIndex;

    public ListLyIterator(String... elements){
        this.list = List.of(elements);
        this.currentIndex = 0;
    }

    public boolean hasNext(){
        return this.currentIndex < list.size();
    }
    public boolean Move(){
        if (this.hasNext()){
            this.currentIndex++;
            return true;
        }
        return false;

    }

        public String print() {
            if (this.list.size() == 0) {
                throw new UnsupportedOperationException ("Invalid Operation");
            } return this.list.get(this.currentIndex);


        }




    public List<String> getList() {
        return list;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return ListLyIterator.this.hasNext();
            }

            @Override
            public String next() {
                return list.get(currentIndex);
            }
        };
    }

    @Override
    public void forEach(Consumer<? super String> action) {

    }
}
