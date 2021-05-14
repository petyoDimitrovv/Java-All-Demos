import java.util.Iterator;

public class Lake implements Iterable<Integer> {
private Integer[] stones;

public Lake(Integer... stones){
    this.stones = stones;
}

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < stones.length;
            }

            @Override
            public Integer next() {
                Integer element = stones[index];
                if(stones.length % 2 == 0 ){
                if(index >= stones.length - 2){
                    index = -1;
                }
            }else  if(index >= stones.length - 1 ){
                index = -1;
            }


                return element ;
            }
        };
    }
}
