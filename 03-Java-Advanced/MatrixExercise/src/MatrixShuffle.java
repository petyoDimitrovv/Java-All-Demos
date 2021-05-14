import java.util.Scanner;

public class MatrixShuffle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        String[][] text = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            text[i] = scanner.nextLine().split("\\s+");

        }
        String input = scanner.nextLine();

        while (!input.equals("END")) {


            try {
                String[] token = input.split("\\s+");

                if(!token[0].equalsIgnoreCase("swap") || token.length < 5 ){
                    throw new IllegalStateException();
                }

                int r1 = Integer.parseInt(token[1]);
                int c1 = Integer.parseInt(token[2]);
                int r2 = Integer.parseInt(token[3]);
                int c2 = Integer.parseInt(token[4]);

                String temp = text[r1][c1];
                text[r1][c1]=text[r2][c2];
                text[r2][c2] = temp;

            printMatrix(text);
            } catch (IndexOutOfBoundsException | IllegalStateException ex) {
                System.out.println("Invalid Input!");
            }


            input= scanner.nextLine();
        }

    }

    private static void printMatrix(String[][] text) {
        for (int row = 0; row < text.length ; row++) {
            for (int col = 0; col <text[row].length ; col++) {
                System.out.print(text[row][col] + " ");

            }
            System.out.println();
        }
    }
}
