import java.util.Scanner;

public class a15MInutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeHours = Integer.parseInt(scanner.nextLine());
        int timeMinutes = Integer.parseInt(scanner.nextLine());
        int sumTimeInMinutes = timeHours * 60 + timeMinutes;
        int totalInMinutesPlus15 = sumTimeInMinutes + 15;
        int realTime = totalInMinutesPlus15 / 60;
        int realTimeMinutes = totalInMinutesPlus15 % 60;
        System.out.printf("%d:%.02d", realTime, realTimeMinutes);
    }
}
