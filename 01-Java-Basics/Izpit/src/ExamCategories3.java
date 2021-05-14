import java.util.Scanner;

public class ExamCategories3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int slojnost = Integer.parseInt(scanner.nextLine());
        int zavurtqnost = Integer.parseInt(scanner.nextLine());
        int stranici = Integer.parseInt(scanner.nextLine());

        if (slojnost >= 80 && zavurtqnost >= 80 && stranici >= 8) {
            System.out.println("Legacy");
        } else if (slojnost >= 80 && zavurtqnost <= 10 && stranici > 0) {
            System.out.println("Master");
        } else if ( slojnost > 0  && zavurtqnost >= 50 && stranici >= 2) {
            System.out.println("Hard");
        } else if (slojnost <= 30 && zavurtqnost >0 && stranici <= 1  ){
            System.out.println("Easy");
        }else if (slojnost <= 10 && zavurtqnost >= 0 && stranici >= 0 ){
            System.out.println("Elementary");
        } else {
            System.out.println("Regular");
        }

    }
}

