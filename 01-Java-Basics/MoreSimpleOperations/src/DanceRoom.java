import java.util.Scanner;

public class DanceRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //
        double Lenght = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double Garderob = Double.parseDouble(scanner.nextLine());
         double roomArea = (Lenght * 100) * (width*100);
                 double GarderobSize = (Garderob * 100) *2;
                 double sizeBench = roomArea /10;
                 double freeSpace = roomArea - GarderobSize - sizeBench;
                 double Dancers = (freeSpace / (40+7000));
        System.out.printf("%.0f",Math.floor(Dancers));

    }
}
