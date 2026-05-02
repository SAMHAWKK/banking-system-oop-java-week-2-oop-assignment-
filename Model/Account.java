package bank.model;

public class Account {
    protected String accountHolder;
    protected double balance;

    
    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    
    public void display() {
        System.out.println("Name: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    
    public final void bankPolicy() {
        System.out.println("Bank policy is fixed for all accounts.");
    }
}
