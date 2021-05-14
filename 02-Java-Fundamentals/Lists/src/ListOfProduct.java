import java.util.*;

public class ListOfProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String current = scanner.nextLine();

            products.add(current);

        }

        Collections.sort(products);

        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) +"." + products.get(i));

        }
    }

        private static void printList(List<String> lines){
            for (String item : lines){
                System.out.println(item);
            }
            
        }

}
