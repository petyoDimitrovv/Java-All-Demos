import java.util.Scanner;

public class WorldRecordSwiming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.input record in seondcs , distace in meturs and time in seconds for 1 meter
        //2. calculate distance in seconds
        //3.smqtame zabavqneto
        //4.smqtame obshtoto vreme
        double nowRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        double sumAllDistance = distance * timePerMeter;
        double zabavqnePerM = Math.floor(distance / 15);
        double zabavqneSeconds = zabavqnePerM * 12.5;
        double allTime = sumAllDistance + zabavqneSeconds;
        if (allTime < nowRecord) {
            System.out.print("Yes, he succeeded!");
            System.out.printf(" The new world record is %.2f seconds.", allTime);
        } else if (allTime > nowRecord) {
            System.out.print("No, he failed!");
            double poorRecord = allTime - nowRecord;
            System.out.printf(" He was %.2f seconds slower.", poorRecord);
        }
    }
}
