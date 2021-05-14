import java.util.Scanner;

public class Histograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        for (int i = 0; i <= n; i++) {
            int numb = Integer.parseInt(scanner.nextLine());
            if (numb < 200) {
                p1++;
            }
            if (numb >= 200 && numb <= 399) {
                p2++;
            }
            if (numb >= 400 && numb <= 599) {
                p3++;
            }
            if (numb >= 600 && numb <=799) {
                p4++;
            }if (numb >= 800){
                p5++;
            }


        } double pp1 = p1 *1.0 / n *100;
        double pp2 = p2 *1.0 / n *100;
        double pp3 = p3 *1.0 / n *100;
        double pp4 = p4 *1.0 / n *100;
        double pp5 = p5 *1.0 / n *100;

        System.out.printf("%.2f%%%n",pp1);
        System.out.printf("%.2f%%%n",pp2);
        System.out.printf("%.2f%%%n",pp3);

        System.out.printf("%.2f%%%n",pp4);
        System.out.printf("%.2f%%%n",pp5);


    }
}
