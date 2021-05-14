import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MurgeFails {
    public static void main(String[] args) throws IOException {

        String pathOne = "C:\\Users\\Petyo\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources (2)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String pathTwo = "C:\\Users\\Petyo\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources (2)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";

        Scanner scanner = new Scanner(new File(pathOne));

        PrintWriter writer = new PrintWriter("MargeText.txt");



        while (scanner.hasNext()){
            String line = scanner.nextLine();
            writer.append(line + System.lineSeparator());
        }

        scanner = new Scanner(new File(pathTwo));

        while (scanner.hasNext()){
            String line = scanner.nextLine();
            writer.append(line + System.lineSeparator());
        }

        writer.close();

}
}
