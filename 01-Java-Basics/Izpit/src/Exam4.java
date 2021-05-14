import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int student = Integer.parseInt(scanner.nextLine());
        int season = Integer.parseInt(scanner.nextLine());

        double studetnPerSeason = 0;
        int countinigStudent = 0;
        double newStudent = 0;
        for (int i = 1; i <= season ; i++) {
            if ( i / 1  == 1){
                studetnPerSeason = Math.ceil(student * 90 / 100) ;
            }

            else {studetnPerSeason = Math.ceil(studetnPerSeason * 90 / 100);
            }

            studetnPerSeason = Math.ceil(studetnPerSeason * 90 / 100);
            studetnPerSeason = Math.ceil(studetnPerSeason * 80 /100);
            if (i % 3 == 0) {
                newStudent = Math.ceil(studetnPerSeason * 15/100);
                studetnPerSeason +=newStudent;
            } else {
            newStudent = Math.ceil(studetnPerSeason * 5/100);
            studetnPerSeason += newStudent;
            }



        }
        System.out.printf("Students: %.0f",studetnPerSeason);
    }
}
