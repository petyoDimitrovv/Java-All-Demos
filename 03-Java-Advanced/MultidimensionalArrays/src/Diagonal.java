import java.util.Arrays;
import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int [][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int row = 0;
        int col = 0;

        for (int i = 0; i < size ; i++) {
            System.out.print(matrix[row++][col++] + " ");

        }

        row = size -1 ;
        col = 0;
        System.out.println();
        for (int i = 0; i <size ; i++) {
            System.out.print(matrix[row--][col++] + " ");
            
        }
    }
}
