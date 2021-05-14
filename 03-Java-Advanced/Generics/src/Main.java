import com.company.Animal;
import com.company.AnimalList;

public class Main {
   public static class Scale<T extends Comparable<T> >{
      private T left;
      private T right;

      public Scale(T left, T right){
           this.left = left;
           this.right=right;
       }
      public T getHeavier(){
           int result = this.left.compareTo(this.right);

           if (result == 0) {
               return null;
           }
           else if(result > 0){
               return this.left;
           }
           return this.right;
       }

   }

    public static void main(String[] args) {
        Scale<Integer> scale = new Scale<>(10,13);
        System.out.println(scale.getHeavier());
    }


}
