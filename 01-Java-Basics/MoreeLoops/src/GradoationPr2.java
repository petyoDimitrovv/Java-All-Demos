import java.util.Scanner;

public class GradoationPr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();
        int currentGrade = 1;
        double sum = 0;
        int execute = 0;
        while (currentGrade <= 12) {
            double mark = Double.parseDouble(scanner.nextLine());
            if (mark < 4) {
                execute++;
                if (execute == 2) {
                    System.out.printf(" %s has been excluded at %d grade", studentName, currentGrade);
                    break;
                }
                continue;
            }
            sum = sum + mark;
            currentGrade++;
        }
        if (execute < 2) {

            double average = sum / 12;
            System.out.printf(" %s graduated. Average grade: %.2f", studentName, average);


        }
    }
}


