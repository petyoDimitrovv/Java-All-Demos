import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortLInes {
    public static void main(String[] args) throws IOException {

       String fileName = "input.txt";

        List<String> allLines = Files.readAllLines(Paths.get(fileName))
        .stream()
        .sorted(String::compareTo)
                .collect(Collectors.toList());

        Files.write(Paths.get("sorted-lines.text"),allLines);

    }
}
