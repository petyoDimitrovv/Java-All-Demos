import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractInteger {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);

        PrintWriter write = new PrintWriter("Integer.csv");

        while (scanner.hasNextInt()){
            if(scanner.hasNextInt()) {


                int nextInt = scanner.nextInt();
                write.println(nextInt);
            }else{
                scanner.next();
            }

        }
        write.flush();




    }
}
