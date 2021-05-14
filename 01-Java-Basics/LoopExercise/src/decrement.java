import java.util.Scanner;

public class decrement {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n = Integer.parseInt(scanner.nextLine());
         int p1=0;
         int p2 = 0;
         int p3 = 0;
         for (int i = 1 ; i <= n ;i++ ){
             int value = Integer.parseInt(scanner.nextLine());
              if (value % 2 == 0){
                  p1 ++;
              } if (value % 3 == 0){
                  p2 ++;
             }if (value % 4 == 0){
                  p3++;
             }

         } double pp1 = p1 *1.0 / n * 100;
         double pp2 = p2 * 1.0 / n * 100;
         double pp3 = p3 *1.0 / n * 100;
        System.out.printf("%.2f%%%n",pp1);
        System.out.printf("%.2f%%%n",pp2);
        System.out.printf("%.2f%%%n",pp3);


    }
}
