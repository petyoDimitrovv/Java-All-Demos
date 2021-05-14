import java.util.Scanner;

public class GameTime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double currentBalance = Double.parseDouble(scanner.nextLine());
        String input = "";
        double TotalPrice = 0;
        double price;


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
            if (currentBalance >= price && price > 0) {
                TotalPrice += price;
                currentBalance -= price;
                System.out.printf("Bought %s%n", input);
            } else if (currentBalance < price && price > 0) {
                System.out.println("Too Expensive");
            }  if (currentBalance <= 0) {
                System.out.println("Out of money!");
                break;
            }


        }
        if (currentBalance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", TotalPrice, currentBalance);
        }

    }
}

