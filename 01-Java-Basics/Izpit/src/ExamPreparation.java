import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int student = Integer.parseInt(scanner.nextLine());
        int exresice = Integer.parseInt(scanner.nextLine());
        int energy = Integer.parseInt(scanner.nextLine());
        int questions = 0;

        int allSolved = 0;


        for (int i = energy; i <= 0; i--) {


            energy = energy + (2 * exresice);
            student -= exresice;
            questions = student * 2;
            energy = 3 * questions;
            if (student < 10) {
                System.out.printf("The students are too few!\n" +
                        "Problems solved: %d\n", questions);
            }


        }
        System.out.printf("The trainer is too tired!%nQuestions asked : %d",questions);
    }
}

