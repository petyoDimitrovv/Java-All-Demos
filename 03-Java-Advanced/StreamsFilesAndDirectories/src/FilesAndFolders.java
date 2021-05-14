import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;

public class FilesAndFolders {
    public static void main(String[] args) throws IOException {

        String fileName = "C:\\Users\\Petyo\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";

        File dir = new File(fileName);
        traversDir(dir);

}

    private static void traversDir(File dir) {
        System.out.println(dir.getName());
        for (File file : dir.listFiles()) {
            if(file.isDirectory()){
                traversDir(file);
            } else {
                System.out.println(file.getName());
            }
            
        }
    }
}
