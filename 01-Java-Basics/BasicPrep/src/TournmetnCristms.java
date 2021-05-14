import java.util.Scanner;

public class TournmetnCristms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int days = Integer.parseInt(scanner.nextLine());
        String result = "";
        double sum = 0;
        int win = 0;
        int lose = 0;

        for (int i = 1; i <= days ; i++) {

            String input = scanner.nextLine();
            int winPerDay = 0;
            int losePerDay = 0;
            while (!input.equals("Finish")) {
                result = scanner.nextLine();

                double sumPerDay = 0;
                if (result.equals("win")) {
                    sumPerDay += 20;
                    win ++;
                    winPerDay ++;
                } else if (result.equals("lose")) {
                    lose ++;
                    losePerDay ++;
                }

                if (winPerDay > losePerDay) {
                    sumPerDay = sumPerDay * 1.1;
                    sum += sumPerDay;
                }
                else {
                    sum += sumPerDay;
                }


                input = scanner.nextLine();

            }



        }
        if (win > lose ){
            sum = sum * 1.2;
            System.out.print(String
                    .format("You won the tournament! Total raised money: %.2f",sum));
        }
        else {
            System.out.printf("You lost the tournament! Total raised money: %.2f",sum);
        }




    }
}
