import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int food = Integer.parseInt(scanner.nextLine()) * 1000;

        String input = scanner.nextLine();
        int sumEatedFood = 0;

        while (!input.equals("Adopted")){
            int eatedFood = Integer.parseInt(input);
            sumEatedFood += eatedFood;

            input = scanner.nextLine();


        }
        int leftFood = food - sumEatedFood;
        int needFood = sumEatedFood - food;
        if (sumEatedFood > food){
            System.out.printf("Food is not enough. You need %d grams more.",needFood);

        }else {
            System.out.printf("Food is enough! Leftovers: %d grams.",leftFood);

        }

    }
}
