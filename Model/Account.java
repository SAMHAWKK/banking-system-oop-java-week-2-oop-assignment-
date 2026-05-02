package bank.model;

public class Account {
    protected String accountHolder;
    protected double balance;

    // Constructor
    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    // Final method (cannot be overridden)
    public final void bankPolicy() {
        System.out.println("Bank policy is fixed for all accounts.");
    }
}
