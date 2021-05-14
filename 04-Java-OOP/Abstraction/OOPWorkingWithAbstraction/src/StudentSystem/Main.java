package StudentSystem;

import StudentSystem.StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();
        boolean hasToEndExit = false;
        while (!hasToEndExit) {
            String[] input = scanner.nextLine().split(" ");

            String executionResult = studentSystem.parseCommand(input);

                hasToEndExit = executionResult != null && executionResult.equals("Exit");

            if(!hasToEndExit && executionResult != null){
                System.out.println(executionResult);
            }

        }
    }
}
