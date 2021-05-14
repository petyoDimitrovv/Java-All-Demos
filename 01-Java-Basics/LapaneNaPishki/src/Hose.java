import java.util.Scanner;

public class Hose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int hight = Integer.parseInt(scanner.nextLine());
        int roomArea = width * length * hight;
        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            int thing = Integer.parseInt(input);
            roomArea -= thing;
            if (roomArea < 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(roomArea));
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Done")) {

            System.out.printf("%d Cubic meters left.", roomArea);
        }
    }



         }



