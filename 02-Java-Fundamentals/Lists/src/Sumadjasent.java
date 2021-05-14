import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sumadjasent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine(); // 3 3 6 1
        String[] split = line.split(" "); // ["3" "3" "6" "1"]
        List<Double> numbers = new ArrayList<>();
        for (int i = 0; i < split.length ; i++) {
            double num = Double.parseDouble(split[i]);
            numbers.add(num); // numbers => {3, 3, 6, 1}

        }

        for (int i = 0; i <numbers.size() - 1 ; i++) { // -1 зашщото няма с кой индекс да сравним последния
            if(numbers.get(i).equals(numbers.get(i+1))) {
                double sum = numbers.get(i) * 2;
                numbers.remove(i); // {3, 6, 1}
                numbers.set(i , sum); //{6, 6, 1}
                i = -1; //restart the loop for i = index 0

            }

        }
        for (Double number : numbers){ //printEveryNumberFromLists
        System.out.print(new DecimalFormat( "0.#").format(number) + " ");
        }

    }
}
