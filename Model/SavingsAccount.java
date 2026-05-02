package bank.model;

public class SavingsAccount extends Account {
    protected double interestRate;

    public SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance); // super()
        this.interestRate = interestRate; // this
    }

    // Method overriding
    @Override
    public void display() {
        super.display();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
