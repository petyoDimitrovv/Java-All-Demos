import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exercise = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());
        double sum = 0;
         String input = scanner.nextLine();

        switch (input) {
            case "Basics":
                if (exercise == 1 ){
                    sum = (points * 0.08) * 0.8 ;
                } else if(exercise == 2){
                    sum = points * 0.09;
                } else if (exercise == 3){
                    sum = points * 0.09;
                }else if (exercise == 4){
                    sum = points * 0.1;
                }
                break;
            case "Fundamentals":
                if (exercise == 1 ){
                    sum = points * 0.11;
                } else if(exercise == 2){
                    sum = points * 0.11;
                } else if (exercise == 3){
                    sum = points * 0.12;
                }else if (exercise == 4){
                    sum = points * 0.13;
                }
                break;
            case "Advanced":
                if (exercise == 1 ){
                    sum = (points * 0.14)*1.2;
                } else if(exercise == 2){
                    sum = (points * 0.14)*1.2;
                } else if (exercise == 3){
                    sum = (points * 0.15)*1.2;
                }else if (exercise == 4){
                    sum = (points * 0.16)*1.2;
                }
                break;
        }
        System.out.printf("Total points:%.2f",sum);
    }
}
