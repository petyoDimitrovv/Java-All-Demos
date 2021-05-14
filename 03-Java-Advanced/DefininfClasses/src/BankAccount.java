public class BankAccount {
    private static int idCounter = 1;
    private int Id;
    private double balance;
    private static double interestRate;

    public BankAccount(){
        this.Id = BankAccount.idCounter++;
        this.interestRate = 0.02;
        System.out.println("Account ID" + this.Id + " created");
    }


    public static void setInterestRate(double interest){
        interestRate = interest;

    }

    public double getInterest(int Years){
        return (this.balance * this.interestRate ) * Years ;

    }

   public void deposit(double amount){
        this.balance += amount;
       System.out.println("Deposited " + amount + " to ID" + this.Id);

   }


    public int getId() {
        return this.Id;
    }
}
