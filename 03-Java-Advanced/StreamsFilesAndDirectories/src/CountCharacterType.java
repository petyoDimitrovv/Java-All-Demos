import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class CountCharacterType {

    public static int[] count = new int[3];

    public static void main(String[] args) throws IOException {

        String fileName = "input.txt";

        PrintWriter writer = new PrintWriter("outputCount");

        Scanner scanner = new Scanner(new File(fileName));


        String vowels = "aeiouAEIOU ";
        String punctuations = "!,.?";

        while (scanner.hasNext()){
        String line = scanner.nextLine();
            Arrays.stream(line.split("\\s+"))
                    .forEach(str -> {
                        for (char symbol : str.toCharArray()) {
                            if(vowels.contains(String.valueOf(symbol))){
                                count[0]++;

                            }else if (punctuations.contains(String.valueOf(symbol))){
                                count[2]++;
                            }else {
                                count[1]++;
                            }
                            
                        }

                    } );

        }
        writer.printf("Vowels: %d\n" +
                "Consonants: %d\n" +
                "Punctuation: %d\n",count[0],count[1], count[2]);
        writer.flush();

}
}
