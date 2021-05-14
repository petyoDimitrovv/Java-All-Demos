import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int presents = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];
        int[] santa = new int[2];
        int goodKindsCount = 0;
        int kidsWithPresents = 0;


        for (int i = 0; i < matrix.length; i++) {
            String [] arr = scanner.nextLine().split("\\s+");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = arr[j].charAt(0);
                if (arr[j].charAt(0) == 'S') {
                    santa[0] = i;
                    santa[1] = j;

                }
                if (arr[j].charAt(0) == 'V') {
                    goodKindsCount++;
                }

            }

        }
        String input = scanner.nextLine();

        boolean stop = false;
        while (!input.equals("Christmas morning") ) {

            switch (input) {
                case "up":
                    santa[0]--;
                    if (isSafe(santa, matrix)) {
                        if (matrix[santa[0]][santa[1]] == 'V') {
                            matrix[santa[0]][santa[1]] = '-';
                            kidsWithPresents++;
                        } else if (matrix[santa[0]][santa[1]] == 'C') {
                            if (isSafe(santa[0] - 1, santa[1], matrix)) {
                                if (matrix[santa[0] - 1][santa[1]] == 'X' ||
                                        matrix[santa[0] - 1][santa[1]] == 'V') {
                                    matrix[santa[0] - 1][santa[1]] = '-';
                                    kidsWithPresents++;
                                }
                            }
                            if (isSafe(santa[0] + 1, santa[1], matrix)) {
                                if (matrix[santa[0] - 1][santa[1]] == 'X' ||
                                        matrix[santa[0] - 1][santa[1]] == 'V') {
                                    matrix[santa[0] - 1][santa[1]] = '-';
                                    kidsWithPresents++;
                                }
                            }
                            if (isSafe(santa[0], santa[1] - 1, matrix)) {
                                if (matrix[santa[0] - 1][santa[1]] == 'X' ||
                                        matrix[santa[0] - 1][santa[1]] == 'V') {
                                    matrix[santa[0] - 1][santa[1]] = '-';
                                    kidsWithPresents++;
                                }
                            }
                            if (isSafe(santa[0], santa[1] + 1, matrix)) {
                                if (matrix[santa[0] - 1][santa[1]] == 'X' ||
                                        matrix[santa[0] - 1][santa[1]] == 'V') {
                                    matrix[santa[0] - 1][santa[1]] = '-';
                                    kidsWithPresents++;
                                }
                            }

                        } else {
                            stop = true;
                        }

                    }
                    break;
                case "down":
                    santa[0]++;
                    if (isSafe(santa, matrix)) {
                        if (matrix[santa[0]][santa[1]] == 'V') {
                            matrix[santa[0]][santa[1]] = '-';
                            kidsWithPresents++;
                        } else if (matrix[santa[0]][santa[1]] == 'C') {
                            if (isSafe(santa[0] - 1, santa[1], matrix)) {
                                if (matrix[santa[0] - 1][santa[1]] == 'X' ||
                                        matrix[santa[0] - 1][santa[1]] == 'V') {
                                    matrix[santa[0] - 1][santa[1]] = '-';
                                    kidsWithPresents++;
                                }
                            }
                            if (isSafe(santa[0] + 1, santa[1], matrix)) {
                                if (matrix[santa[0] - 1][santa[1]] == 'X' ||
                                        matrix[santa[0] - 1][santa[1]] == 'V') {
                                    matrix[santa[0] - 1][santa[1]] = '-';
                                    kidsWithPresents++;
                                }
                            }
                            if (isSafe(santa[0], santa[1] - 1, matrix)) {
                                if (matrix[santa[0] - 1][santa[1]] == 'X' ||
                                        matrix[santa[0] - 1][santa[1]] == 'V') {
                                    matrix[santa[0] - 1][santa[1]] = '-';
                                    kidsWithPresents++;
                                }
                            }
                            if (isSafe(santa[0], santa[1] + 1, matrix)) {
                                if (matrix[santa[0] - 1][santa[1]] == 'X' ||
                                        matrix[santa[0] - 1][santa[1]] == 'V') {
                                    matrix[santa[0] - 1][santa[1]] = '-';
                                    kidsWithPresents++;
                                }
                            }

                        } else {
                            stop = true;
                        }

                    }

                    break;
                case "left":
                    santa[1]--;
                    if (isSafe(santa, matrix)) {
                        if (matrix[santa[0]][santa[1]] == 'V') {
                            matrix[santa[0]][santa[1]] = '-';
                            kidsWithPresents++;
                        } else if (matrix[santa[0]][santa[1]] == 'C') {
                            if (isSafe(santa[0] - 1, santa[1], matrix)) {
                                if (matrix[santa[0] - 1][santa[1]] == 'X' ||
                                        matrix[santa[0] - 1][santa[1]] == 'V') {
                                    matrix[santa[0] - 1][santa[1]] = '-';
                                    kidsWithPresents++;
                                }
                            }
                            if (isSafe(santa[0] + 1, santa[1], matrix)) {
                                if (matrix[santa[0] - 1][santa[1]] == 'X' ||
                                        matrix[santa[0] - 1][santa[1]] == 'V') {
                                    matrix[santa[0] - 1][santa[1]] = '-';
                                    kidsWithPresents++;
                                }
                            }
                            if (isSafe(santa[0], santa[1] - 1, matrix)) {
                                if (matrix[santa[0] - 1][santa[1]] == 'X' ||
                                        matrix[santa[0] - 1][santa[1]] == 'V') {
                                    matrix[santa[0] - 1][santa[1]] = '-';
                                    kidsWithPresents++;
                                }
                            }
                            if (isSafe(santa[0], santa[1] + 1, matrix)) {
                                if (matrix[santa[0] - 1][santa[1]] == 'X' ||
                                        matrix[santa[0] - 1][santa[1]] == 'V') {
                                    matrix[santa[0] - 1][santa[1]] = '-';
                                    kidsWithPresents++;
                                }
                            }

                        } else {
                            stop = true;
                        }

                    }

                    break;
                case "right":
                    santa[1]++;
                    if (isSafe(santa, matrix)) {
                        if (matrix[santa[0]][santa[1]] == 'V') {
                            matrix[santa[0]][santa[1]] = '-';
                            kidsWithPresents++;
                        } else if (matrix[santa[0]][santa[1]] == 'C') {
                            if (isSafe(santa[0] - 1, santa[1], matrix)) {
                                if (matrix[santa[0] - 1][santa[1]] == 'X' ||
                                        matrix[santa[0] - 1][santa[1]] == 'V') {
                                    matrix[santa[0] - 1][santa[1]] = '-';
                                    kidsWithPresents++;
                                }
                            }
                            if (isSafe(santa[0] + 1, santa[1], matrix)) {
                                if (matrix[santa[0] - 1][santa[1]] == 'X' ||
                                        matrix[santa[0] - 1][santa[1]] == 'V') {
                                    matrix[santa[0] - 1][santa[1]] = '-';
                                    kidsWithPresents++;
                                }
                            }
                            if (isSafe(santa[0], santa[1] - 1, matrix)) {
                                if (matrix[santa[0] - 1][santa[1]] == 'X' ||
                                        matrix[santa[0] - 1][santa[1]] == 'V') {
                                    matrix[santa[0] - 1][santa[1]] = '-';
                                    kidsWithPresents++;
                                }
                            }
                            if (isSafe(santa[0], santa[1] + 1, matrix)) {
                                if (matrix[santa[0] - 1][santa[1]] == 'X' ||
                                        matrix[santa[0] - 1][santa[1]] == 'V') {
                                    matrix[santa[0] - 1][santa[1]] = '-';
                                    kidsWithPresents++;
                                }
                            }

                        } else {
                            stop = true;
                        }

                    }
                    break;
            }
            if(kidsWithPresents >= presents){
                stop = true;
            }
            if (stop){
                break;
            }


            input = scanner.nextLine();
        }
        if(!"Christmas morning".equals(input)){
            System.out.println("Santa ran out of presents!");
        }

        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] rows: matrix) {
            for (char cols : rows) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }

    private static boolean isSafe(int[] santa, char[][] matrix) {
        if (santa[0] < 0 || santa[0] > matrix.length - 1) {
            return false;
        }
        if (santa[1] < 0 || santa[1] > matrix[santa[0]].length - 1) {
            return false;
        }
        return true;
    }

    private static boolean isSafe(int santaX, int santaY, char[][] matrix) {
        if (santaX < 0 || santaX > matrix.length - 1) {
            return false;
        }
        if (santaY < 0 || santaY > matrix[santaX].length - 1) {
            return false;
        }
        return true;
    }


}
