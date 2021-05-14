import java.util.Scanner;

public class LeftRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftSum=0;
        int rightSum=0;

        for(int i = 1; i <= n;i++){
            int currentNumber = Integer.parseInt(scanner.nextLine());
            leftSum = leftSum + currentNumber;
        }
        for(int i = 1; i <= n;i++){
            int currentNumber = Integer.parseInt(scanner.nextLine());
            rightSum = rightSum + currentNumber;
        }
        if(leftSum == rightSum){
        System.out.printf("Yes, sum = %d",leftSum);}
        else {
            int differenc = Math.abs(leftSum - rightSum);
        System.out.printf("No, diff = %d",differenc);}
    }
}
