import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filmName = "";

        double student = 0;
        double standart = 0;
        double kid = 0;
        double totalTickets = 0;


        while (!"Finish".equals(filmName = scanner.nextLine())) {

            int freeSpaces = Integer.parseInt(scanner.nextLine());

            double human = 0;
            int i = 0;
            while (i < freeSpaces) {

                String type = scanner.nextLine();

                if ("student".equals(type)) {
                    student++;
                } else if ("standard".equals(type)) {
                    standart++;
                } else if ("kid".equals(type)) {
                    kid++;
                }
                if (type.equals("End") || human >= freeSpaces) {
                    break;
                }
                human++;
                totalTickets++;
                i++;
            }
            System.out.printf("%s - %.2f%% full.\n", filmName, (human / freeSpaces) * 100.00);

        System.out.printf("Total tickets: %.0f\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", (student / totalTickets) * 100);
        System.out.printf("%.2f%% standard tickets.\n", (standart / totalTickets) * 100);
        System.out.printf("%.2f%% kids tickets.\n", (kid / totalTickets) * 100);
    }
}
}