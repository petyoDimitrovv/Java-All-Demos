import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floor = Integer.parseInt(scanner.nextLine());
        int numberOfRooms = Integer.parseInt(scanner.nextLine());

        for (int i = floor; i>= 1 ; i--) {

            for (int j = 0; j <= numberOfRooms; j++) {
                if (i == floor){
                    System.out.printf(" L%d%d",j,i);
                }
                else if (i%2==0){
                    System.out.printf(" O%d%d",j,i);

                } else {
                    System.out.printf(" A%d%d",j,i);
                }

                }
            System.out.println();
            }

        }


    }

