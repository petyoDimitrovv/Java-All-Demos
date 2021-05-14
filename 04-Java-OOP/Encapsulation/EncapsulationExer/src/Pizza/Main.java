package Pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaInput = (scanner.nextLine().split("\\s+"));

        Pizza pizza = new Pizza(pizzaInput[1], Integer.parseInt(pizzaInput[2]));

        String[] doughInput = scanner.nextLine().split("\\s+");

        Dought dought = new Dought(doughInput[1], doughInput[2], Double.parseDouble(doughInput[3]));
        pizza.setDough(dought);


        String toppingsInput = scanner.nextLine();
        while (!toppingsInput.equals("END")) {
            String[] tokens = toppingsInput.split("\\s+");

            Topping topping = new Topping(tokens[1], Double.parseDouble(tokens[2]));
            pizza.addTopping(topping);

            toppingsInput = scanner.nextLine();
        }
        System.out.printf("%s - %.2f%n", pizza.getName(), pizza.getOverallCalories());
    }

}
