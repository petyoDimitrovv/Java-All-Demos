import java.util.Scanner;

public class Vend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String coinInput = "";
        String input = "";
        double sumCoin = 0;
        while (true) {
            coinInput = scanner.nextLine();
            if (coinInput.equals("Start")) {
                break;
            }

            double coin = Double.parseDouble(coinInput);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5
                    || coin == 1.0 || coin == 2.0) {
                sumCoin += coin;
            } else {
                System.out.println("Cannot accept " + coin);
            }
        }
        double price = 0;
        while (true) {
            input = scanner.nextLine();
            switch (input) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;


            } if (input.equals("End")) {
                break;
            }if (sumCoin < price) {
                System.out.println("Sorry, not enough money");
                } else if (sumCoin > price) {
                System.out.println("Purchased  " + input);
                sumCoin -= price;
            } else {
                System.out.println("Invalid product");

            }
        }
        System.out.printf("Change: %.2f left.", sumCoin);
    }
}
