import java.util.Scanner;

public class DishWasher {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int bottleForWashing = Integer.parseInt(scanner.nextLine());
         bottleForWashing *= 750;
         String command = scanner.nextLine();
         int counter = 0;

         while (!command.equals("End")){
             counter ++;
             if (counter % 3 == 0){
                 int counterDishes = Integer.parseInt(command);

             }

         }


    }
}
