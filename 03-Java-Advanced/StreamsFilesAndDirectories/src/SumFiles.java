import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumFiles {
    public static void main(String[] args) throws IOException {

        String fileName = "input.txt";

        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        String line = reader.readLine();

        while (line.equals("End")) {
            int sum = 0;
            for (char symbol : line.toCharArray()) {
                sum += symbol;

            }


            line = reader.readLine();
        }



    }
}
