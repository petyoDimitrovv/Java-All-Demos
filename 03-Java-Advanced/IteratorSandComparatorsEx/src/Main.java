import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = " ";
        Stack stack = new Stack();

        while (!(line = reader.readLine()).equals("END")) {
            line = line.replaceAll(",", "");
            String[] tokens = line.split("\\s+");

            switch (tokens[0]) {
                case "Push":
                    stack.push(Arrays.stream(tokens).skip(1));

                    break;
                case "Pop":
                    break;
            }

        }


    }
}

