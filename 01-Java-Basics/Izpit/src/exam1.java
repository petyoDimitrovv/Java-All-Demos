import java.util.Scanner;

public class exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int student = Integer.parseInt(scanner.nextLine());
         int exersice = Integer.parseInt(scanner.nextLine());

         double submision1 = Math.ceil(exersice * 2.8);
         double submision2 = (student * submision1);
         int hui = student *(exersice / 3);
        //System.out.println(hui);
         double allSubmissions = submision2 + hui;






        double kb = 5 *Math.ceil(allSubmissions / 10);

        System.out.printf("%.0f KB needed%n%.0f submissions",kb , allSubmissions);
    }
}
