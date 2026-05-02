package bank.model;

public class FixedDepositAccount extends SavingsAccount {
    private int durationMonths;

    public FixedDepositAccount(String accountHolder, double balance, double interestRate, int durationMonths) {
        super(accountHolder, balance, interestRate);
        this.durationMonths = durationMonths;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Duration: " + durationMonths + " months");
    }
}
