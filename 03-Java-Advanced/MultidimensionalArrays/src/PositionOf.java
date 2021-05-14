import java.util.Scanner;

public class PositionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        String output = "";

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
        int number = scanner.nextInt();

        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                if(matrix[row][col] == number){
                    output += (row + " " + col + System.lineSeparator());
                }
            }
            
        }
        if (output.equals("")){
            System.out.println("not found");
        } else {
            System.out.println(output);
        }

        

    }

}

