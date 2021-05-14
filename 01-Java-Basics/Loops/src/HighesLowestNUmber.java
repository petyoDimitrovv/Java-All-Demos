import java.util.Scanner;

public class HighesLowestNUmber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = Integer.parseInt(scanner.nextLine());
        int high = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE;
        for( int i = 1;i <=numb ; i++ ){
             int numberInput = Integer.parseInt(scanner.nextLine());
             if (numberInput > high){
                 high = numberInput;

             } if (numberInput < low){
                 low = numberInput;
             }

        }
        System.out.printf("Max number: %d%n",high);
        System.out.printf("Min number: %d",low);


    }
}
