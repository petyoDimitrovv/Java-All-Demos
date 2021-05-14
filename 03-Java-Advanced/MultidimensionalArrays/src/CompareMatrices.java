import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int [] dimentions= readArray(scanner);

       int rows = dimentions[0];
       int cols = dimentions[1];

       int[][] firstMatrix = readMatrix(scanner,rows, cols,"\\s+" );

       dimentions= readArray(scanner);

        rows = dimentions[0];
        cols = dimentions[1];

        int[][] secondMatrix = readMatrix(scanner,rows, cols,"\\s+" );

        boolean areEqual = comapreMatrices (firstMatrix, secondMatrix);
        if (areEqual){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }

    private static boolean comapreMatrices(int[][] firstMatrix, int[][] secondMatrix) {

        if(firstMatrix.length != secondMatrix.length){
            return false;
        }

        for (int row = 0; row < firstMatrix.length; row++) {
            int[] FirstArr = firstMatrix[row];
            int[] secondArr = secondMatrix[row];
            if(FirstArr.length != secondArr.length){
                return false;
            }
            for (int col = 0; col < FirstArr.length ; col++) {
               int firstElement = FirstArr[col];
               int secondElement = secondArr[col];
                if(firstElement != secondElement){
                    return false;
                }

            }
        }

        return true;
    }


    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
    private static  int [][] readMatrix (Scanner scanner, int rows, int cols, String pattern){
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows ; row++) {
            int[] array = readArray(scanner);
            matrix[row] = array;
        }
        return matrix;
        }


    }


