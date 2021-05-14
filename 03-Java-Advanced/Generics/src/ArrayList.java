import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayList<E extends Comparable<E>> {
    private Object[] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 4;

    public ArrayList() {

        this.elements = new Object[INITIAL_CAPACITY];
    }

    public void add(E element) {
        if (this.size == this.elements.length) {
            this.elements = grow();
        }
        this.elements[this.size++] = element;
    }

    public E get(int index) {
        return this.getAt(index);
    }

    private void ensureIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index out of bounds for"
                    + index + "Arraylist sizoe of " + size);
        }
    }

    public boolean contains(Object element) {
        return this.indexOf(element) >= 0;
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < this.size; i++) {
            E at = this.getAt(i);
            if (at.equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public void swap(int first, int second) {
        ensureIndex(first);
        ensureIndex(second);
        Object temp = this.elements[first];
        this.elements[first] = this.elements[second];
        this.elements[second] = temp;
    }

    public int countGreaterThan(E element) {
        int count = 0;
        for (int i = 0; i < this.size; i++) {
            if (this.getAt(i).compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    public E remove(int index) {
        ensureIndex(index);
        E at = this.getAt(index);
        this.elements[index] = null;
        shift(index);

        if(this.size == this.elements.length / 2){
            this.elements = shrink();
        }

        this.size--;

        return at;
    }

    private Object[] shrink() {
        return Arrays.copyOf(this.elements, this.elements.length / 2);
    }

    private void shift(int index) {
        for (int i = index; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];

        }
        this.elements[this.size - 1] = null;
    }

    @SuppressWarnings("unchecked")
    public E getMax() {
        return Arrays.stream(this.elements)
                .limit(this.size)
                .map(e -> (E) e)
                .max(Comparator.comparing(e -> e))
                .orElse(null);
    }
    @SuppressWarnings("unchecked")
    public E getMin() {
        return Arrays.stream(this.elements)
                .limit(this.size)
                .map(e -> (E) e)
                .min(Comparator.comparing(e -> e))
                .orElse(null);
    }


    @SuppressWarnings("unchecked")
    private E getAt(int index) {
        return (E) this.elements[index];
    }

    private Object[] grow() {
        return Arrays.copyOf(this.elements, this.elements.length * 2);
    }
    public void print(){
        for (int i = 0; i < this.size ; i++) {
            System.out.println(this.elements[i].toString());

        }
    }
    public void sort(){
        for (int i = 0; i < this.size ; i++) {
            E element = this.get(i);
            for (int j = 0; j < this.size - 1 ; j++) {
                if(element.compareTo(this.get(j)) < 0){
                    this.swap(i,j);
                }
                
            }

        }
    }

    //==============================================================//
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();

        while (!input.equals("END")) {
            String[] token = input.split("\\s+");
            switch (token[0]) {
                case "Add":
                    list.add(token[1]);
                    break;
                case "Remove":
                    System.out.println(list.remove(Integer.parseInt(token[1])));
                    break;
                case "Contains":
                    System.out.println(list.contains(token[1]));
                    break;
                case "Swap":
                    list.swap(Integer.parseInt(token[1]), Integer.parseInt(token[2]));
                    break;
                case "Greater":
                    System.out.println(list.countGreaterThan(token[1]));
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                    list.print();
                    break;
                    case "Sort":
                    list.sort();
                    break;


            }


            input = scanner.nextLine();
        }

    }

}