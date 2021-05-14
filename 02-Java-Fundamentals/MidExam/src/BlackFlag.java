import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int plunderPerDay = Integer.parseInt(scanner.nextLine());
        double targetPlunder = Double.parseDouble(scanner.nextLine());

        double totalPlunder = 0;
        for (int i = 1; i <= days ; i++) {
            totalPlunder += plunderPerDay;
            if (i % 3 == 0){
                totalPlunder +=plunderPerDay * 0.5;

            }
            if (i % 5 == 0){

                totalPlunder -= totalPlunder * 0.3;
                // или  totalPlunder = totalPlunder * 0.7
            }
        }
        if (totalPlunder >= targetPlunder) {
            System.out.println(String.format("Ahoy! %.2f plunder gained.",totalPlunder));
        } else {
           double collectedPercentage = ((totalPlunder * 1.0) / targetPlunder) *100;
            System.out.printf("Collected only %.2f%% of the plunder.",collectedPercentage);

        }


    }
}
