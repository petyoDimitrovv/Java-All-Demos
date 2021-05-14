package Demo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DayOfWeek[] dayOfWeeks  = DayOfWeek.values();
        for (DayOfWeek dayOfWeek : dayOfWeeks) {
            System.out.println(dayOfWeek.getDayAsNumber());

        }
    }
}
