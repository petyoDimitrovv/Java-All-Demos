import javax.persistence.EntityManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Engine implements Runnable {

    private final EntityManager entityManager;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public Engine(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void run() {
//        String task = "";
//        System.out.println("Please choose a task number from 1 to 13: ");
//
//        try {
//            task = reader.readLine();
//        } catch (IOException e) {
//
//        }
//        try {
//            switch (task) {
//                case "1":
//                    runDemo();
//                    break;
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void runDemo() {
//    }
    }
}
