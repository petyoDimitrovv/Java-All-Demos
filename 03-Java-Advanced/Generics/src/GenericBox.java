import java.util.Scanner;

public class GenericBox<T> {
    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    @Override
    public  String toString() {
    return this.value
            .getClass()
            .getName();
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        while (n-- > 0){

        String line = scanner.nextLine();

        GenericBox box = new GenericBox<>(line);
            System.out.println(box.toString());

        }




    }

    
}
