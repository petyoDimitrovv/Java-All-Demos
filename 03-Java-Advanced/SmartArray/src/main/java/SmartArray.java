import java.util.function.Consumer;

public class SmartArray {

    private int index;
    private int[] elements;

    public SmartArray(){
        this.elements = new int[8];
        this.index = 0;
    }

    public void add(int element) {
        if(index == this.elements.length){
            int[] newElements = grow();
            this.elements = newElements;
        }
        this.elements[index] = element;
        index++;

    }

    private int[] grow() {
        int[] newElements = new int[this.elements.length * 2];
        System.arraycopy(this.elements, 0, newElements, 0, this.elements.length);
        return newElements;
    }

    public int get(int index) {
        ensureIndex(index);
        return this.elements[index];
    }

    private int ensureIndex(int index) {
        if(index >= this.size() || index < 0 ){
            throw new IndexOutOfBoundsException("SmartArray out fo Band for " +
                    "index " + index + " with size " + this.size());
        }
        return this.elements[index];
    }

    public int size (){
        return this.index;
    }

    public int remove(int index){
        int elemetnToRemove = get(index);
        for (int i = index; i < this.size() -1 ; i++) {
            this.elements[i] = this.elements[i +1];
            
        }
        this.elements[this.size()] = 0;
        this.index --;
        
        if(this.size() <= this.elements.length / 4) {
            this.elements = shrink();
        } 
        
        return elemetnToRemove;

    }

    private int[] shrink() {
        int[] newElements = new int[this.elements.length / 2];
        if (this.size() >= 0) {
            System.arraycopy(this.elements, 0, newElements, 0, this.size());
        }else if (this.size() == 0) {
            this.elements = new int[8];
        }
        return newElements;
    }

    public boolean isEmpty (){
        return this.size() == 0;
    }
    
    public boolean contains (int element) {
        return this.indexOf(element) != -1;
    }
     public int indexOf(int element ) {
         for (int i = 0; i < this.size(); i++) {
             if (element == this.elements[i]) {
                 return i;
             }
         }
         return -1;
     }

     public void add (int index, int element){
       int last = this.get(this.size() - 1);

         for (int i = this.size() - 1; i > index ; i--) {
            this.elements[i] = this.elements[i - 1];
         }

       this.elements[index] = element;
         this.add(last);



     }

    public void forEach (Consumer<Integer> consumer){
        for (int i = 0; i <this.size() ; i++) {
            consumer.accept(this.elements[i]);
        }
    }

}
