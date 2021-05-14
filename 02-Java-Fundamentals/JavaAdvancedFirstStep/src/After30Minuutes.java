import java.util.Scanner;

public class After30Minuutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int sumTime = hour * 60 + minutes + 30;
        hour = sumTime / 60;
        minutes = sumTime % 60;
        if(hour > 23) {
            hour -= 24;
        }
        System.out.printf("%d:%02d",hour,minutes);

    }
}
