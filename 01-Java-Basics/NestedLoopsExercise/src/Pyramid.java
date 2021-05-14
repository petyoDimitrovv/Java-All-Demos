import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());
        int counter = 1;
        boolean isBigger = false;

        for (int colums = 1; colums <=n ; colums++) {
            for (int rows = 1; rows <=colums ; rows++) {
                System.out.printf("%d ",counter);
                counter++;
                if (counter > n) {
                    isBigger = true;
                    break;

                }
            } if (isBigger){
                break;
            }
            System.out.println();
        }

    }
}
