//Encapsulation

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    // 2. Constructor to initialize
    private BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        
    }

    public void deposite(double Amount){
        if(Amount > 0){
            balance = balance+ Amount;
            System.out.println("Deposite $" + Amount);
        }else{
            System.out.println("deposite amount is invalide");
        }
    }
    public void withdraw(int Amount){
        if(Amount > balance){
            System.out.println("Insufficient balance");
            return;
        }
        balance -= Amount;
        System.out.println(Amount + " is withdraw from your Account");
    }
    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        BankAccount BankAccount = new BankAccount(1000, "John Doe", 0);
        BankAccount.deposite(500);
        BankAccount.deposite(500);
        BankAccount.deposite(500);

        BankAccount.withdraw(200);
        
        // System.out.println("Current balance: $" + BankAccount.getBalance());
    }
}
