import java.sql.SQLOutput;
import java.util.Scanner;

public class ReportSystempt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetSum = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        int counter = 0;
        int cardPayment = 0;
        int cashPayment = 0;
        int succsesfullCardPaym = 0;
       int succsesfullCashPaym = 0;



        while (sum <targetSum){
            String command = scanner.nextLine();
            if (command.equals("End")) {
                break;
            }
            int money = Integer.parseInt(command);
            counter ++;
            //Второто плащане е с карта и то не трябва да е <10лв
            if ( counter % 2 == 0 && money > 10){
                sum += money;
                cardPayment += money ;
                succsesfullCardPaym ++ ;
                System.out.println("Product sold!");
                //Пащане в брой нечетно и трабва да е под 100 лв

            } else if (counter % 2 != 0 && money < 100){
                sum += money;
                cashPayment += money;
                succsesfullCashPaym++;
                System.out.println("Product sold!");

            } else {
                System.out.println("Error in transaction!");
            }

            } if (sum >= targetSum) {
            double avaregeCc = cardPayment * 1.0 / succsesfullCardPaym;
            double averageCs = cashPayment * 1.0 / succsesfullCashPaym;
            System.out.printf("Average CS: %.2f%n" +
                    "Average CC: %.2f%n",averageCs , avaregeCc);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
        }


    }

