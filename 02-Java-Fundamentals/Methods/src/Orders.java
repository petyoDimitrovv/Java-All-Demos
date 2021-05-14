import java.util.Scanner;

public class Orders {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        Orders(product, quantity);
    }
    public  static void Orders(String product, int quantity) {

        double price = 0;
          switch (product){
              case"water":
                  price = quantity * 1.00;
                  break;
              case"coffee":
                  price = quantity * 1.50;
                  break;
              case"coke":
                  price = quantity * 1.40;
                  break;
              case"snacks":
                  price = quantity * 2.00;
                  break;


          }
        System.out.println(price);
    }
}
