import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;

public class AllCapitals {
    public static void main(String[] args) throws IOException {

        String path = "input.txt";

        PrintWriter writer = new PrintWriter("output12.txt");

        Files.readAllLines(Path.of(path))
                .forEach(str -> writer.println(str.toUpperCase()));


        writer.flush();


}
}
