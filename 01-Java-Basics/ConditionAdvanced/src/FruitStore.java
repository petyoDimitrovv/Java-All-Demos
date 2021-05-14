import java.util.Scanner;

public class FruitStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String days = scanner.nextLine();
        double cout = Double.parseDouble(scanner.nextLine());
        double sum = 0;
//(Monday / Tuesday / Wednesday / Thursday / Friday
        if (days.equals("Monday")
        || days.equals("Tuesday")
        || days.equals("Wednesday")
        || days.equals("Thursday")
        || days.equals("Friday")){
            if (fruit.equals("banana")) {
               sum = cout * 2.50;
            } else if (fruit.equals("apple")){
                sum = cout * 1.20;
            }else if (fruit.equals("orange")){
                sum = cout * 0.85;
            }else if (fruit.equals("grapefruit")){
                sum = cout * 1.45;
            }else if (fruit.equals("kiwi")){
                sum = cout * 2.70;
            }else if (fruit.equals("pineapple")){
                sum = cout * 5.50;
            }else if (fruit.equals("grape")){
                sum = cout * 3.85;
            } else {
                System.out.println("error");
            }

        } if (days.equals("Saturday")
                || days.equals("Sunday")) {
            if (fruit.equals("banana")) {
                sum = cout * 2.70;
            } else if (fruit.equals("apple")){
                sum = cout * 1.25;
            }else if (fruit.equals("orange")){
                sum = cout * 0.90;
            }else if (fruit.equals("grapefruit")){
                sum = cout * 1.60;
            }else if (fruit.equals("kiwi")){
                sum = cout * 3.00;
            }else if (fruit.equals("pineapple")){
                sum = cout * 5.60;
            }else if (fruit.equals("grape")){
                sum = cout * 4.20;
            } else {
                System.out.println("error");
            }

        }
        System.out.printf("%.2f",sum);
    }
}
