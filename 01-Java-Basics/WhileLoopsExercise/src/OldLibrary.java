import java.util.Scanner;

public class OldLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchBook = scanner.nextLine();
        int countBooks = Integer.parseInt(scanner.nextLine());
        int otherBooks = 0;


        while (countBooks > 0 ){
            String title = scanner.nextLine();

            if (title.equals(searchBook)){
                System.out.printf("You checked %d books and found it.",otherBooks);
                break;
            } else {
                otherBooks++;
                countBooks--;

            }

        } if (countBooks == 0){
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",otherBooks);

        }


    }
}
