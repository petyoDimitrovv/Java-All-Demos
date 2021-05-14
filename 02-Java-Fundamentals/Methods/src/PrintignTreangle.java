import java.util.Scanner;

public class PrintignTreangle {
    public static  void printRow(int rowCount){
        for (int i = 0; i < rowCount ; i++) {
            System.out.print((i+1) + " ");

        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <number ; i++) {
            printRow(i + 1);
            System.out.println();
        }
        for (int i = number; i > 0 ; i--) {
            printRow( i - 1);
            System.out.println();
        }
    }
}
