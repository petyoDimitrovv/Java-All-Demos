import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class REadText {
    public static void main(String[] args) throws IOException {


        Path path = Path.of("input.txt");



        byte[] bytes = Files.readAllBytes(path);
        for (byte aByte : bytes) {
            System.out.print(Integer.toBinaryString(aByte)+ " ");

        }

    }
}

