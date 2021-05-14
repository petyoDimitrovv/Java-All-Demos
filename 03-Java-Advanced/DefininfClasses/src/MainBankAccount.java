import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainBankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Integer, BankAccount> bankAccounts = new HashMap<>();

        while(!input.equals("End")){
            String[] tokens = input.split("\\s+");

            String command = tokens[0];
            if(command.equals("Create")){
                BankAccount bankAccount = new BankAccount();
                bankAccounts.put(bankAccount.getId(), bankAccount);

            }else if (command.equals("Deposit")) {
                int id = Integer.parseInt(tokens[1]);
                if(bankAccounts.containsKey(id)) {
                    BankAccount bankAccount = bankAccounts.get(id);
                    bankAccount.deposit(Double.parseDouble(tokens[2]));
                }else {
                    System.out.println("Account does not exist");
                }

            }else if (command.equals("SetInterest")){
                double newInterest = Double.parseDouble(tokens[1]);

                BankAccount.setInterestRate(newInterest);
                
            }else {
                int id = Integer.parseInt(tokens[1]);
                if(bankAccounts.containsKey(id)) {
                    BankAccount bankAccount = bankAccounts.get(id);
                    System.out.printf("%.2f%n",bankAccount.getInterest(Integer.parseInt(tokens[2])));
                }else {
                    System.out.println("Account does not exist");
                }


            }
//
//
//            int years = Integer.parseInt(tokens[2]);


            input = scanner.nextLine();

        }

    }
}
