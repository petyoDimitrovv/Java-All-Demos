import java.util.Scanner;

public class DayOfweek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] daysOfWeek = new String[]{"Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday","Sunday"};

        int day = Integer.parseInt(scanner.nextLine());
        if(day >0 && day <= 7) {
            day -= 1;
            System.out.println(daysOfWeek[day]);
        } else {
                System.out.println("Invalid day!");
            }

        }
    }

