import java.util.Scanner;

public class REvolt {

    public static int playerRow;
    public static int playerCol;
    public static int finishRow;
    public static int finishCol;


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int commandsCount = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[n][n];


        for (int r = 0; r < n; r++) {
            String line = scanner.nextLine();
            if (line.contains("f")) {
                playerRow = r;
                playerCol = line.indexOf("f");
            }
            if (line.contains("F")) {
                finishRow = r;
                finishCol = line.indexOf("F");
            }
            field[r] = line.toCharArray();

        }

        boolean hasWon = false;

        while (commandsCount-- > 0 && !hasWon) {
            String command = scanner.nextLine();
            switch (command) {
                case "up":
                    moveUp(field);
                    break;
                case "down":
                    moveDown(field);
                    break;
                case "left":
                    moveLeft(field);
                    break;
                case "right":
                    moveRight(field);
                    break;
            }
            hasWon = playerRow == finishRow && playerCol == finishCol;
        }
        if (hasWon) {
            System.out.println("Player won!");
        } else {
            System.out.println("Player lost!");
        }


        for (int r = 0; r < field.length; r++) {
            for (int c = 0; c < field[r].length; c++) {
                System.out.print(field[r][c]);
            }
            System.out.println();
        }
    }

    private static void moveLeft(char[][] field) {
        int preCol = playerCol;
        if(playerCol - 1 < 0){
            playerCol = field.length;

        }
        if (field[playerRow][playerCol - 1] != 'T') {
            if(playerCol == field.length){
                preCol = 0 ;

            }
            field[playerRow][preCol] = '-';
            playerCol--;
            if (field[playerRow][playerCol] == 'B') {
                moveLeft(field);
                field[playerRow][playerCol] = 'B';
            }
            field[playerRow][playerCol] = 'f';
        } else {
            playerCol = preCol;
        }
    }

    private static void moveRight(char[][] field) {
        int prevCol = playerCol;
        if (playerCol + 1 == field.length ){
            playerCol = -1;
        }
        if (field[playerRow][playerCol + 1] != 'T') {
            if(playerCol == -1){
                prevCol = field.length - 1;
            }
            field[playerRow][prevCol] = '-';
            playerCol++;
            if (field[playerRow][playerCol] == 'B') {
                moveRight(field);
                field[playerRow][playerCol] = 'B';
            }
            field[playerRow][playerCol] = 'f';
        }else {
            playerCol = prevCol;
        }
    }

    private static void moveUp(char[][] field) {
        int prevRow = playerRow;
        if(playerRow - 1 < 0){
            playerRow = field.length ;
        }
        if (field[playerRow - 1][playerCol] != 'T') {
            if(playerRow == field.length){
                prevRow = 0;
            }
            field[prevRow][playerCol] = '-';
            playerRow--;
            if (field[playerRow][playerCol] == 'B') {
                moveUp(field);
                field[playerRow][playerCol] = 'B';
            }
            field[playerRow][playerCol] = 'f';
        } else {
            playerRow = prevRow;
        }
        }

    private static void moveDown(char[][] field) {
        int prevRow = playerRow;
        if(playerRow + 1 == field.length){
            playerRow = -1 ;
        }
        if (field[playerRow + 1][playerCol] != 'T') {
            if(playerRow == 0){
            prevRow = field.length - 1;
            }
            field[prevRow][playerCol] = '-';
            playerRow++;
            if (field[playerRow][playerCol] == 'B') {
                int beforeRecursive;
                moveRight(field);
                field[playerRow][playerCol] = 'B';
            }
            field[playerRow][playerCol] = 'f';
        }else {
            playerRow = prevRow ;
        }
    }
}
