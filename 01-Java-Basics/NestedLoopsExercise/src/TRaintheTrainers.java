import java.util.Scanner;

public class TRaintheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int judjes = Integer.parseInt(scanner.nextLine());
        double participantMarkAverage = 0;
        int counter = 0;

        while (true){
            String input = scanner.nextLine();

            if(input.equals("Finish")){
                break;
            }
            counter ++;
            String presentationName = input;

            double averageMarkPerPresentation = 0;
            for (int i = 0; i < judjes ; i++) {
                double marks = Double.parseDouble(scanner.nextLine());
                averageMarkPerPresentation += marks;

            }
            averageMarkPerPresentation /= judjes;
            participantMarkAverage += averageMarkPerPresentation;


            System.out.printf("%s - %.2f.%n",presentationName, averageMarkPerPresentation);
        }
        participantMarkAverage /= counter;
        System.out.printf("Student's final assessment is %.2f.", participantMarkAverage);
    }
}
