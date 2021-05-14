import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        for (int i = 0; i <size ; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int primarySum = calcPrimerySum(matrix);

        int secondarySum = calcSecondarySum(matrix);
        System.out.println(Math.abs(primarySum - secondarySum));

    }

    private static int calcSecondarySum(int[][] matrix) {
        int sum = 0;

        int row = 0; int col = matrix.length - 1;

        while (col >= 0 && row < matrix.length-1){
            sum += matrix[row][col];
            row++;
            col--;

        }


        return sum;
    }

    private static int calcPrimerySum(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length ; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }
}

