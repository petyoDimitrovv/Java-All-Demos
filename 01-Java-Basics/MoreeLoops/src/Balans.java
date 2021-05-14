import java.util.Scanner;

public class Balans {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int amountOfIncrease = Integer.parseInt(scanner.nextLine());
        int currentDeposit = 1;
        while (currentDeposit <= amountOfIncrease) {
            double income = Double.parseDouble(scanner.nextLine());
            if (income <= 0){
                System.out.println("Invalid operation!");
                break;}
            System.out.printf("Increase: %.2f%n", income);
            sum = sum + income;
            currentDeposit ++ ;

        }




        System.out.printf("Total: %.2f", sum);


    }
}
