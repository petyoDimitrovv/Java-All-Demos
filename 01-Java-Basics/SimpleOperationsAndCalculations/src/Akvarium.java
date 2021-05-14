import java.util.Scanner;

public class Akvarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //1. read input
        //2. calculate vilume in cm*3
        //3. calculate volume in liters
        //4. used space
        //5. calculate free space
        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine()) ;
        int hight = Integer.parseInt(scanner.nextLine());
        double procent = Double.parseDouble(scanner.nextLine());

        int volumeCm = lenght * width * hight ;
        double volumeLitters = volumeCm * 0.001 ;
        double procentNumber = procent * 0.01;
        double  needLiters = volumeLitters * (1-procentNumber);
        System.out.printf("%.3f", needLiters);



    }
}
