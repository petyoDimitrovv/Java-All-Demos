import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.input : my balance ,then until Game Time Input game names.
        //when game is bouht balance decrease/ balance - price
        //3.•	If a game the user is trying to buy is not present in the
        // table above, print “Not Found” and read the next line.
        //•	If at any point, the user has $0 left, print “Out of money!”
        // and end the program.
        //•	Alternatively, if the user is trying to buy a
        // game which they can’t afford, print “Too Expensive”
        // and read the next line

        double balance = Double.parseDouble(scanner.nextLine());
        String input = "";
        double price ;
        double totalPrice = 0;

        while (true) {
            input = scanner.nextLine();
            price = 0;
            if (input.equals("Game Time")) {
                break;
            }
            switch (input) {

                case "OutFall 4":

                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;

                    break;
                case "Zplinter Zell":
                    price += 19.99;

                    break;
                case "Honored 2":
                    price = 59.99;

                    break;
                case "RoverWatch":
                    price = 29.99;

                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                default:
                    System.out.println("Not Found");

                    break;
            }
            if (balance >= price && price > 0) {
                totalPrice += price;
                balance -= price;
                System.out.print(String.format("Bought %s%n", input));
            } else if (balance < price && price > 0) {
                System.out.println("Too Expensive");
            }
            if (balance <= 0) {
                System.out.println("Out of money!");
                break;
            }

        }
        if (balance > 0) {
            System.out.printf("Total spent: %.2f. Remaining: %.2f.", totalPrice, balance);
        }
    }
}
