import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String parenthneses = scanner.nextLine();

       ArrayDeque<Character> stack = new ArrayDeque<>();
       String lookUpTable = "[{(";
       boolean areBalanced = true;

        for (int i = 0; i < parenthneses.length() ; i++) {
            char symbol = parenthneses.charAt(i);

            if (lookUpTable.contains(symbol + "")) {
                stack.push(symbol);
            } else {
                if (stack.isEmpty()){
                    areBalanced = false;
                    break;
                }
                char top = stack.pop();
                if (!(top == '('&& symbol == ')' ||
                top == '['&& symbol == ']' ||
                top == '{'&& symbol == '}'));
                areBalanced = false;
                break;
            }
        }
        String output = areBalanced ? "YES" : "NO";

    }
}
