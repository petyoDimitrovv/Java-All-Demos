import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TExt2 {
    public static void main(String[] args) throws IOException {

        File files = new File("C:\\Users\\Petyo\\IdeaProjects\\StreamsFilesAndDirectories\\input.txt");

        FileInputStream inputStream = new FileInputStream(files);

        Scanner scanner = new Scanner(inputStream);

        StringBuilder builder = new StringBuilder();

        String line = scanner.nextLine();

        while (line != null){

            builder.append(line.replaceAll("[,\\.\\!\\?]", ""))
            .append(System.lineSeparator());

            try {
            line = scanner.nextLine();
            } catch (NoSuchElementException ex){
                inputStream.close();
                break;
            }
        }
        String string = builder.toString();
        OutputStream outputStream = new FileOutputStream("output.txt");

        PrintWriter printWriter = new PrintWriter(outputStream);

        printWriter.print(string);
        printWriter.flush();
    }
}
