import java.util.Scanner;

public class MountCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mouths = Integer.parseInt(scanner.nextLine());
        double sumElect = 0;
        double waterBills = 0;
        double netBills = 0;
        double otherBill = 0;
        double average = 0;
        double electricity = 0;
                for (int i = 0; i < mouths; i++) {
            electricity = Double.parseDouble(scanner.nextLine());;
            sumElect = sumElect + electricity;

        }
                waterBills = mouths *20;
                netBills = mouths * 15;
                otherBill = (electricity + 20 *mouths + 15 * mouths) * 1.2;
                average = (sumElect + waterBills + netBills + otherBill)  /mouths ;

                System.out.printf("Electricity: %.2f lv%n" +
                "Water: %.2f lv%n" +
                "Internet: %.2f lv%n" +
                "Other: %.2f lv%n" +
                "Average: %.2f lv%n ",sumElect, waterBills, netBills, otherBill, average);
    }
}
