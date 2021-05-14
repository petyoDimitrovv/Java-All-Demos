import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

public class Pucture {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Petyo\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources (2)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\img.jpg";

        byte[] bytes = Files.readAllBytes(Path.of(path));

        String encoded = Base64.getEncoder().encodeToString(bytes);

        new PrintWriter("img.txt").write(encoded);

        System.out.println(bytes);

    }
}
