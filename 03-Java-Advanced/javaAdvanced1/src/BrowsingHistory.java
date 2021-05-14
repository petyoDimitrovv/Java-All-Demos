import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowsingHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String navigation = scanner.nextLine();
        String currentURL = "";

        while (!navigation.equals("Home")) {

            if(navigation.equals("back")){
                if(!stack.isEmpty()){
                    currentURL = stack.pop();
                } else {
                    System.out.println("No previous URLs");
                    navigation =    scanner.nextLine();
                    continue;
                }

            }else {
                if (!currentURL.isEmpty()) {
                    stack.push(currentURL);
                }
               currentURL= navigation;

            }
            System.out.println(currentURL);
            navigation = scanner.nextLine();
        }


    }
}
