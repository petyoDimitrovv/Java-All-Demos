import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysInBansko = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String mark = scanner.nextLine();
        int nights = daysInBansko - 1;
        double priceOfVacantion = 0;
        switch(roomType) {
            case "room for one person":
                priceOfVacantion = nights * 18;
                    break;
            case "apartment":
                priceOfVacantion = nights * 25;
                if(nights < 10) {
                    priceOfVacantion = priceOfVacantion * 0.7;
                } else if (nights >= 10 && nights < 15) {
                    priceOfVacantion = priceOfVacantion * 0.65;
                } else if (nights > 15){
                    priceOfVacantion = priceOfVacantion * 0.5;
                }
                break;
            case "president apartment":
                priceOfVacantion = nights * 35;
                if(nights < 10) {
                    priceOfVacantion = priceOfVacantion * 0.9;
                } else if (nights >= 10 && nights < 15) {
                    priceOfVacantion = priceOfVacantion * 0.85;
                } else if (nights > 15 ){
                    priceOfVacantion = priceOfVacantion * 0.80;
                }
                break;

        } if(mark.equals("positive")) {
            priceOfVacantion = priceOfVacantion + 0.25 * priceOfVacantion;

        }else if (mark.equals("negative")) {
            priceOfVacantion = priceOfVacantion * 0.9;


    }
        System.out.printf("%.2f",priceOfVacantion);
        }
    }

