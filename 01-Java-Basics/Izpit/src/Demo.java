import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     String input = scanner.nextLine();



     while(!input.equals("Midnight")){
         boolean isCheating = false;

         double sum = 0.0;

         for (int i = 1; i <= 6 ; i++) {

             int grades = Integer.parseInt(scanner.nextLine());
             if(grades < 0 && grades >= -100) { //eventulano moje da se schupi
                 System.out.printf(" %s was cheating!", input);
                 isCheating = true;
                 break;

             }else if (grades >= 0 && grades <= 100) {
                 sum += grades;
             }
         }
         if(!isCheating) {
             double finalGrade = (Math.floor((sum / 600) * 100) * 0.06) * 1.0;

             if (finalGrade >= 5.00) {
                 System.out.println(String.format("%n===================%n|   CERTIFICATE   |%n|    %.2f/6.00    |%n===================%nIssued to %s%n", finalGrade, input));
             } else if (finalGrade < 5.00 && finalGrade >= 3.00) {
                 System.out.println(String.format("%s - %.2f", input, finalGrade));

             } else if (finalGrade < 3.00) {
                 System.out.println(String.format("%s - 2.00", input));
             }
         }




         input = scanner.nextLine();
     }


    }

}
