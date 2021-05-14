import java.util.Arrays;
import java.util.Scanner;

public class TheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int row = size[0];
        int col = size[1];

        char[][] matrix = new char[row][col];
        for (int i = 0; i < row ; i++) {
            matrix[i] = scanner.nextLine().replaceAll(" ", "").trim()
                 .toCharArray();

        }
        char fillColor = scanner.nextLine().charAt(0);

        int[] startPos = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int startRow = startPos[0];
        int startCol = startPos[1];

        char toColor = matrix[startRow][startCol];
        
        printmatrix(matrix,toColor , fillColor,startRow, startCol );

    }

    private static void printmatrix(char[][] matrix, char toColor,
                                    char fillColor, int startRow, int startCol) {

        if(isOutOfBounds(startRow, startCol , matrix) ||
                matrix[startRow][startCol] != toColor
                || matrix[startRow][startCol] == toColor ){
            return;
        }
        matrix[startRow][startCol] = fillColor;

        printmatrix(matrix , toColor, fillColor,startRow - 1, startCol);
        printmatrix(matrix , toColor, fillColor,startRow + 1, startCol);
        printmatrix(matrix , toColor, fillColor,startRow , startCol - 1);
        printmatrix(matrix , toColor, fillColor,startRow , startCol + 1);
    }

    private static boolean isOutOfBounds(int startRow, int startCol, char[][] matrix) {
        return startRow < 0 || startRow >= matrix.length || startCol < 0 ||
        startCol >= matrix[startRow].length ;
    }

}
