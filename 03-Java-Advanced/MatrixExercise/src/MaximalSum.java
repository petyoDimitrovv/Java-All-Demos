import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readArr(scanner);

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i <rows ; i++) {
            matrix[i] = readArr(scanner);
        }

        int maxSum = Integer.MIN_VALUE;

        int indexRow = 0 , indexCol = 0;


        for (int row = 1; row < rows - 1 ; row++) {
            for (int col = 1; col < cols - 1 ; col++) {
            int sum = calculateMatrixSum(row, col, matrix);
            if (sum > maxSum){
                maxSum = sum;

                indexRow = row;
                indexCol = col;
            }

            }

        }
        System.out.println("Sum = " + maxSum);

        printMaxSubMatrix(matrix, indexRow, indexCol);



    }

    private static void printMaxSubMatrix(int[][] matrix, int indexRow, int indexCol) {
        for (int row = indexRow - 1; row <= indexRow + 1 ; row++) {
            for (int col = indexCol - 1; col < indexCol + 2 ; col++) {
                System.out.print(matrix[row][col] + " ");
                
            }
            System.out.println();
        }

    }

    private static int calculateMatrixSum(int row, int col, int[][] matrix) {
        int sum = 0;
        sum += matrix[row][col];

        sum += matrix[row + 1][col];
        sum += matrix[row - 1][col];
        sum += matrix[row][col + 1];
        sum += matrix[row][col - 1];

        sum += matrix[row + 1][col + 1];
        sum += matrix[row + 1][col - 1];
        sum += matrix[row - 1] [col + 1];
        sum += matrix[row - 1][col - 1];


        return sum;
    }

    private static int[] readArr(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
