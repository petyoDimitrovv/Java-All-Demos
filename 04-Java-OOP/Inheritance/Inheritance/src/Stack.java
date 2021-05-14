import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Stack {
    private ArrayList<String> data;
    private  int lastElementIndex;

    public Stack(){
        this.data = new ArrayList<>();
        this.lastElementIndex = - 1;

    }
    public void push (String element){
        this.lastElementIndex ++ ;
        this.data.add(element);
    }
    public String pop(){
        ensureNonEmpty();
        return this.data.remove(this.lastElementIndex -- );

    }
    public String peek(){
        ensureNonEmpty();
        return this.data.get(this.lastElementIndex);

    }
    private void ensureNonEmpty(){
        if (this.lastElementIndex < 0){
            throw new NoSuchElementException("No such element");
        }
    }
    public boolean isEmpty(){
        return this.data.isEmpty();

    }}
