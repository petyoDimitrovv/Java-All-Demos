import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int unthreated = 0;
        int treated = 0;
        int doctors = 7;

        for (int i = 0; i < days ; i++) {
            if ( i % 3 == 0 ){
                doctors ++;}
            int pations = Integer.parseInt(scanner.nextLine());
            if (pations > doctors ) {
                unthreated = unthreated + (pations - doctors);
                treated = treated + doctors;

            } else {
                treated = treated + pations;
            }



        } System.out.printf("Treated patients: %d.%n",treated);
        System.out.printf("Untreated patients: %d.",unthreated);
    }
}
